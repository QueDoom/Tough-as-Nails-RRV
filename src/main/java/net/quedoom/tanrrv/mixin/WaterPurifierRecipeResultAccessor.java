package net.quedoom.tanrrv.mixin;

import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import toughasnails.crafting.WaterPurifierRecipe;

@Debug(export = true)
@Mixin(WaterPurifierRecipe.class)
public interface WaterPurifierRecipeResultAccessor {
    @Invoker("result")
    ItemStack francium$result();
}
