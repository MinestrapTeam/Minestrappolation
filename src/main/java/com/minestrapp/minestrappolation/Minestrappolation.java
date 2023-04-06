package com.minestrapp.minestrappolation;

import com.minestrapp.minestrappolation.init.Blocks;
import com.minestrapp.minestrappolation.init.ClientInit;
import com.minestrapp.minestrappolation.init.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("minestrappolation")
public class Minestrappolation {

    public static final String ID = "minestrappolation";

    public Minestrappolation(){
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        Blocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        Blocks.BLOCK_ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        Items.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientInit::init));
    }

    private void setup(final FMLCommonSetupEvent event){
        IEventBus bus = MinecraftForge.EVENT_BUS;
    }


}
