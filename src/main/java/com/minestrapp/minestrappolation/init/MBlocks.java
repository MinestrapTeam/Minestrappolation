package com.minestrapp.minestrappolation.init;

import com.minestrapp.minestrappolation.Minestrappolation;
import com.minestrapp.minestrappolation.blocks.BlaziumBlock;
import com.minestrapp.minestrappolation.blocks.BlockBase;
import com.minestrapp.minestrappolation.blocks.BlockBush;
import com.minestrapp.minestrappolation.blocks.crops.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Minestrappolation.ID);
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Minestrappolation.ID);
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties();

    //BIOME STONE
    public static final RegistryObject<Block> COLDSTONE = BLOCKS.register("coldstone", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(2F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> COBBLE_COLDSTONE = BLOCKS.register("cobble_coldstone", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(2F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> DEEP_COLDSTONE = BLOCKS.register("deep_coldstone", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(2F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> COBBLE_DEEP_COLDSTONE = BLOCKS.register("cobble_deep_coldstone", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(2F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> REDROCK = BLOCKS.register("redrock", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(2F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> COBBLE_REDROCK = BLOCKS.register("cobble_redrock", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(2F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> DEEP_REDROCK = BLOCKS.register("deep_redrock", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(2F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> COBBLE_DEEP_REDROCK = BLOCKS.register("cobble_deep_redrock", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(2F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> ICESTONE = BLOCKS.register("icestone", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(2F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> COBBLE_ICESTONE = BLOCKS.register("cobble_icestone", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(2F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> GLACIERSTONE = BLOCKS.register("glacierstone", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(2F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> COBBLE_GLACIERSTONE = BLOCKS.register("cobble_glacierstone", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(2F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> CASCADING_DRIPSTONE = BLOCKS.register("cascading_dripstone", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(2F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> COBBLE_OCEANSTONE = BLOCKS.register("cobble_oceanstone", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(2F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> DEEP_OCEANSTONE = BLOCKS.register("deep_oceanstone", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(2F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> COBBLE_DEEP_OCEANSTONE = BLOCKS.register("cobble_deep_oceanstone", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(2F, 6F).requiresCorrectToolForDrops())));

    //ORE
    //TODO Fix harvest levels
    public static final RegistryObject<Block> SALT_ORE = BLOCKS.register("salt_ore", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(3F, 3F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> MEURODITE_ORE = BLOCKS.register("meurodite_ore", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(3F, 3F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> TORITE_ORE = BLOCKS.register("torite_ore", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(3F, 3F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(3F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(3F, 3F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> BLAZIUM_ORE = BLOCKS.register("blazium_ore", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(3F, 3F).requiresCorrectToolForDrops())));

    public static final RegistryObject<Block> SALT_BLOCK = BLOCKS.register("salt_block", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(5F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> MEURODITE_BLOCK = BLOCKS.register("meurodite_block", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(5F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> TORITE_BLOCK = BLOCKS.register("torite_block", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(5F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(5F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(5F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> BLAZIUM_BLOCK = BLOCKS.register("blazium_block", () ->(new BlaziumBlock(BlockBehaviour.Properties.of(Material.STONE).strength(5F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(5F, 6F).requiresCorrectToolForDrops())));
    public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", () ->(new BlockBase(BlockBehaviour.Properties.of(Material.STONE).strength(5F, 6F).requiresCorrectToolForDrops())));

    //CROPS and Plants
    public static final RegistryObject<Block> CABBAGE_CROP = BLOCKS.register("crop_cabbage", () ->(new CropCabbage(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP))));
    public static final RegistryObject<Block> CELERY_CROP = BLOCKS.register("crop_celery", () ->(new CropCelery(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP))));
    public static final RegistryObject<Block> PEPPER_CROP = BLOCKS.register("crop_pepper", () ->(new CropPepper(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP))));
    public static final RegistryObject<Block> TOMATO_CROP = BLOCKS.register("crop_tomato", () ->(new CropTomato(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP))));
    public static final RegistryObject<Block> ONION_CROP = BLOCKS.register("crop_onion", () ->(new CropOnion(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP))));
    public static final RegistryObject<Block> PEANUT_CROP = BLOCKS.register("crop_peanuts", () ->(new CropPeanut(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP))));

    public static final RegistryObject<Block> BLUEBERRY_BUSH = BLOCKS.register("blueberry_bush", () -> new BlockBush(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), MItems.BLUEBERRY));
    public static final RegistryObject<Block> BLACKBERRY_BUSH = BLOCKS.register("blackberry_bush", () -> new BlockBush(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), MItems.BLACKBERRY));
    public static final RegistryObject<Block> STRAWBERRY_BUSH = BLOCKS.register("strawberry_bush", () -> new BlockBush(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), MItems.STRAWBERRY));
    public static final RegistryObject<Block> RASPBERRY_BUSH = BLOCKS.register("raspberry_bush", () -> new BlockBush(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP), MItems.RASPBERRY));

    public static final RegistryObject<Item> COLDSTONE_BLOCKITEM = registerBlockItem(COLDSTONE);
    public static final RegistryObject<Item> COBBLE_COLDSTONE_BLOCKITEM = registerBlockItem(COBBLE_COLDSTONE);
    public static final RegistryObject<Item> DEEP_COLDSTONE_BLOCKITEM = registerBlockItem(DEEP_COLDSTONE);
    public static final RegistryObject<Item> COBBLE_DEEP_COLDSTONE_BLOCKITEM = registerBlockItem(COBBLE_DEEP_COLDSTONE);
    public static final RegistryObject<Item> REDROCK_BLOCKITEM = registerBlockItem(REDROCK);
    public static final RegistryObject<Item> COBBLE_REDROCK_BLOCKITEM = registerBlockItem(COBBLE_REDROCK);
    public static final RegistryObject<Item> DEEP_REDROCK_BLOCKITEM = registerBlockItem(DEEP_REDROCK);
    public static final RegistryObject<Item> COBBLE_DEEP_REDROCK_BLOCKITEM = registerBlockItem(COBBLE_DEEP_REDROCK);
    public static final RegistryObject<Item> ICESTONE_BLOCKITEM = registerBlockItem(ICESTONE);
    public static final RegistryObject<Item> COBBLE_ICESTONE_BLOCKITEM = registerBlockItem(COBBLE_ICESTONE);
    public static final RegistryObject<Item> GLACIERSTONE_BLOCKITEM = registerBlockItem(GLACIERSTONE);
    public static final RegistryObject<Item> COBBLE_GLACIERSTONE_BLOCKITEM = registerBlockItem(COBBLE_GLACIERSTONE);
    public static final RegistryObject<Item> CASCADING_DRIPSTONE_BLOCKITEM = registerBlockItem(CASCADING_DRIPSTONE);
    public static final RegistryObject<Item> COBBLE_OCEANSTONE_BLOCKITEM = registerBlockItem(COBBLE_OCEANSTONE);
    public static final RegistryObject<Item> DEEP_OCEANSTONE_BLOCKITEM = registerBlockItem(DEEP_OCEANSTONE);
    public static final RegistryObject<Item> COBBLE_DEEP_OCEANSTONE_BLOCKITEM = registerBlockItem(COBBLE_DEEP_OCEANSTONE);

    public static final RegistryObject<Item> SALT_ORE_BLOCKITEM = registerBlockItem(SALT_ORE);
    public static final RegistryObject<Item> MEURODITE_ORE_BLOCKITEM = registerBlockItem(MEURODITE_ORE);
    public static final RegistryObject<Item> TORITE_ORE_BLOCKITEM = registerBlockItem(TORITE_ORE);
    public static final RegistryObject<Item> TIN_ORE_BLOCKITEM = registerBlockItem(TIN_ORE);
    public static final RegistryObject<Item> TITANIUM_ORE_BLOCKITEM = registerBlockItem(TITANIUM_ORE);
    public static final RegistryObject<Item> BLAZIUM_ORE_BLOCK_BLOCKITEM = registerBlockItem(BLAZIUM_ORE);

    public static final RegistryObject<Item> SALT_BLOCK_BLOCKITEM = registerBlockItem(SALT_BLOCK);
    public static final RegistryObject<Item> MEURODITE_BLOCK_BLOCKITEM = registerBlockItem(MEURODITE_BLOCK);
    public static final RegistryObject<Item> TORITE_BLOCK_BLOCKITEM = registerBlockItem(TORITE_BLOCK);
    public static final RegistryObject<Item> TIN_BLOCK_BLOCKITEM = registerBlockItem(TIN_BLOCK);
    public static final RegistryObject<Item> TITANIUM_BLOCK_BLOCKITEM = registerBlockItem(TITANIUM_BLOCK);
    public static final RegistryObject<Item> BLAZIUM_BLOCK_BLOCKITEM = registerBlockItem(BLAZIUM_BLOCK);
    public static final RegistryObject<Item> STEEL_BLOCK_BLOCKITEM = registerBlockItem(STEEL_BLOCK);
    public static final RegistryObject<Item> BRONZE_BLOCK_BLOCKITEM = registerBlockItem(BRONZE_BLOCK);

    private static <B extends Block> RegistryObject<Item> registerBlockItem(RegistryObject<B> block){
        return BLOCK_ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }

}
