package io.dangbroitsdon.roughlyenoughcontrollabletooltips.forge;

import io.dangbroitsdon.roughlyenoughcontrollabletooltips.RECTMain;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RECTMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RECTConfig
{
    public static ForgeConfigSpec CLIENT_CONFIG;

    public static ForgeConfigSpec.IntValue VIRTUAL_MOUSE_TOOLTIP_X_OFFSET;
    public static ForgeConfigSpec.IntValue VIRTUAL_MOUSE_TOOLTIP_Y_OFFSET;

    private static void setupConfig(ForgeConfigSpec.Builder builder) {
        builder.comment("Configuration allowing the offset of REIs Tooltip showing up on Controllables Virtual Mouse X and Y").push("Virtual Mouse Offset Configuration");

        VIRTUAL_MOUSE_TOOLTIP_X_OFFSET = builder
                .comment("Offset amount for REI's Tooltip showing on Virtual Mouse X")
                .defineInRange("virtualMouseXOffset", 0, -1000, 1000);
        VIRTUAL_MOUSE_TOOLTIP_Y_OFFSET = builder
                .comment("Offset amount for REI's Tooltip showing on Virtual Mouse Y")
                .defineInRange("virtualMouseYOffset", 0, -1000, 1000);

        builder.pop();
    }

    static
    {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        setupConfig(builder);
        CLIENT_CONFIG = builder.build();
    }
}
