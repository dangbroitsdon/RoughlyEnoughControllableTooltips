package io.dangbroitsdon.roughlycontrollable.forge;

import dev.architectury.platform.forge.EventBuses;
import io.dangbroitsdon.roughlycontrollable.RoughlyControllableMain;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RoughlyControllableMain.MOD_ID)
public class RoughlyControllableForgeMain {
    public RoughlyControllableForgeMain() {
        EventBuses.registerModEventBus(RoughlyControllableMain.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        RoughlyControllableMain.init();
    }
}
