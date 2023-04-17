package com.minestrapp.minestrappolation.init;

import com.minestrapp.minestrappolation.MArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorTiers {
    public static final ArmorMaterial TITANIUM_ARMOR_MAT = new MArmorMaterial("titanium", 35, new int[] { 3, 6, 8, 3 }, 30, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0f, 0.3f, () -> Ingredient.of(MItems.TITANIUM_INGOT.get()));
    public static final ArmorMaterial MEURODITE_ARMOR_MAT = new MArmorMaterial("meurodite", 15, new int[] { 2, 6, 6, 2 }, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.of(MItems.MEURODITE_GEM.get()));
    public static final ArmorMaterial TORITE_ARMOR_MAT = new MArmorMaterial("torite", 15, new int[] { 2, 6, 6, 2 }, 18, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.of(MItems.TORITE_INGOT.get()));
    public static final ArmorMaterial TIN_ARMOR_MAT = new MArmorMaterial("tin", 10, new int[] { 1, 2, 3, 1 }, 5, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.of(MItems.TIN_INGOT.get()));
    public static final ArmorMaterial STEEL_ARMOR_MAT = new MArmorMaterial("steel", 30, new int[] { 3, 5, 7, 3 }, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.5f, () -> Ingredient.of(MItems.STEEL_INGOT.get()));
    public static final ArmorMaterial BRONZE_ARMOR_MAT = new MArmorMaterial("bronze", 15, new int[] { 2, 5, 6, 2 }, 9, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0f, 0.0f, () -> Ingredient.of(MItems.BRONZE_INGOT.get()));
    public static final ArmorMaterial BLAZIUM_ARMOR_MAT = new MArmorMaterial("blazium", 25, new int[] { 2, 6, 7, 2 }, 40, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0f, 0.3f, () -> Ingredient.of(MItems.BLAZIUM_INGOT.get()));

}