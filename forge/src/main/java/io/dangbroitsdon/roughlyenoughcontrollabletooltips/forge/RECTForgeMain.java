package io.dangbroitsdon.roughlyenoughcontrollabletooltips.forge;

import dev.architectury.platform.forge.EventBuses;
import io.dangbroitsdon.roughlyenoughcontrollabletooltips.RECTMain;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RECTMain.MOD_ID)
public class RECTForgeMain
{
    public RECTForgeMain()
    {
        EventBuses.registerModEventBus(RECTMain.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        RECTMain.init();
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, RECTConfig.CLIENT_CONFIG, "rect-client.toml");
    }
}
