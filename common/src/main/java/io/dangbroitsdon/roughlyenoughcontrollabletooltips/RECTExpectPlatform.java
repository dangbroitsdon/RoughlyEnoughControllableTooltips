package io.dangbroitsdon.roughlyenoughcontrollabletooltips;

import dev.architectury.injectables.annotations.ExpectPlatform;

import java.nio.file.Path;

public class RECTExpectPlatform {
    @ExpectPlatform
    public static Path getConfigDirectory() {
        throw new AssertionError();
    }
}
