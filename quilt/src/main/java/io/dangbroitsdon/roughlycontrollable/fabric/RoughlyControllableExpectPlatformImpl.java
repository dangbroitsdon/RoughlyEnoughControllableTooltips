package io.dangbroitsdon.roughlycontrollable.fabric;

import org.quiltmc.loader.api.QuiltLoader;

import java.nio.file.Path;

public class RoughlyControllableExpectPlatformImpl {
    public static Path getConfigDirectory() {
        return QuiltLoader.getConfigDir();
    }
}
