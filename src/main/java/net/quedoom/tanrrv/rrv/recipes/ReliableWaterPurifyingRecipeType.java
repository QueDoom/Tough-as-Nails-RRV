package net.quedoom.tanrrv.rrv.recipes;

import cc.cassian.rrv.common.recipe.inventory.RecipeViewMenu;
import net.minecraft.world.item.ItemStack;
import net.quedoom.tanrrv.rrv.ReliableClientRecipeTypeHelper;
import toughasnails.api.item.TANItems;

import java.util.List;

public class ReliableWaterPurifyingRecipeType extends ReliableClientRecipeTypeHelper {
    public static final ReliableWaterPurifyingRecipeType INSTANCE = new ReliableWaterPurifyingRecipeType();

    protected ReliableWaterPurifyingRecipeType() {
        super(
                "water_purifying",
                List.of(TANItems.WATER_PURIFIER.getDefaultInstance()),
                88, 60
        );
    }

    @Override
    public int getSlotCount() {
        return 3;
    }

    @Override
    public void placeSlots(RecipeViewMenu.SlotDefinition slotDefinition) {
        slotDefinition.addItemSlot(0, 4, 4);
        slotDefinition.addItemSlot(1, 4, 40);
        slotDefinition.addItemSlot(2, 64, 22);
    }
}
