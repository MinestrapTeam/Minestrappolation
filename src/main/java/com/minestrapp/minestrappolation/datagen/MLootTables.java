package com.minestrapp.minestrappolation.datagen;

import com.minestrapp.minestrappolation.init.MBlocks;
import com.minestrapp.minestrappolation.init.MItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class MLootTables extends BlockLootSubProvider {

    public MLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }


    @Override
    protected void generate() {
        dropOther(MBlocks.COLDSTONE.get(), MBlocks.COBBLE_COLDSTONE.get());
        dropSelf(MBlocks.COBBLE_COLDSTONE.get());
        dropOther(MBlocks.DEEP_COLDSTONE.get(), MBlocks.COBBLE_DEEP_COLDSTONE.get());
        dropSelf(MBlocks.COBBLE_DEEP_COLDSTONE.get());
        dropOther(MBlocks.REDROCK.get(), MBlocks.COBBLE_REDROCK.get());
        dropSelf(MBlocks.COBBLE_REDROCK.get());
        dropOther(MBlocks.DEEP_REDROCK.get(), MBlocks.COBBLE_DEEP_REDROCK.get());
        dropSelf(MBlocks.COBBLE_DEEP_REDROCK.get());
        dropOther(MBlocks.ICESTONE.get(), MBlocks.COBBLE_ICESTONE.get());
        dropSelf(MBlocks.COBBLE_ICESTONE.get());
        dropOther(MBlocks.GLACIERSTONE.get(), MBlocks.COBBLE_GLACIERSTONE.get());
        dropSelf(MBlocks.COBBLE_GLACIERSTONE.get());
        dropOther(MBlocks.CASCADING_DRIPSTONE.get(), MBlocks.COBBLE_OCEANSTONE.get());
        dropSelf(MBlocks.COBBLE_OCEANSTONE.get());
        dropOther(MBlocks.DEEP_OCEANSTONE.get(), MBlocks.COBBLE_DEEP_OCEANSTONE.get());
        dropSelf(MBlocks.COBBLE_DEEP_OCEANSTONE.get());

        add(MBlocks.SALT_ORE.get(), createOreDrop(MBlocks.SALT_ORE.get(), MItems.SALT_CRYSTAL.get()));
        dropSelf(MBlocks.MEURODITE_ORE.get());
        dropSelf(MBlocks.TORITE_ORE.get());
        dropSelf(MBlocks.TIN_ORE.get());
        dropSelf(MBlocks.TITANIUM_ORE.get());
        dropSelf(MBlocks.BLAZIUM_ORE.get());

        add(MBlocks.CABBAGE_CROP.get(), noDrop());
        add(MBlocks.CELERY_CROP.get(), noDrop());
        add(MBlocks.PEPPER_CROP.get(), noDrop());
        add(MBlocks.TOMATO_CROP.get(), noDrop());
        add(MBlocks.ONION_CROP.get(), noDrop());
        add(MBlocks.PEANUT_CROP.get(), noDrop());

        add(MBlocks.BLUEBERRY_BUSH.get(), noDrop());
        add(MBlocks.BLACKBERRY_BUSH.get(), noDrop());
        add(MBlocks.STRAWBERRY_BUSH.get(), noDrop());
        add(MBlocks.RASPBERRY_BUSH.get(), noDrop());

        dropSelf(MBlocks.SALT_BLOCK.get());
        dropSelf(MBlocks.MEURODITE_BLOCK.get());
        dropSelf(MBlocks.TORITE_BLOCK.get());
        dropSelf(MBlocks.TIN_BLOCK.get());
        dropSelf(MBlocks.TITANIUM_BLOCK.get());
        dropSelf(MBlocks.BLAZIUM_BLOCK.get());
        dropSelf(MBlocks.STEEL_BLOCK.get());
        dropSelf(MBlocks.BRONZE_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks(){
        return MBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
