package net.quedoom.tanrrv.rrv.recipes;

import cc.cassian.rrv.api.recipe.ReliableClientRecipeType;
import cc.cassian.rrv.common.recipe.inventory.RecipeViewMenu;
import cc.cassian.rrv.common.recipe.inventory.SlotContent;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.quedoom.tanrrv.ToughAsNailsRRV;
import net.quedoom.tanrrv.rrv.ReliableClientRecipeWithTransfer;
import org.jspecify.annotations.Nullable;
import toughasnails.api.container.TANContainerTypes;
import toughasnails.client.gui.ThermoregulatorScreen;

import java.util.List;

public class ReliableThermoregulatingRecipe extends ReliableClientRecipeWithTransfer {
    private final SlotContent coldItem, warmItem;

    public ReliableThermoregulatingRecipe(@Nullable TagKey<Item> coldItems, @Nullable TagKey<Item> warmItems) {
        super(List.of(ThermoregulatorScreen.class));
        this.coldItem = coldItems == null ? SlotContent.of() : SlotContent.of(coldItems);
        this.warmItem = warmItems == null ? SlotContent.of() : SlotContent.of(warmItems);
    }

    @Override
    protected ReliableClientRecipeType zeType() {
        return ReliableThermoregulatingRecipeType.INSTANCE;
    }

    @Override
    public Identifier identifier() {
        return ToughAsNailsRRV.id("thermoregulating");
    }

    @Override
    protected void mapRecipesItem(RecipeTransferMap transferMap, AbstractContainerScreen<?> screen) {
        transferMap.linkSlots(0, 0);
        transferMap.linkSlots(1, 1);
    }

    @Override
    public void bindSlots(RecipeViewMenu.SlotFillContext slotFillContext) {
        slotFillContext.bindSlot(0, this.coldItem);
        slotFillContext.bindSlot(1, this.warmItem);
    }

    @Override
    public List<SlotContent> getIngredients() {
        return List.of(this.coldItem, this.warmItem);
    }

    @Override
    public List<SlotContent> getResults() {
        return List.of();
    }
}
