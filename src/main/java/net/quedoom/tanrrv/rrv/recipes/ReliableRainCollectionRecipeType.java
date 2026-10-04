package net.quedoom.tanrrv.rrv.recipes;

import cc.cassian.rrv.common.recipe.inventory.RecipeViewMenu;
import net.minecraft.world.item.ItemStack;
import net.quedoom.tanrrv.rrv.ReliableClientRecipeTypeHelper;
import toughasnails.api.item.TANItems;

import java.util.List;

public class ReliableRainCollectionRecipeType extends ReliableClientRecipeTypeHelper {
    public static final ReliableRainCollectionRecipeType INSTANCE = new ReliableRainCollectionRecipeType();

    protected ReliableRainCollectionRecipeType() {
        super(
                "rain_collecting",
                List.of(TANItems.RAIN_COLLECTOR.getDefaultInstance()),
                32, 68
        );
    }

    @Override
    public int getSlotCount() {
        return 2;
    }

    @Override
    public void placeSlots(RecipeViewMenu.SlotDefinition slotDefinition) {
        slotDefinition.addItemSlot(0, 7, 4);
        slotDefinition.addItemSlot(1, 8, 44);
    }
}
