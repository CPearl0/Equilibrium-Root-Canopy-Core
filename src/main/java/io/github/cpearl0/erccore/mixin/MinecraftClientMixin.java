package io.github.cpearl0.erccore.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Minecraft.class)
public class MinecraftClientMixin {
    @Inject(method = "createTitle", at = @At("HEAD"), cancellable = true)
    private void ERC$modifyTitle(CallbackInfoReturnable<String> cir) {
        cir.setReturnValue("Equilibrium: Root & Canopy");
    }
}
