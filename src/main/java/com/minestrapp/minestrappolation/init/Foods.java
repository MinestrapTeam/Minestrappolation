package com.minestrapp.minestrappolation.init;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class Foods {

    //TODO Go over nutrition values
    public static final FoodProperties CABBAGE_NUTRITION = new FoodProperties.Builder().nutrition(5).saturationMod(0.3F).build();
    public static final FoodProperties CELERY_NUTRITION = new FoodProperties.Builder().nutrition(2).saturationMod(1.5F).build();
    public static final FoodProperties PEPPER_NUTRITION = new FoodProperties.Builder().nutrition(3).saturationMod(0.3F).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 2), 0.2F).build();
    public static final FoodProperties TOMATO_NUTRITION = new FoodProperties.Builder().nutrition(4).saturationMod(0.3F).build();
    public static final FoodProperties ONION_NUTRITION = new FoodProperties.Builder().nutrition(3).saturationMod(0.8F).effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 100, 0), 0.5F).build();
    public static final FoodProperties PEANUTS_NUTRITION = new FoodProperties.Builder().nutrition(2).saturationMod(2.4F).build();
    public static final FoodProperties FRIES_NUTRITION = new FoodProperties.Builder().nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties SALTED_CHICKEN_NUTRITION = new FoodProperties.Builder().nutrition(8).saturationMod(0.6F).build();
    public static final FoodProperties SALTED_MUTTON_NUTRITION = new FoodProperties.Builder().nutrition(8).saturationMod(0.7F).build();
    public static final FoodProperties SALTED_PORKCHOP_NUTRITION = new FoodProperties.Builder().nutrition(10).saturationMod(0.8F).build();
    public static final FoodProperties SALTED_RABBIT_NUTRITION = new FoodProperties.Builder().nutrition(7).saturationMod(0.6F).build();
    public static final FoodProperties SALTED_STEAK_NUTRITION = new FoodProperties.Builder().nutrition(10).saturationMod(0.8F).build();
    public static final FoodProperties CANDY_BLUE_NUTRITION = new FoodProperties.Builder().nutrition(6).saturationMod(0.6F).fast().alwaysEat().effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 1F).build();
    public static final FoodProperties CANDY_RED_NUTRITION = new FoodProperties.Builder().nutrition(6).saturationMod(0.6F).fast().alwaysEat().effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 1F).build();
    public static final FoodProperties CANDY_YELLOW_NUTRITION = new FoodProperties.Builder().nutrition(6).saturationMod(0.6F).fast().alwaysEat().effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 1), 1F).build();
    public static final FoodProperties BERRY_PIE_NUTRITION = new FoodProperties.Builder().nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties HOT_SAUCE_NUTRITION = new FoodProperties.Builder().nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties PEANUT_BUTTER_NUTRITION = new FoodProperties.Builder().nutrition(6).saturationMod(0.6F).build();
    public static final FoodProperties JAM_NUTRITION = new FoodProperties.Builder().nutrition(6).saturationMod(0.6F).build();
}
