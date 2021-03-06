package minestrapteam.minestrappolation.client;

import org.lwjgl.input.Keyboard;

import clashsoft.cslib.minecraft.cape.Capes;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import minestrapteam.minestrappolation.client.gui.*;
import minestrapteam.minestrappolation.client.model.ModelArcaneForge;
import minestrapteam.minestrappolation.client.model.ModelSawmill;
import minestrapteam.minestrappolation.client.model.ModelStonecutter;
import minestrapteam.minestrappolation.client.model.ModelWorkbench;
import minestrapteam.minestrappolation.client.renderer.RenderHangGlider;
import minestrapteam.minestrappolation.client.renderer.RenderNukePrimed;
import minestrapteam.minestrappolation.client.renderer.block.*;
import minestrapteam.minestrappolation.client.renderer.tileentity.RenderFacedTileEntity;
import minestrapteam.minestrappolation.client.renderer.tileentity.RenderLocked;
import minestrapteam.minestrappolation.client.renderer.tileentity.RenderTileEntity;
import minestrapteam.minestrappolation.common.MCommonProxy;
import minestrapteam.minestrappolation.entity.*;
import minestrapteam.minestrappolation.lib.MItems;
import minestrapteam.minestrappolation.tileentity.*;
import minestrapteam.minestrappolation.util.MAssetManager;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

public class MClientProxy extends MCommonProxy
{
	public static KeyBinding	keySpellbarSwitch	= new KeyBinding("key.spell.switch", Keyboard.KEY_Z, "key.categories.minestrappolation");
	public static KeyBinding	keySpellInventory	= new KeyBinding("key.spell.inventory", Keyboard.KEY_R, "key.categories.minestrappolation");
	
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		// Block Renderers
		custom2RenderID = RenderingRegistry.getNextAvailableRenderId();
		platingRenderID = RenderingRegistry.getNextAvailableRenderId();
		lockedRenderID = RenderingRegistry.getNextAvailableRenderId();
		
		RenderingRegistry.registerBlockHandler(custom2RenderID, new RenderBlockCustom2());
		RenderingRegistry.registerBlockHandler(platingRenderID, new RenderBlockPlating());
		RenderingRegistry.registerBlockHandler(lockedRenderID, new RenderBlockLocked());
		
		ClientRegistry.registerKeyBinding(keySpellbarSwitch);
		ClientRegistry.registerKeyBinding(keySpellInventory);
		
		MinecraftForge.EVENT_BUS.register(GuiSpellOverlay.instance);
		FMLCommonHandler.instance().bus().register(GuiSpellOverlay.instance);
	}
	
	@Override
	public void init(FMLInitializationEvent event)
	{
		// Tile Entity Renderers
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStonecutter.class, new RenderFacedTileEntity(new ModelStonecutter(), MAssetManager.getModelResource("stonecutter")));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySawmill.class, new RenderFacedTileEntity(new ModelSawmill(), MAssetManager.getModelResource("sawmill")));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoblet.class, new RenderGoblet());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPlate.class, new RenderPlate());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLocked.class, new RenderLocked());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWorkbench2.class, new RenderTileEntity(new ModelWorkbench(), MAssetManager.getModelResource("crafting_table")));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityArcaneForge.class, new RenderTileEntity(new ModelArcaneForge(), MAssetManager.getModelResource("arcane_forge")));
		
		// Item Renderers
		MinecraftForgeClient.registerItemRenderer(MItems.hangGlider, new RenderHangGlider());
		
		// Entity Renderers
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderSnowball(MItems.grenade));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenadeImpact.class, new RenderSnowball(MItems.grenadeImpact));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenadeSticky.class, new RenderSnowball(MItems.grenadeSticky));
		RenderingRegistry.registerEntityRenderingHandler(EntityGrenadeNuke.class, new RenderSnowball(MItems.grenadeNuke));
		RenderingRegistry.registerEntityRenderingHandler(EntityNukePrimed.class, new RenderNukePrimed());
		
		// Capes
		Capes.setLocalCape("SoBiohazardous", new ResourceLocation("minestrappolation", "textures/misc/cape_sobiohazardous.png"));
		Capes.setLocalCape("AdrianKunz", new ResourceLocation("minestrappolation", "textures/misc/cape_clashsoft.png"));
		Capes.setLocalCape("Delocuro", new ResourceLocation("minestrappolation", "textures/misc/cape_delocuro.png"));
		Capes.setLocalCape("Thewerty1124", new ResourceLocation("minestrappolation", "textures/misc/cape_thewerty.png"));
		Capes.setLocalCape("LandKingdom", new ResourceLocation("minestrappolation", "textures/misc/cape_landkingdom.png"));
	}
	
	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		if (id == 0)
		{
			return new GuiCrate(player, (TileEntityCrate) world.getTileEntity(x, y, z));
		}
		else if (id == 1)
		{
			return new GuiBarrel(player, (TileEntityBarrel) world.getTileEntity(x, y, z));
		}
		else if (id == 2)
		{
			return new GuiMelter(player, (TileEntityMelter) world.getTileEntity(x, y, z));
		}
		else if (id == 3)
		{
			return new GuiStonecutter(player.inventory, (TileEntityStonecutter) world.getTileEntity(x, y, z));
		}
		else if (id == 4)
		{
			return new GuiSawmill(player.inventory, (TileEntitySawmill) world.getTileEntity(x, y, z));
		}
		else if (id == 5)
		{
			return new GuiFreezer(player.inventory, (TileEntityFreezer) world.getTileEntity(x, y, z));
		}
		else if (id == 7)
		{
			return new GuiArcaneForge(player, (TileEntityArcaneForge) world.getTileEntity(x, y, z));
		}
		return null;
	}
	
	@Override
	public int addArmor(String armor)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	
	@Override
	public boolean isClient()
	{
		return true;
	}
}
