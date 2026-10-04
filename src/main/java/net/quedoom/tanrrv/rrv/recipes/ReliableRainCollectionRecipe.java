package net.quedoom.tanrrv.rrv.recipes;

import cc.cassian.rrv.api.client.RecipeScreenContext;
import cc.cassian.rrv.api.recipe.ReliableClientRecipeType;
import cc.cassian.rrv.common.recipe.inventory.RecipeViewMenu;
import cc.cassian.rrv.common.recipe.inventory.SlotContent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Items;
import net.quedoom.tanrrv.ToughAsNailsRRV;
import net.quedoom.tanrrv.rrv.ReliableClientRecipeWithoutTransfer;
import toughasnails.api.item.TANItems;

import java.util.List;

public class ReliableRainCollectionRecipe extends ReliableClientRecipeWithoutTransfer {
    private final SlotContent input, output;

    public ReliableRainCollectionRecipe() {
        this.input = SlotContent.of(Items.GLASS_BOTTLE);
        this.output = SlotContent.of(TANItems.PURIFIED_WATER_BOTTLE);
    }
    @Override
    protected ReliableClientRecipeType zeType() {
        return ReliableRainCollectionRecipeType.INSTANCE;
    }

    @Override
    public Identifier identifier() {
        return ToughAsNailsRRV.id("rain_collecting");
    }

    @Override
    public void bindSlots(RecipeViewMenu.SlotFillContext slotFillContext) {
        slotFillContext.bindSlot(0, this.input);
        slotFillContext.bindSlot(1, this.output);

        slotFillContext.addAdditionalStackModifier(1, ((stack, tooltip) -> {
            tooltip.add(ToughAsNailsRRV.translatable("rrv", "rain_collection_output"));
        }));
    }

    @Override
    public List<SlotContent> getIngredients() {
        return List.of(this.input);
    }

    @Override
    public List<SlotContent> getResults() {
        return List.of(this.output);
    }
}
