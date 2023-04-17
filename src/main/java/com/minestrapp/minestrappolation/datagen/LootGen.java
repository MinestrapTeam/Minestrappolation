package com.minestrapp.minestrappolation.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class LootGen{

    public static LootTableProvider create(PackOutput output){
        return new LootTableProvider(output, Set.of(),
                List.of(new LootTableProvider.SubProviderEntry(MLootTables::new, LootContextParamSets.BLOCK)));
    }


}
