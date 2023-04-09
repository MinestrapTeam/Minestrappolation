package com.minestrapp.minestrappolation.worldgen;

import com.minestrapp.minestrappolation.Minestrappolation;
import com.minestrapp.minestrappolation.init.Blocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COLDSTONE_KEY = registerKey("coldstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DEEP_COLDSTONE_KEY = registerKey("deep_coldstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_REDROCK_KEY = registerKey("redrock");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DEEP_REDROCK_KEY = registerKey("deep_redrock");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ICESTONE_KEY = registerKey("icestone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GLACIERSTONE_KEY = registerKey("glacierstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_OCEANSTONE_KEY = registerKey("oceanstone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DEEP_OCEANSTONE_KEY = registerKey("deep_oceanstone");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SALT_ORE_KEY = registerKey("salt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MEURODITE_ORE_KEY = registerKey("meurodite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TORITE_ORE_KEY = registerKey("torite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TIN_ORE_KEY = registerKey("tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TITANIUM_ORE_KEY = registerKey("titanium_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUEBERRY_BUSH_KEY = registerKey("blueberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACKBERRY_BUSH_KEY = registerKey("blackberry_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STRAWBERRY_BUSH_KEY = registerKey("strawberry_bush");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context){
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);


        List<OreConfiguration.TargetBlockState> overworld_Coldstone = List.of(OreConfiguration.target(stoneReplaceable, Blocks.COLDSTONE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworld_deep_Coldstone = List.of(OreConfiguration.target(deepslateReplaceable, Blocks.DEEP_COLDSTONE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworld_redrock = List.of(OreConfiguration.target(stoneReplaceable, Blocks.REDROCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworld_deep_redrock = List.of(OreConfiguration.target(deepslateReplaceable, Blocks.DEEP_REDROCK.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworld_icestone = List.of(OreConfiguration.target(stoneReplaceable, Blocks.ICESTONE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworld_glacierstone = List.of(OreConfiguration.target(deepslateReplaceable, Blocks.GLACIERSTONE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworld_oceanstone = List.of(OreConfiguration.target(stoneReplaceable, Blocks.OCEANSTONE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworld_deep_oceanstone = List.of(OreConfiguration.target(deepslateReplaceable, Blocks.DEEP_OCEANSTONE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworld_salt_ore = List.of(OreConfiguration.target(stoneReplaceable, Blocks.SALT_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworld_meurodite_ore = List.of(OreConfiguration.target(stoneReplaceable, Blocks.MEURODITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworld_torite_ore = List.of(OreConfiguration.target(stoneReplaceable, Blocks.TORITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworld_tin_ore = List.of(OreConfiguration.target(stoneReplaceable, Blocks.TIN_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworld_titanium_ore = List.of(OreConfiguration.target(stoneReplaceable, Blocks.TITANIUM_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_COLDSTONE_KEY, Feature.ORE, new OreConfiguration(overworld_Coldstone, 50));
        register(context, OVERWORLD_DEEP_COLDSTONE_KEY, Feature.ORE, new OreConfiguration(overworld_deep_Coldstone, 50));
        register(context, OVERWORLD_REDROCK_KEY, Feature.ORE, new OreConfiguration(overworld_redrock, 50));
        register(context, OVERWORLD_DEEP_REDROCK_KEY, Feature.ORE, new OreConfiguration(overworld_deep_redrock, 50));
        register(context, OVERWORLD_ICESTONE_KEY, Feature.ORE, new OreConfiguration(overworld_icestone, 50));
        register(context, OVERWORLD_GLACIERSTONE_KEY, Feature.ORE, new OreConfiguration(overworld_glacierstone, 50));
        register(context, OVERWORLD_OCEANSTONE_KEY, Feature.ORE, new OreConfiguration(overworld_oceanstone, 50));
        register(context, OVERWORLD_DEEP_OCEANSTONE_KEY, Feature.ORE, new OreConfiguration(overworld_deep_oceanstone, 50));

        register(context, OVERWORLD_SALT_ORE_KEY, Feature.ORE, new OreConfiguration(overworld_salt_ore, 20));
        register(context, OVERWORLD_MEURODITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworld_meurodite_ore, 20));
        register(context, OVERWORLD_TORITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworld_torite_ore, 20));
        register(context, OVERWORLD_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(overworld_tin_ore, 20));
        register(context, OVERWORLD_TITANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworld_titanium_ore, 20));

        register(context, BLUEBERRY_BUSH_KEY, Feature.FLOWER, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.BLUEBERRY_BUSH.get())))));
        register(context, BLACKBERRY_BUSH_KEY, Feature.FLOWER, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.BLACKBERRY_BUSH.get())))));
        register(context, STRAWBERRY_BUSH_KEY, Feature.FLOWER, new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.STRAWBERRY_BUSH.get())))));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name){
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Minestrappolation.ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
