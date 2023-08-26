package io.dangbroitsdon.roughlyenoughcontrollabletooltips.fabric;

import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class RECTExpectPlatformImpl {
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
