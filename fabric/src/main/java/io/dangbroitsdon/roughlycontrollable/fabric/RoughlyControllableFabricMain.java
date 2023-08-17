package io.dangbroitsdon.roughlycontrollable.fabric;

import io.dangbroitsdon.roughlycontrollable.fabriclike.RoughlyControllableFabricLikeMain;
import net.fabricmc.api.ModInitializer;

public class RoughlyControllableFabricMain implements ModInitializer {
    @Override
    public void onInitialize() {
        RoughlyControllableFabricLikeMain.init();
    }
}
