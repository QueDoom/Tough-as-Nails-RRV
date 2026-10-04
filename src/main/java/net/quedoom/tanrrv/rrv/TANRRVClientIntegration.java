package net.quedoom.tanrrv.rrv;

import cc.cassian.rrv.api.ReliableRecipeViewerClientPlugin;
import cc.cassian.rrv.api.recipe.ItemView;
import cc.cassian.rrv.client.recipe.ClientRecipeManager;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.SingleRecipeInput;
import net.quedoom.tanrrv.ToughAsNailsRRV;
import net.quedoom.tanrrv.mixin.WaterPurifierRecipeResultAccessor;
import net.quedoom.tanrrv.rrv.recipes.ReliableRainCollectionRecipe;
import net.quedoom.tanrrv.rrv.recipes.ReliableThermoregulatingRecipe;
import net.quedoom.tanrrv.rrv.recipes.ReliableWaterPurifyingRecipe;
import toughasnails.api.crafting.TANRecipeTypes;
import toughasnails.crafting.WaterPurifierRecipe;
import toughasnails.init.ModTags;

public class TANRRVClientIntegration implements ReliableRecipeViewerClientPlugin {
    @Override
    public void onIntegrationInitialize() {
        ItemView.addClientRecipeProvider(recipeList -> {
            recipeList.add(new ReliableThermoregulatingRecipe(ModTags.Items.THERMOREGULATOR_COOLING_FUEL, null));
            recipeList.add(new ReliableThermoregulatingRecipe(null, ModTags.Items.THERMOREGULATOR_HEATING_FUEL));
            recipeList.add(new ReliableThermoregulatingRecipe(ModTags.Items.THERMOREGULATOR_COOLING_FUEL, ModTags.Items.THERMOREGULATOR_HEATING_FUEL));
            recipeList.add(new ReliableRainCollectionRecipe());
            var holders = ClientRecipeManager.INSTANCE.getRecipesForType(TANRecipeTypes.WATER_PURIFYING);
            ToughAsNailsRRV.LOGGER.info("Purifier recipes: " + holders.size());
            holders.forEach(recipeHolder -> {
//                if (recipeHolder.value() instanceof WaterPurifierRecipe recipe) {
//                    recipeList.add(new ReliableWaterPurifyingRecipe(recipe.input(), ((WaterPurifierRecipeResultAccessor) recipe).francium$result()));
//                }
                try {
                    if (recipeHolder.value() instanceof WaterPurifierRecipe recipe) {
                        recipeList.add(new ReliableWaterPurifyingRecipe(
                                recipe.input(),
                                ((WaterPurifierRecipeResultAccessor) recipe).francium$result()));
                    }
                } catch (Throwable t) {
                    t.printStackTrace();
                }
            });
        });
    }
}
