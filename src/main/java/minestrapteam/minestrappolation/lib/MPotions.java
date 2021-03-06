package minestrapteam.minestrappolation.lib;

import clashsoft.brewingapi.BrewingAPI;
import clashsoft.brewingapi.potion.IPotionEffectHandler;
import clashsoft.brewingapi.potion.PotionList;
import clashsoft.brewingapi.potion.recipe.PotionRecipes;
import clashsoft.brewingapi.potion.type.PotionType;
import clashsoft.cslib.minecraft.world.TeleporterNoPortal;
import minestrapteam.minestrappolation.potion.MPotion;
import minestrapteam.minestrappolation.util.MAssetManager;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.ServerConfigurationManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.DimensionManager;

public class MPotions implements IPotionEffectHandler
{
	private static ResourceLocation	iconLoc				= MAssetManager.getResource("textures/gui/potion_icons.png");
	
	public static Potion			infectiousPotion	= new MPotion("potion.infectious", 0xFE3040, true).setIcon(iconLoc, 6, 1);
	public static Potion			ghastTentaclePotion	= new MPotion("potion.ghastTentacle", 0xED03D5, true).setIcon(iconLoc, 7, 1);
	public static Potion			hydrophobiaPotion	= new MPotion("potion.hydrophobia", 0x0D0DFF, true).setIcon(iconLoc, 5, 1);
	
	public static PotionType		infectious;
	public static PotionType		ghastTentacle;
	public static PotionType		hydrophobia;
	
	public static void load()
	{
		BrewingAPI.registerEffectHandler(new MPotions());
		
		// Init
		infectious = new PotionType(new PotionEffect(infectiousPotion.id, 120 * 20), 1, 240 * 20);
		ghastTentacle = new PotionType(new PotionEffect(ghastTentaclePotion.id, 90 * 20), 0, 210 * 20);
		hydrophobia = new PotionType(new PotionEffect(hydrophobiaPotion.id, 90 * 20), 0, 180 * 20);
		infectious.register();
		ghastTentacle.register();
		hydrophobia.register();
		
		// Recipes
		PotionRecipes.addRecipe(new ItemStack(MItems.infectiousFungus), infectious);
		PotionRecipes.addRecipe(new ItemStack(MItems.ghastTentacle), ghastTentacle);
		PotionRecipes.addRecipe(new ItemStack(MItems.airSack), new PotionEffect(Potion.waterBreathing.id, 120 * 20, 0));
		PotionRecipes.addRecipe(new ItemStack(MItems.marrow), new PotionEffect(Potion.resistance.id, 180 * 20));
		PotionRecipes.addRecipe(new ItemStack(MItems.witherAsh), PotionList.thick, new PotionEffect(Potion.wither.id, 30 * 20, 0));
	}
	
	@Override
	public void onPotionUpdate(int tick, EntityLivingBase entity, PotionEffect effect)
	{
		if (effect.getPotionID() == infectiousPotion.id)
		{
			Block block = entity.worldObj.getBlock((int) entity.posX - 1, (int) entity.posY - 1, (int) entity.posZ - 1);
			if (block == Blocks.grass)
			{
				entity.worldObj.setBlock((int) entity.posX - 1, (int) entity.posY - 1, (int) entity.posZ - 1, Blocks.mycelium);
			}
			else if (block == Blocks.mycelium)
			{
				entity.addPotionEffect(new PotionEffect(Potion.regeneration.id, 1, 1));
			}
		}
		else if (effect.getPotionID() == hydrophobiaPotion.id)
		{
			if (entity.isWet())
			{
				entity.attackEntityFrom(DamageSource.drown, 1F);
			}
		}
		else if (effect.getPotionID() == ghastTentaclePotion.id)
		{
			if (entity instanceof EntityPlayerMP)
			{
				if (entity.dimension != -1)
				{
					ServerConfigurationManager manager = MinecraftServer.getServer().getConfigurationManager();
					manager.transferPlayerToDimension((EntityPlayerMP) entity, -1, new TeleporterNoPortal(DimensionManager.getWorld(-1)));
					
					entity.addPotionEffect(new PotionEffect(Potion.confusion.id, effect.getDuration(), 0));
					entity.addPotionEffect(new PotionEffect(Potion.invisibility.id, effect.getDuration(), 0));
				}
				else if (effect.getDuration() == 1)
				{
					ServerConfigurationManager manager = MinecraftServer.getServer().getConfigurationManager();
					manager.transferPlayerToDimension((EntityPlayerMP) entity, 0, new TeleporterNoPortal(DimensionManager.getWorld(0)));
					
					while (entity.isEntityInsideOpaqueBlock())
					{
						entity.posY++;
					}
				}
			}
		}
	}
	
	@Override
	public boolean canHandle(PotionEffect effect)
	{
		return effect.getPotionID() == infectiousPotion.id || effect.getPotionID() == ghastTentaclePotion.id;
	}
}