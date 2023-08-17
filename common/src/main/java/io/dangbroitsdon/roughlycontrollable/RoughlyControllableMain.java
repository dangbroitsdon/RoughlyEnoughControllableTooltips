package io.dangbroitsdon.roughlycontrollable;

public class RoughlyControllableMain {
    public static final String MOD_ID = "roughlycontrollable";

    public static void init() {
        System.out.println(RoughlyControllableExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
