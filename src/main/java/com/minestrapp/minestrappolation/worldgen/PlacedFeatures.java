package com.minestrapp.minestrappolation.worldgen;

import com.minestrapp.minestrappolation.Minestrappolation;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class PlacedFeatures {

    public static final ResourceKey<PlacedFeature> COLDSTONE_PLACED_KEY = createKey("coldstone_placed");
    public static final ResourceKey<PlacedFeature> DEEP_COLDSTONE_PLACED_KEY = createKey("deep_coldstone_placed");
    public static final ResourceKey<PlacedFeature> REDROCK_PLACED_KEY = createKey("redrock_placed");
    public static final ResourceKey<PlacedFeature> DEEP_REDROCK_PLACED_KEY = createKey("deep_redrock_placed");
    public static final ResourceKey<PlacedFeature> ICESTONE_PLACED_KEY = createKey("icestone_placed");
    public static final ResourceKey<PlacedFeature> GLACIERSTONE_PLACED_KEY = createKey("glacierstone_placed");
    public static final ResourceKey<PlacedFeature> OCEANSTONE_PLACED_KEY = createKey("oceanstone_placed");
    public static final ResourceKey<PlacedFeature> DEEP_OCEANSTONE_PLACED_KEY = createKey("deep_oceanstone_placed");

    public static final ResourceKey<PlacedFeature> SALT_ORE_PLACED_KEY = createKey("salt_ore_placed");
    public static final ResourceKey<PlacedFeature> MEURODITE_ORE_PLACED_KEY = createKey("meurodite_ore_placed");
    public static final ResourceKey<PlacedFeature> TORITE_ORE_PLACED_KEY = createKey("torite_ore_placed");
    public static final ResourceKey<PlacedFeature> TIN_ORE_PLACED_KEY = createKey("tin_ore_placed");
    public static final ResourceKey<PlacedFeature> TITANIUM_ORE_PLACED_KEY = createKey("titanium_ore_placed");


    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, COLDSTONE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.OVERWORLD_COLDSTONE_KEY), OreReplacement.commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(1), VerticalAnchor.absolute(160))));
        register(context, DEEP_COLDSTONE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.OVERWORLD_DEEP_COLDSTONE_KEY), OreReplacement.commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(0))));
        register(context, REDROCK_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.OVERWORLD_REDROCK_KEY), OreReplacement.commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(1), VerticalAnchor.absolute(160))));
        register(context, DEEP_REDROCK_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.OVERWORLD_DEEP_REDROCK_KEY), OreReplacement.commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(0))));
        register(context, ICESTONE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.OVERWORLD_ICESTONE_KEY), OreReplacement.commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(1), VerticalAnchor.absolute(160))));
        register(context, GLACIERSTONE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.OVERWORLD_GLACIERSTONE_KEY), OreReplacement.commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(0))));
        register(context, OCEANSTONE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.OVERWORLD_OCEANSTONE_KEY), OreReplacement.commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(1), VerticalAnchor.absolute(160))));
        register(context, DEEP_OCEANSTONE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.OVERWORLD_DEEP_OCEANSTONE_KEY), OreReplacement.commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(0))));

        register(context, SALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.OVERWORLD_SALT_ORE_KEY), OreReplacement.commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(320))));
        register(context, MEURODITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.OVERWORLD_MEURODITE_ORE_KEY), OreReplacement.commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(320))));
        register(context, TORITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.OVERWORLD_TORITE_ORE_KEY), OreReplacement.commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(320))));
        register(context, TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.OVERWORLD_TIN_ORE_KEY), OreReplacement.commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(320))));
        register(context, TITANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeatures.OVERWORLD_TITANIUM_ORE_KEY), OreReplacement.commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-64), VerticalAnchor.absolute(320))));

    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Minestrappolation.ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
