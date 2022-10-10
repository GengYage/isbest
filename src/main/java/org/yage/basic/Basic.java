package org.yage.basic;

import net.fabricmc.api.ModInitializer;
import org.yage.basic.utils.global.LoggerUtils;

public class Basic implements ModInitializer {
    @Override
    public void onInitialize() {
        LoggerUtils.getLogger().info("entry point");
    }
}
