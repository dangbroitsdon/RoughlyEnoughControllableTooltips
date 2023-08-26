package io.dangbroitsdon.roughlyenoughcontrollabletooltips;

public class RECTMain {
    public static final String MOD_ID = "rect";

    public static void init() {
        System.out.println(RECTExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
