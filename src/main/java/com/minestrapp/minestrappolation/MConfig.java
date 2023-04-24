package com.minestrapp.minestrappolation;

import net.minecraftforge.common.ForgeConfigSpec;

public class MConfig {

    public static final ForgeConfigSpec GENERAL_SPEC;

    public static  ForgeConfigSpec.IntValue maxGemLevel;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        setupConfig(builder);
        GENERAL_SPEC = builder.build();
    }

    private static void setupConfig(ForgeConfigSpec.Builder builder){
        maxGemLevel = builder.comment("Max mount of levels a gem can store").defineInRange("maxgemlevel", 5, 1, 100);
    }
}
