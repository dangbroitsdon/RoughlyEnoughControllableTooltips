package io.dangbroitsdon.roughlyenoughcontrollabletooltips.forge;

import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class RECTExpectPlatformImpl
{
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
