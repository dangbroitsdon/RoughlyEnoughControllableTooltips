package io.dangbroitsdon.roughlycontrollable.fabric;

import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class RoughlyControllableExpectPlatformImpl {
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
