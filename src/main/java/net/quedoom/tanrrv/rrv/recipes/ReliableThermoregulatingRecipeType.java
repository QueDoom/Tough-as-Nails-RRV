package net.quedoom.tanrrv.rrv.recipes;

import cc.cassian.rrv.common.recipe.inventory.RecipeViewMenu;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.quedoom.tanrrv.rrv.ReliableClientRecipeTypeHelper;
import toughasnails.api.item.TANItems;

import java.util.List;

public class ReliableThermoregulatingRecipeType extends ReliableClientRecipeTypeHelper {
    public static final ReliableThermoregulatingRecipeType INSTANCE = new ReliableThermoregulatingRecipeType();

    protected ReliableThermoregulatingRecipeType() {
        super(
                "thermoregulating",
                List.of(TANItems.THERMOREGULATOR.getDefaultInstance()),
                96, 45
        );
    }

    @Override
    public int getSlotCount() {
        return 2;
    }

    @Override
    public void placeSlots(RecipeViewMenu.SlotDefinition slotDefinition) {
        slotDefinition.addItemSlot(0, 4, 18);
        slotDefinition.addItemSlot(1, 76, 18);
    }
}
