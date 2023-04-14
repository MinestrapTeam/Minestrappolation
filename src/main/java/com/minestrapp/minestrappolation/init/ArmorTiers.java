package com.minestrapp.minestrappolation.init;

import com.minestrapp.minestrappolation.MArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorTiers {
    public static final ArmorMaterial TITANIUM_ARMOR_MAT = new MArmorMaterial("titanium", 500, new int[] { 20, 40, 50, 10 }, 300, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.of(MItems.TITANIUM_INGOT.get()));
    public static final ArmorMaterial MEURODITE_ARMOR_MAT = new MArmorMaterial("meurodite", 500, new int[] { 20, 40, 50, 10 }, 300, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.of(MItems.MEURODITE_GEM.get()));
    public static final ArmorMaterial TORITE_ARMOR_MAT = new MArmorMaterial("torite", 500, new int[] { 20, 40, 50, 10 }, 300, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.of(MItems.TORITE_INGOT.get()));
    public static final ArmorMaterial TIN_ARMOR_MAT = new MArmorMaterial("tin", 500, new int[] { 20, 40, 50, 10 }, 300, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.of(MItems.TIN_INGOT.get()));
    public static final ArmorMaterial STEEL_ARMOR_MAT = new MArmorMaterial("steel", 500, new int[] { 20, 40, 50, 10 }, 300, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.of(MItems.STEEL_INGOT.get()));
    public static final ArmorMaterial BRONZE_ARMOR_MAT = new MArmorMaterial("bronze", 500, new int[] { 20, 40, 50, 10 }, 300, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.of(MItems.BRONZE_INGOT.get()));
}
