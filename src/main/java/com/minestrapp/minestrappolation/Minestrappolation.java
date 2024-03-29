package com.minestrapp.minestrappolation;

import com.minestrapp.minestrappolation.init.ClientInit;
import com.minestrapp.minestrappolation.init.MBlocks;
import com.minestrapp.minestrappolation.init.MItems;
import com.minestrapp.minestrappolation.init.MLootModifier;
import com.minestrapp.minestrappolation.items.SoulGemItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("minestrappolation")
public class Minestrappolation {
    public static final String ID = "minestrappolation";

    public Minestrappolation(){
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MConfig.GENERAL_SPEC, ID+".toml");

        MBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MBlocks.BLOCK_ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MLootModifier.LOOT_MODIFIER.register(FMLJavaModLoadingContext.get().getModEventBus());

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientInit::init));
    }

    private void setup(final FMLCommonSetupEvent event){
        IEventBus bus = MinecraftForge.EVENT_BUS;
        SoulGemItem.setMaxLevel(MConfig.maxGemLevel.get());
    }


}
