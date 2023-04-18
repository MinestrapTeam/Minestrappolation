package com.minestrapp.minestrappolation.init;

import com.minestrapp.minestrappolation.Minestrappolation;
import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MLootModifier {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Minestrappolation.ID);


    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_ITEM = LOOT_MODIFIER.register("add_item", AddItemModifier.CODEC);

}
