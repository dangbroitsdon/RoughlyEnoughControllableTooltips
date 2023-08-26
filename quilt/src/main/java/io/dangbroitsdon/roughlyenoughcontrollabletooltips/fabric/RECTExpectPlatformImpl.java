package io.dangbroitsdon.roughlyenoughcontrollabletooltips.fabric;

import org.quiltmc.loader.api.QuiltLoader;

import java.nio.file.Path;

public class RECTExpectPlatformImpl {
    public static Path getConfigDirectory() {
        return QuiltLoader.getConfigDir();
    }
}
