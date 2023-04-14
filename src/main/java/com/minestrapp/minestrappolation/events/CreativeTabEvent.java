package com.minestrapp.minestrappolation.events;

import com.minestrapp.minestrappolation.Minestrappolation;
import com.minestrapp.minestrappolation.init.MBlocks;
import com.minestrapp.minestrappolation.init.MItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.Iterator;

@Mod.EventBusSubscriber(modid = Minestrappolation.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreativeTabEvent {

    private static final String TAB_NAME = "Minestrappolation";

    @SubscribeEvent
    public static void onCustomTab(CreativeModeTabEvent.Register event) {
        event.registerCreativeModeTab(new ResourceLocation(Minestrappolation.ID, "minestrapp"), builder -> {
            builder.title(Component.translatable("itemGroup." + TAB_NAME))
                    .icon(() -> new ItemStack(MItems.SALT_CRYSTAL.get()))
                    .displayItems((enabledFeatures, output, tab) -> {
                        Iterator<RegistryObject<Block>> i = MBlocks.BLOCKS.getEntries().iterator();
                        while(i.hasNext()){
                            Block block = i.next().get();
                            output.accept(block);
                        }

                        Iterator<RegistryObject<Item>> i2 = MItems.ITEMS.getEntries().iterator();
                        while (i2.hasNext()){
                            Item item = i2.next().get();
                            output.accept(item);
                        }
                    });
        });
    }
}
