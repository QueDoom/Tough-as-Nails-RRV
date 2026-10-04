package net.quedoom.tanrrv.rrv.recipes;

import cc.cassian.rrv.api.recipe.ReliableClientRecipeType;
import cc.cassian.rrv.common.recipe.inventory.RecipeViewMenu;
import cc.cassian.rrv.common.recipe.inventory.SlotContent;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.Items;
import net.quedoom.tanrrv.ToughAsNailsRRV;
import net.quedoom.tanrrv.rrv.ReliableClientRecipeWithTransfer;
import toughasnails.api.item.TANItems;
import toughasnails.block.entity.WaterPurifierBlockEntity;
import toughasnails.client.gui.WaterPurifierScreen;
import toughasnails.init.ModTags;

import java.util.List;
import java.util.Map;

public class ReliableWaterPurifyingRecipe extends ReliableClientRecipeWithTransfer {
    private final SlotContent thingToPurify, filter, result;
    private final int purifyTime;

    protected ReliableWaterPurifyingRecipe(Item thingToPurify, Item filter) {
        super(List.of(WaterPurifierScreen.class));
        this.thingToPurify = SlotContent.of(thingToPurify);
        this.filter = SlotContent.of(filter);
        this.purifyTime = WaterPurifierBlockEntity.getFilterDuration(filter.getDefaultInstance());
        this.result = SlotContent.of(thingToPurify.getCraftingRemainder());
    }

    public ReliableWaterPurifyingRecipe(ItemStack thingToPurify, ItemStack result) {
        super(List.of(WaterPurifierScreen.class));
        this.thingToPurify = SlotContent.of(thingToPurify);
        this.filter = SlotContent.ofItemList(List.of(
                Items.SHORT_GRASS,
                Items.PAPER,
                Items.GRAVEL,
                Items.SAND,
                Items.RED_SAND,
                Items.CHARCOAL,
                Items.PRISMARINE_CRYSTALS,
                Items.HEART_OF_THE_SEA
        ));
        this.purifyTime = 0;
        this.result = SlotContent.of(result);
    }

    @Override
    protected ReliableClientRecipeType zeType() {
        return ReliableWaterPurifyingRecipeType.INSTANCE;
    }

    @Override
    public Identifier identifier() {
        return ToughAsNailsRRV.id("water_purifying");
    }

    @Override
    protected void mapRecipesItem(RecipeTransferMap transferMap, AbstractContainerScreen<?> screen) {
        transferMap.linkSlots(0, 0);
        transferMap.linkSlots(1, 1);
    }

    @Override
    public void bindSlots(RecipeViewMenu.SlotFillContext slotFillContext) {
        slotFillContext.bindSlot(0, this.thingToPurify);
        slotFillContext.bindSlot(1, this.filter);
        slotFillContext.bindSlot(2, this.result);
    }

    @Override
    public List<SlotContent> getIngredients() {
        return List.of(this.thingToPurify, this.filter);
    }

    @Override
    public List<SlotContent> getResults() {
        return List.of(this.result);
    }
}
