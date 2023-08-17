package io.dangbroitsdon.roughlycontrollable.forge.mixins.client;

import com.mrcrayfish.controllable.Controllable;
import com.mrcrayfish.controllable.client.ControllerInput;
import me.shedaniel.rei.impl.client.gui.forge.ScreenOverlayImplForge;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(ScreenOverlayImplForge.class)
public class MixinScreenOverlayImplForge {

    @ModifyArg(method = "renderTooltipInner", at = @At(value = "INVOKE", target = "net/minecraft/client/gui/screens/Screen.renderTooltipInternal (Lcom/mojang/blaze3d/vertex/PoseStack;Ljava/util/List;II)V"), index = 2)
    private int adjustMouseX(int x) {
        ControllerInput input = Controllable.getInput();
        Minecraft mc = Minecraft.getInstance();

        if(Controllable.getController() != null && input.getLastUse() > 0)
        {
            x = (int) input.getVirtualMouseX() * mc.getWindow().getGuiScaledWidth() / mc.getWindow().getScreenWidth();
            return x;
        }

        return x;
    }

    @ModifyArg(method = "renderTooltipInner", at = @At(value = "INVOKE", target = "net/minecraft/client/gui/screens/Screen.renderTooltipInternal (Lcom/mojang/blaze3d/vertex/PoseStack;Ljava/util/List;II)V"), index = 3)
    private int adjustMouseY(int y) {
        ControllerInput input = Controllable.getInput();
        Minecraft mc = Minecraft.getInstance();

        if(Controllable.getController() != null && input.getLastUse() > 0)
        {
            y = (int) input.getVirtualMouseY() * mc.getWindow().getGuiScaledHeight() / mc.getWindow().getScreenHeight();
            return y;
        }

        return y;
    }
}
