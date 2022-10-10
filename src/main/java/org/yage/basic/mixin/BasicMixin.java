package org.yage.basic.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.yage.basic.utils.global.LoggerUtils;

@Mixin(TitleScreen.class)
public class BasicMixin {

    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo callbackInfo) {
        LoggerUtils.getLogger().info("set screen title failed. {}", callbackInfo);
    }
}
