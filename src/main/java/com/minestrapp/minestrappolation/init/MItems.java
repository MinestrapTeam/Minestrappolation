package com.minestrapp.minestrappolation.init;

import com.minestrapp.minestrappolation.Minestrappolation;
import com.minestrapp.minestrappolation.items.ItemBase;
import com.minestrapp.minestrappolation.items.ItemBaseWithTip;
import com.minestrapp.minestrappolation.items.SoulGemItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Minestrappolation.ID);

    //FOOD and RELATED
    public static final RegistryObject<Item> SALT_CRYSTAL = ITEMS.register("salt_crystal", () -> new ItemBase(new Item.Properties()));

    public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage", () -> new ItemBase(new Item.Properties().food(Foods.CABBAGE_NUTRITION)));
    public static final RegistryObject<Item> CELERY = ITEMS.register("celery", () -> new ItemBase(new Item.Properties().food(Foods.CELERY_NUTRITION)));
    public static final RegistryObject<Item> PEPPER = ITEMS.register("pepper", () -> new ItemBase(new Item.Properties().food(Foods.PEPPER_NUTRITION)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new ItemBase(new Item.Properties().food(Foods.TOMATO_NUTRITION)));
    public static final RegistryObject<Item> ONION = ITEMS.register("onion", () -> new ItemNameBlockItem(MBlocks.ONION_CROP.get(), (new Item.Properties()).food(Foods.ONION_NUTRITION)));
    public static final RegistryObject<Item> PEANUTS = ITEMS.register("peanuts", () -> new ItemNameBlockItem(MBlocks.PEANUT_CROP.get(), (new Item.Properties()).food(Foods.PEANUTS_NUTRITION)));
    public static final RegistryObject<Item> SEEDS_CABBAGE = ITEMS.register("cabbage_seeds", () -> new ItemNameBlockItem(MBlocks.CABBAGE_CROP.get(), (new Item.Properties())));
    public static final RegistryObject<Item> SEEDS_CELERY = ITEMS.register("celery_seeds", () -> new ItemNameBlockItem(MBlocks.CELERY_CROP.get(), (new Item.Properties())));
    public static final RegistryObject<Item> SEEDS_PEPPER = ITEMS.register("pepper_seeds", () -> new ItemNameBlockItem(MBlocks.PEPPER_CROP.get(), (new Item.Properties())));
    public static final RegistryObject<Item> SEEDS_TOMATO = ITEMS.register("tomato_seeds", () -> new ItemNameBlockItem(MBlocks.TOMATO_CROP.get(), (new Item.Properties())));
    public static final RegistryObject<Item> FRIES = ITEMS.register("fries", () -> new ItemBase(new Item.Properties().food(Foods.FRIES_NUTRITION)));
    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry", () -> new ItemNameBlockItem(MBlocks.BLUEBERRY_BUSH.get(), (new Item.Properties())));
    public static final RegistryObject<Item> BLACKBERRY = ITEMS.register("blackberry", () -> new ItemNameBlockItem(MBlocks.BLACKBERRY_BUSH.get(), (new Item.Properties())));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () -> new ItemNameBlockItem(MBlocks.STRAWBERRY_BUSH.get(), (new Item.Properties())));
    public static final RegistryObject<Item> RASPBERRY = ITEMS.register("raspberry", () -> new ItemNameBlockItem(MBlocks.RASPBERRY_BUSH.get(), (new Item.Properties())));
    public static final RegistryObject<Item> BLUEBERRY_PIE = ITEMS.register("blueberry_pie", () -> new ItemBase(new Item.Properties().food(Foods.BERRY_PIE_NUTRITION)));
    public static final RegistryObject<Item> BLACKBERRY_PIE = ITEMS.register("blackberry_pie", () -> new ItemBase(new Item.Properties().food(Foods.BERRY_PIE_NUTRITION)));
    public static final RegistryObject<Item> STRAWBERRY_PIE = ITEMS.register("strawberry_pie", () -> new ItemBase(new Item.Properties().food(Foods.BERRY_PIE_NUTRITION)));
    public static final RegistryObject<Item> RASPBERRY_PIE = ITEMS.register("raspberry_pie", () -> new ItemBase(new Item.Properties().food(Foods.BERRY_PIE_NUTRITION)));
    public static final RegistryObject<Item> APPLE_PIE = ITEMS.register("apple_pie", () -> new ItemBase(new Item.Properties().food(Foods.BERRY_PIE_NUTRITION)));
    public static final RegistryObject<Item> SALTED_CHICKEN = ITEMS.register("salted_chicken", () -> new ItemBase(new Item.Properties().food(Foods.SALTED_CHICKEN_NUTRITION)));
    public static final RegistryObject<Item> SALTED_MUTTON = ITEMS.register("salted_mutton", () -> new ItemBase(new Item.Properties().food(Foods.SALTED_MUTTON_NUTRITION)));
    public static final RegistryObject<Item> SALTED_PORKCHOP = ITEMS.register("salted_porkchop", () -> new ItemBase(new Item.Properties().food(Foods.SALTED_PORKCHOP_NUTRITION)));
    public static final RegistryObject<Item> SALTED_RABBIT = ITEMS.register("salted_rabbit", () -> new ItemBase(new Item.Properties().food(Foods.SALTED_RABBIT_NUTRITION)));
    public static final RegistryObject<Item> SALTED_STEAK = ITEMS.register("salted_steak", () -> new ItemBase(new Item.Properties().food(Foods.SALTED_STEAK_NUTRITION)));
    public static final RegistryObject<Item> CANDY_BLUE = ITEMS.register("candy_blue", () -> new ItemBaseWithTip(new Item.Properties().food(Foods.CANDY_BLUE_NUTRITION), "This candy has a tingling taste"));
    public static final RegistryObject<Item> CANDY_RED = ITEMS.register("candy_red", () -> new ItemBaseWithTip(new Item.Properties().food(Foods.CANDY_RED_NUTRITION), "This candy has a medicinal taste"));
    public static final RegistryObject<Item> CANDY_YELLOW = ITEMS.register("candy_yellow", () -> new ItemBaseWithTip(new Item.Properties().food(Foods.CANDY_YELLOW_NUTRITION), "This candy has an earthy taste"));
    public static final RegistryObject<Item> PEANUT_BUTTER = ITEMS.register("peanut_butter", () -> new ItemBase((new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).food(Foods.PEANUT_BUTTER_NUTRITION))));
    public static final RegistryObject<Item> HOT_SAUCE = ITEMS.register("hot_sauce", () -> new ItemBase((new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).food(Foods.HOT_SAUCE_NUTRITION))));
    public static final RegistryObject<Item> BERRY_JAM = ITEMS.register("berry_jam", () -> new ItemBase((new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).food(Foods.BERRY_PIE_NUTRITION))));
    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough", () -> new ItemBase((new Item.Properties())));
    public static final RegistryObject<Item> SOUL_GEM = ITEMS.register("soul_gem", () -> new SoulGemItem((new Item.Properties().defaultDurability(1))));

    //INGOTS and MINERALS
    public static final RegistryObject<Item> MEURODITE_GEM = ITEMS.register("meurodite_gem", () -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<Item> TORITE_INGOT = ITEMS.register("torite_ingot", () -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", () -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<Item> BLAZIUM_INGOT = ITEMS.register("blazium_ingot", () -> new ItemBase(new Item.Properties()));

    public static final RegistryObject<Item> TORITE_NUGGET = ITEMS.register("torite_nugget", () -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget", () -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<Item> BLAZIUM_NUGGET = ITEMS.register("blazium_nugget", () -> new ItemBase(new Item.Properties()));

    //TOOLS and WEAPONS
    //TODO Fix all tools and weapons stats

    public static final RegistryObject<Item> COLDSTONE_SWORD = ITEMS.register("coldstone_sword", () -> new SwordItem(Tiers.STONE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> REDROCK_SWORD = ITEMS.register("redrock_sword", () -> new SwordItem(Tiers.STONE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> ICESTONE_SWORD = ITEMS.register("icestone_sword", () -> new SwordItem(Tiers.STONE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> OCEANSTONE_SWORD = ITEMS.register("oceanstone_sword", () -> new SwordItem(Tiers.STONE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> MEURODITE_SWORD = ITEMS.register("meurodite_sword", () -> new SwordItem(MToolTiers.MEURODITE_MAT, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> TORITE_SWORD = ITEMS.register("torite_sword", () -> new SwordItem(MToolTiers.TORITE_MAT, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword", () -> new SwordItem(MToolTiers.TITANIUM_MAT, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(Tiers.STONE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem(Tiers.STONE, 3, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> COLDSTONE_PICKAXE = ITEMS.register("coldstone_pickaxe", () -> new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> REDROCK_PICKAXE = ITEMS.register("redrock_pickaxe", () -> new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> ICESTONE_PICKAXE = ITEMS.register("icestone_pickaxe", () -> new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> OCEANSTONE_PICKAXE = ITEMS.register("oceanstone_pickaxe", () -> new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> MEURODITE_PICKAXE = ITEMS.register("meurodite_pickaxe", () -> new PickaxeItem(MToolTiers.MEURODITE_MAT, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> TORITE_PICKAXE = ITEMS.register("torite_pickaxe", () -> new PickaxeItem(MToolTiers.TORITE_MAT, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe", () -> new PickaxeItem(MToolTiers.TITANIUM_MAT, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(MToolTiers.STEEL_MAT, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(MToolTiers.BRONZE_MAT, 1, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> COLDSTONE_AXE = ITEMS.register("coldstone_axe", () -> new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> REDROCK_AXE = ITEMS.register("redrock_axe", () -> new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> ICESTONE_AXE = ITEMS.register("icestone_axe", () -> new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> OCEANSTONE_AXE = ITEMS.register("oceanstone_axe", () -> new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> MEURODITE_AXE = ITEMS.register("meurodite_axe", () -> new AxeItem(MToolTiers.MEURODITE_MAT, 7.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> TORITE_AXE = ITEMS.register("torite_axe", () -> new AxeItem(MToolTiers.TORITE_MAT, 7.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe", () -> new AxeItem(MToolTiers.TITANIUM_MAT, 7.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(MToolTiers.STEEL_MAT, 7.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(MToolTiers.BRONZE_MAT, 7.0F, -3.2F, new Item.Properties()));

    public static final RegistryObject<Item> COLDSTONE_SHOVEL = ITEMS.register("coldstone_shovel", () -> new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> REDROCK_SHOVEL = ITEMS.register("redrock_shovel", () -> new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> ICESTONE_SHOVEL = ITEMS.register("icestone_shovel", () -> new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> OCEANSTONE_SHOVEL = ITEMS.register("oceanstone_shovel", () -> new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> MEURODITE_SHOVEL = ITEMS.register("meurodite_shovel", () -> new ShovelItem(MToolTiers.MEURODITE_MAT, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> TORITE_SHOVEL = ITEMS.register("torite_shovel", () -> new ShovelItem(MToolTiers.TORITE_MAT, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel", () -> new ShovelItem(MToolTiers.TITANIUM_MAT, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ShovelItem(MToolTiers.STEEL_MAT, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(MToolTiers.BRONZE_MAT, 1.5F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> COLDSTONE_HOE = ITEMS.register("coldstone_hoe", () -> new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> REDROCK_HOE = ITEMS.register("redrock_hoe", () -> new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> ICESTONE_HOE = ITEMS.register("icestone_hoe", () -> new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> OCEANSTONE_HOE = ITEMS.register("oceanstone_hoe", () -> new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> MEURODITE_HOE = ITEMS.register("meurodite_hoe", () -> new HoeItem(MToolTiers.MEURODITE_MAT, -1, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> TORITE_HOE = ITEMS.register("torite_hoe", () -> new HoeItem(MToolTiers.TORITE_MAT, -1, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe", () -> new HoeItem(MToolTiers.TITANIUM_MAT, -1, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe", () -> new HoeItem(MToolTiers.STEEL_MAT, -1, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(MToolTiers.BRONZE_MAT, -1, -2.0F, new Item.Properties()));

    //ARMORS
    public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helmet", () -> new ArmorItem(ArmorTiers.TITANIUM_ARMOR_MAT, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_CHEST = ITEMS.register("titanium_chestplate", () -> new ArmorItem(ArmorTiers.TITANIUM_ARMOR_MAT, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_LEGS = ITEMS.register("titanium_leggings", () -> new ArmorItem(ArmorTiers.TITANIUM_ARMOR_MAT, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_boots", () -> new ArmorItem(ArmorTiers.TITANIUM_ARMOR_MAT, EquipmentSlot.FEET, new Item.Properties()));

    public static final RegistryObject<Item> MEURODITE_HELMET = ITEMS.register("meurodite_helmet", () -> new ArmorItem(ArmorTiers.MEURODITE_ARMOR_MAT, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> MEURODITE_CHEST = ITEMS.register("meurodite_chestplate", () -> new ArmorItem(ArmorTiers.MEURODITE_ARMOR_MAT, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> MEURODITE_LEGS = ITEMS.register("meurodite_leggings", () -> new ArmorItem(ArmorTiers.MEURODITE_ARMOR_MAT, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> MEURODITE_BOOTS = ITEMS.register("meurodite_boots", () -> new ArmorItem(ArmorTiers.MEURODITE_ARMOR_MAT, EquipmentSlot.FEET, new Item.Properties()));

    public static final RegistryObject<Item> TORITE_HELMET = ITEMS.register("torite_helmet", () -> new ArmorItem(ArmorTiers.TORITE_ARMOR_MAT, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> TORITE_CHEST = ITEMS.register("torite_chestplate", () -> new ArmorItem(ArmorTiers.TORITE_ARMOR_MAT, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> TORITE_LEGS = ITEMS.register("torite_leggings", () -> new ArmorItem(ArmorTiers.TORITE_ARMOR_MAT, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> TORITE_BOOTS = ITEMS.register("torite_boots", () -> new ArmorItem(ArmorTiers.TORITE_ARMOR_MAT, EquipmentSlot.FEET, new Item.Properties()));

    public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet", () -> new ArmorItem(ArmorTiers.TIN_ARMOR_MAT, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> TIN_CHEST = ITEMS.register("tin_chestplate", () -> new ArmorItem(ArmorTiers.TIN_ARMOR_MAT, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> TIN_LEGS = ITEMS.register("tin_leggings", () -> new ArmorItem(ArmorTiers.TIN_ARMOR_MAT, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots", () -> new ArmorItem(ArmorTiers.TIN_ARMOR_MAT, EquipmentSlot.FEET, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet", () -> new ArmorItem(ArmorTiers.STEEL_ARMOR_MAT, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_CHEST = ITEMS.register("steel_chestplate", () -> new ArmorItem(ArmorTiers.STEEL_ARMOR_MAT, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_LEGS = ITEMS.register("steel_leggings", () -> new ArmorItem(ArmorTiers.STEEL_ARMOR_MAT, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots", () -> new ArmorItem(ArmorTiers.STEEL_ARMOR_MAT, EquipmentSlot.FEET, new Item.Properties()));

    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ArmorItem(ArmorTiers.BRONZE_ARMOR_MAT, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_CHEST = ITEMS.register("bronze_chestplate", () -> new ArmorItem(ArmorTiers.BRONZE_ARMOR_MAT, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_LEGS = ITEMS.register("bronze_leggings", () -> new ArmorItem(ArmorTiers.BRONZE_ARMOR_MAT, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ArmorItem(ArmorTiers.BRONZE_ARMOR_MAT, EquipmentSlot.FEET, new Item.Properties()));

    public static final RegistryObject<Item> BLAZIUM_HELMET = ITEMS.register("blazium_helmet", () -> new ArmorItem(ArmorTiers.BLAZIUM_ARMOR_MAT, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> BLAZIUM_CHEST = ITEMS.register("blazium_chestplate", () -> new ArmorItem(ArmorTiers.BLAZIUM_ARMOR_MAT, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> BLAZIUM_LEGS = ITEMS.register("blazium_leggings", () -> new ArmorItem(ArmorTiers.BLAZIUM_ARMOR_MAT, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> BLAZIUM_BOOTS = ITEMS.register("blazium_boots", () -> new ArmorItem(ArmorTiers.BLAZIUM_ARMOR_MAT, EquipmentSlot.FEET, new Item.Properties()));


}
