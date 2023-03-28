package com.minestrapp.minestrappolation.init;

import com.minestrapp.minestrappolation.MArmorMaterial;
import com.minestrapp.minestrappolation.Minestrappolation;
import com.minestrapp.minestrappolation.items.ItemBase;
import com.minestrapp.minestrappolation.items.ItemBaseWithTip;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Minestrappolation.ID);

    //FOOD and RELATED
    public static final RegistryObject<Item> SALT_CRYSTAL = ITEMS.register("salt_crystal", () -> new ItemBase(new Item.Properties()));

    public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage", () -> new ItemBase(new Item.Properties().food(Foods.CABBAGE_NUTRITION)));
    public static final RegistryObject<Item> CELERY = ITEMS.register("celery", () -> new ItemBase(new Item.Properties().food(Foods.CELERY_NUTRITION)));
    public static final RegistryObject<Item> PEPPER = ITEMS.register("pepper", () -> new ItemBase(new Item.Properties().food(Foods.PEPPER_NUTRITION)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new ItemBase(new Item.Properties().food(Foods.TOMATO_NUTRITION)));
    public static final RegistryObject<Item> ONION = ITEMS.register("onion", () -> new ItemNameBlockItem(Blocks.ONION_CROP.get(), (new Item.Properties()).food(Foods.ONION_NUTRITION)));
    public static final RegistryObject<Item> PEANUTS = ITEMS.register("peanuts", () -> new ItemNameBlockItem(Blocks.PEANUT_CROP.get(), (new Item.Properties()).food(Foods.PEANUTS_NUTRITION)));
    public static final RegistryObject<Item> SEEDS_CABBAGE = ITEMS.register("cabbage_seeds", () -> new ItemNameBlockItem(Blocks.CABBAGE_CROP.get(), (new Item.Properties())));
    public static final RegistryObject<Item> SEEDS_CELERY = ITEMS.register("celery_seeds", () -> new ItemNameBlockItem(Blocks.CELERY_CROP.get(), (new Item.Properties())));
    public static final RegistryObject<Item> SEEDS_PEPPER = ITEMS.register("pepper_seeds", () -> new ItemNameBlockItem(Blocks.PEPPER_CROP.get(), (new Item.Properties())));
    public static final RegistryObject<Item> SEEDS_TOMATO = ITEMS.register("tomato_seeds", () -> new ItemNameBlockItem(Blocks.TOMATO_CROP.get(), (new Item.Properties())));
    public static final RegistryObject<Item> FRIES = ITEMS.register("fries", () -> new ItemBase(new Item.Properties().food(Foods.FRIES_NUTRITION)));
    public static final RegistryObject<Item> SALTED_CHICKEN = ITEMS.register("salted_chicken", () -> new ItemBase(new Item.Properties().food(Foods.SALTED_CHICKEN_NUTRITION)));
    public static final RegistryObject<Item> SALTED_MUTTON = ITEMS.register("salted_mutton", () -> new ItemBase(new Item.Properties().food(Foods.SALTED_MUTTON_NUTRITION)));
    public static final RegistryObject<Item> SALTED_PORKCHOP = ITEMS.register("salted_porkchop", () -> new ItemBase(new Item.Properties().food(Foods.SALTED_PORKCHOP_NUTRITION)));
    public static final RegistryObject<Item> SALTED_RABBIT = ITEMS.register("salted_rabbit", () -> new ItemBase(new Item.Properties().food(Foods.SALTED_RABBIT_NUTRITION)));
    public static final RegistryObject<Item> SALTED_STEAK = ITEMS.register("salted_steak", () -> new ItemBase(new Item.Properties().food(Foods.SALTED_STEAK_NUTRITION)));
    public static final RegistryObject<Item> CANDY_BLUE = ITEMS.register("candy_blue", () -> new ItemBaseWithTip(new Item.Properties().food(Foods.CANDY_BLUE_NUTRITION), "This candy has a tingling taste"));
    public static final RegistryObject<Item> CANDY_RED = ITEMS.register("candy_red", () -> new ItemBaseWithTip(new Item.Properties().food(Foods.CANDY_RED_NUTRITION), "This candy has a medicinal taste"));
    public static final RegistryObject<Item> CANDY_YELLOW = ITEMS.register("candy_yellow", () -> new ItemBaseWithTip(new Item.Properties().food(Foods.CANDY_YELLOW_NUTRITION), "This candy has an earthy taste"));

    //INGOTS and MINERALS
    public static final RegistryObject<Item> MEURODITE_GEM = ITEMS.register("meurodite_gem", () -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<Item> TORITE_INGOT = ITEMS.register("torite_ingot", () -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new ItemBase(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", () -> new ItemBase(new Item.Properties()));

    //TOOLS and WEAPONS
    //TODO Fix all tools and weapons stats
    public static final RegistryObject<Item> COLDSTONE_SWORD = ITEMS.register("coldstone_sword", () -> new SwordItem(Tiers.STONE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> REDROCK_SWORD = ITEMS.register("redrock_sword", () -> new SwordItem(Tiers.STONE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> ICESTONE_SWORD = ITEMS.register("icestone_sword", () -> new SwordItem(Tiers.STONE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> OCEANSTONE_SWORD = ITEMS.register("oceanstone_sword", () -> new SwordItem(Tiers.STONE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> MEURODITE_SWORD = ITEMS.register("meurodite_sword", () -> new SwordItem(Tiers.STONE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> TORITE_SWORD = ITEMS.register("torite_sword", () -> new SwordItem(Tiers.STONE, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword", () -> new SwordItem(Tiers.STONE, 3, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> COLDSTONE_PICKAXE = ITEMS.register("coldstone_pickaxe", () -> new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> REDROCK_PICKAXE = ITEMS.register("redrock_pickaxe", () -> new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> ICESTONE_PICKAXE = ITEMS.register("icestone_pickaxe", () -> new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> OCEANSTONE_PICKAXE = ITEMS.register("oceanstone_pickaxe", () -> new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> MEURODITE_PICKAXE = ITEMS.register("meurodite_pickaxe", () -> new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> TORITE_PICKAXE = ITEMS.register("torite_pickaxe", () -> new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe", () -> new PickaxeItem(Tiers.STONE, 1, -2.8F, new Item.Properties()));

    public static final RegistryObject<Item> COLDSTONE_AXE = ITEMS.register("coldstone_axe", () -> new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> REDROCK_AXE = ITEMS.register("redrock_axe", () -> new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> ICESTONE_AXE = ITEMS.register("icestone_axe", () -> new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> OCEANSTONE_AXE = ITEMS.register("oceanstone_axe", () -> new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> MEURODITE_AXE = ITEMS.register("meurodite_axe", () -> new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> TORITE_AXE = ITEMS.register("torite_axe", () -> new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe", () -> new AxeItem(Tiers.STONE, 7.0F, -3.2F, new Item.Properties()));

    public static final RegistryObject<Item> COLDSTONE_SHOVEL = ITEMS.register("coldstone_shovel", () -> new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> REDROCK_SHOVEL = ITEMS.register("redrock_shovel", () -> new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> ICESTONE_SHOVEL = ITEMS.register("icestone_shovel", () -> new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> OCEANSTONE_SHOVEL = ITEMS.register("oceanstone_shovel", () -> new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> MEURODITE_SHOVEL = ITEMS.register("meurodite_shovel", () -> new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> TORITE_SHOVEL = ITEMS.register("torite_shovel", () -> new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel", () -> new ShovelItem(Tiers.STONE, 1.5F, -3.0F, new Item.Properties()));

    public static final RegistryObject<Item> COLDSTONE_HOE = ITEMS.register("coldstone_hoe", () -> new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> REDROCK_HOE = ITEMS.register("redrock_hoe", () -> new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> ICESTONE_HOE = ITEMS.register("icestone_hoe", () -> new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> OCEANSTONE_HOE = ITEMS.register("oceanstone_hoe", () -> new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> MEURODITE_HOE = ITEMS.register("meurodite_hoe", () -> new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> TORITE_HOE = ITEMS.register("torite_hoe", () -> new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe", () -> new HoeItem(Tiers.STONE, -1, -2.0F, new Item.Properties()));

    //ARMORS
    public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helm", () -> new ArmorItem(ArmorTiers.TITANIUM_ARMOR_MAT, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_CHEST = ITEMS.register("titanium_chest", () -> new ArmorItem(ArmorTiers.TITANIUM_ARMOR_MAT, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_LEGS = ITEMS.register("titanium_legs", () -> new ArmorItem(ArmorTiers.TITANIUM_ARMOR_MAT, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_feet", () -> new ArmorItem(ArmorTiers.TITANIUM_ARMOR_MAT, EquipmentSlot.FEET, new Item.Properties()));

    public static final RegistryObject<Item> MEURODITE_HELMET = ITEMS.register("meurodite_helm", () -> new ArmorItem(ArmorTiers.MEURODITE_ARMOR_MAT, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> MEURODITE_CHEST = ITEMS.register("meurodite_chest", () -> new ArmorItem(ArmorTiers.MEURODITE_ARMOR_MAT, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> MEURODITE_LEGS = ITEMS.register("meurodite_legs", () -> new ArmorItem(ArmorTiers.MEURODITE_ARMOR_MAT, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> MEURODITE_BOOTS = ITEMS.register("meurodite_feet", () -> new ArmorItem(ArmorTiers.MEURODITE_ARMOR_MAT, EquipmentSlot.FEET, new Item.Properties()));

    public static final RegistryObject<Item> TORITE_HELMET = ITEMS.register("torite_helm", () -> new ArmorItem(ArmorTiers.TORITE_ARMOR_MAT, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> TORITE_CHEST = ITEMS.register("torite_chest", () -> new ArmorItem(ArmorTiers.TORITE_ARMOR_MAT, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> TORITE_LEGS = ITEMS.register("torite_legs", () -> new ArmorItem(ArmorTiers.TORITE_ARMOR_MAT, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> TORITE_BOOTS = ITEMS.register("torite_feet", () -> new ArmorItem(ArmorTiers.TORITE_ARMOR_MAT, EquipmentSlot.FEET, new Item.Properties()));

    public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helm", () -> new ArmorItem(ArmorTiers.TIN_ARMOR_MAT, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> TIN_CHEST = ITEMS.register("tin_chest", () -> new ArmorItem(ArmorTiers.TIN_ARMOR_MAT, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> TIN_LEGS = ITEMS.register("tin_legs", () -> new ArmorItem(ArmorTiers.TIN_ARMOR_MAT, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_feet", () -> new ArmorItem(ArmorTiers.TIN_ARMOR_MAT, EquipmentSlot.FEET, new Item.Properties()));


}
