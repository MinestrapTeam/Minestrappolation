package com.minestrapp.minestrappolation.init;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class MToolTiers {

    public static final Tier TIN_MAT = new ForgeTier(1, 200, 4.0F, 1.0F, 14, null, () -> Ingredient.of(MItems.TIN_INGOT.get()));
    public static final Tier MEURODITE_MAT = new ForgeTier(3, 675, 8.0F, 2.0F, 14, null, () -> Ingredient.of(MItems.MEURODITE_GEM.get()));
    public static final Tier TORITE_MAT = new ForgeTier(3, 675, 8.0F, 2.0F, 14, null, () -> Ingredient.of(MItems.TORITE_INGOT.get()));
    public static final Tier TITANIUM_MAT = new ForgeTier(4, 1650, 8.5F, 4.0F, 18, null, () -> Ingredient.of(MItems.TITANIUM_INGOT.get()));
    public static final Tier STEEL_MAT = new ForgeTier(3, 2100, 4.0F, 3.0F, 5, null, () -> Ingredient.of(MItems.STEEL_INGOT.get()));
    public static final Tier BRONZE_MAT = new ForgeTier(2, 325, 5.0F, 2.0F, 5, null, () -> Ingredient.of(MItems.BRONZE_INGOT.get()));
    public static final Tier BLAZIUM_MAT = new ForgeTier(3, 150, 10.0F, 4.0F, 15, null, () -> Ingredient.of(MItems.BLAZIUM_INGOT.get()));
}
