package com.minestrapp.minestrappolation.init;

import com.minestrapp.minestrappolation.MArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorTiers {
    public static final ArmorMaterial TITANIUM_ARMOR_MAT = new MArmorMaterial("titanium", 500, new int[] { 20, 40, 50, 10 }, 300, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.of(Items.TITANIUM_INGOT.get()));
    public static final ArmorMaterial MEURODITE_ARMOR_MAT = new MArmorMaterial("meurodite", 500, new int[] { 20, 40, 50, 10 }, 300, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.of(Items.MEURODITE_GEM.get()));
    public static final ArmorMaterial TORITE_ARMOR_MAT = new MArmorMaterial("torite", 500, new int[] { 20, 40, 50, 10 }, 300, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.of(Items.TORITE_INGOT.get()));
    public static final ArmorMaterial TIN_ARMOR_MAT = new MArmorMaterial("tin", 500, new int[] { 20, 40, 50, 10 }, 300, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.of(Items.TIN_INGOT.get()));
}
