package io.dangbroitsdon.roughlyenoughcontrollabletooltips.quilt;

import io.dangbroitsdon.roughlyenoughcontrollabletooltips.fabriclike.RECTFabricLikeMain;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class RECTQuiltMain implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        RECTFabricLikeMain.init();
    }
}
