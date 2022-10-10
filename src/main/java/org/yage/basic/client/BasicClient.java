package org.yage.basic.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.yage.basic.utils.global.LoggerUtils;

@Environment(EnvType.CLIENT)
public class BasicClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        LoggerUtils.getLogger().info("{}", "mod init info");
    }
}
