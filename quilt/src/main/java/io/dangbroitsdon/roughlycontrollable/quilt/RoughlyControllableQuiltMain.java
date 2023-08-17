package io.dangbroitsdon.roughlycontrollable.quilt;

import io.dangbroitsdon.roughlycontrollable.fabriclike.RoughlyControllableFabricLikeMain;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class RoughlyControllableQuiltMain implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        RoughlyControllableFabricLikeMain.init();
    }
}
