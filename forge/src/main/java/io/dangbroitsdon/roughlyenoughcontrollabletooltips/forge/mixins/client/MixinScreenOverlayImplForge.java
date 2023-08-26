package io.dangbroitsdon.roughlyenoughcontrollabletooltips.forge.mixins.client;

import com.mrcrayfish.controllable.Controllable;
import com.mrcrayfish.controllable.client.ControllerInput;
import io.dangbroitsdon.roughlyenoughcontrollabletooltips.forge.RECTConfig;
import me.shedaniel.rei.impl.client.gui.forge.ScreenOverlayImplForge;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(ScreenOverlayImplForge.class)
public class MixinScreenOverlayImplForge
{

    @ModifyArgs(method = "renderTooltipInner", at = @At(value = "INVOKE", target = "net/minecraft/client/gui/screens/Screen.renderTooltipInternal (Lcom/mojang/blaze3d/vertex/PoseStack;Ljava/util/List;II)V"))
    private void rect$adjustMouseXY(Args args)
    {
        int mouseX = args.get(2);
        int mouseY = args.get(3);

        Minecraft mc = Minecraft.getInstance();

        if(Controllable.getController() == null)
        {
            args.set(2, mouseX);
            args.set(3, mouseY);
            return;
        }

        ControllerInput input = Controllable.getInput();

        if(input.getLastUse() > 0)
        {
            mouseX = (int) input.getVirtualMouseX() * mc.getWindow().getGuiScaledWidth() / mc.getWindow().getScreenWidth() + RECTConfig.VIRTUAL_MOUSE_TOOLTIP_X_OFFSET.get();
            mouseY = (int) input.getVirtualMouseY() * mc.getWindow().getGuiScaledHeight() / mc.getWindow().getScreenHeight() + RECTConfig.VIRTUAL_MOUSE_TOOLTIP_Y_OFFSET.get();

            args.set(2, mouseX);
            args.set(3, mouseY);
        }
    }
}
