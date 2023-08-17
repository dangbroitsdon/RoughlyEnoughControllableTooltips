package io.dangbroitsdon.roughlycontrollable.forge;

import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class RoughlyControllableExpectPlatformImpl {
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
