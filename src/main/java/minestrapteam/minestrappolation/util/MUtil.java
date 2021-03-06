package minestrapteam.minestrappolation.util;

import java.util.Random;

import clashsoft.cslib.minecraft.crafting.CSCrafting;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

/**
 * @author SoBiohazardous
 * @author Clashsoft
 */
public class MUtil
{
	public static boolean isMaterial(World world, int x, int y, int z, Material material)
	{
		return world.getBlock(x, y, z).getMaterial() == material;
	}
	
	public static boolean isBlock(World world, int x, int y, int z, Block block)
	{
		return world.getBlock(x, y, z) == block;
	}
	
	/**
	 * This checks and returns if water is near in a 9x3x9 square
	 * 
	 * @param World
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static boolean isWaterNearby(World world, int x, int y, int z)
	{
		for (int x1 = -4; x1 <= 4; ++x1)
		{
			for (int y1 = -1; y1 <= 1; ++y1)
			{
				for (int z1 = -4; z1 <= 4; ++z1)
				{
					if (isMaterial(world, x + x1, y + y1, z + z1, Material.water))
					{
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	public static boolean isWaterTouchingAnySide(World world, int x, int y, int z)
	{
		return isMaterial(world, x + 1, y, z, Material.water) // x+
				|| isMaterial(world, x - 1, y, z, Material.water) // x-
				|| isMaterial(world, x, y + 1, z, Material.water) // y+
				// || isMaterial(world, x, y - 1, z, Material.water) // y-
				|| isMaterial(world, x, y, z + 1, Material.water) // z+
				|| isMaterial(world, x, y, z - 1, Material.water); // z-
	}
	
	public static boolean isBlockTouchingAnySide(World world, int x, int y, int z, Block block)
	{
		return isBlock(world, x + 1, y, z, block) // x+
				|| isBlock(world, x - 1, y, z, block) // x-
				|| isBlock(world, x, y + 1, z, block) // y+
				|| isBlock(world, x, y - 1, z, block) // y-
				|| isBlock(world, x, y, z + 1, block) // z+
				|| isBlock(world, x, y, z - 1, block); // z-
	}
	
	public boolean isBlockWithin(World world, int x, int y, int z, Block block, int width, int height, int length)
	{
		for (int l = -width; l <= width; ++l)
		{
			for (int i1 = -height; i1 <= height; ++i1)
			{
				for (int j1 = -length; j1 <= length; ++j1)
				{
					if (isBlock(world, x, y, z, block))
					{
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	/**
	 * Returns if a block is touching the top or not, doesn't know which block.
	 * 
	 * @param world
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static boolean isBlockAbove(World world, int x, int y, int z)
	{
		return !isMaterial(world, x, y + 1, z, Material.air);
	}
	
	public static boolean isRaining(World world, int x, int y, int z)
	{
		return world.isRaining() && world.getBiomeGenForCoords(x, z).canSpawnLightningBolt();
	}
	
	public static void spawnParticle(World world, int x, int y, int z, Random random, String name)
	{
		int rx = random.nextInt(2) * 2 - 1;
		int rz = random.nextInt(2) * 2 - 1;
		double posX = x + 0.5D + 0.25D * rx;
		double posY = y + random.nextFloat();
		double posZ = z + 0.5D + 0.25D * rz;
		double velocityX = random.nextFloat() * 1.0F * rx;
		double velocityY = (random.nextFloat() - 0.5D) * 0.125D;
		double velocityZ = random.nextFloat() * 1.0F * rz;
		
		world.spawnParticle("portal", posX, posY, posZ, velocityX, velocityY, velocityZ);
	}
	
	public static void spawnParticle2(World world, int x, int y, int z, Random random, String name)
	{
		for (int i = 0; i < 6; i++)
		{
			double x1 = x + random.nextFloat();
			double y1 = y + random.nextFloat();
			double z1 = z + random.nextFloat();
			
			if (i == 0 && !world.isBlockNormalCubeDefault(x, y + 1, z, true))
			{
				y1 = y + 1.0625D;
			}
			
			if (i == 1 && !world.isBlockNormalCubeDefault(x, y - 1, z, true))
			{
				y1 = y - 0.0625D;
			}
			
			if (i == 2 && !world.isBlockNormalCubeDefault(x, y, z + 1, true))
			{
				z1 = z + 1.0625D;
			}
			
			if (i == 3 && !world.isBlockNormalCubeDefault(x, y, z - 1, true))
			{
				z1 = z - 0.0625D;
			}
			
			if (i == 4 && !world.isBlockNormalCubeDefault(x + 1, y, z, true))
			{
				x1 = x + 1.0625D;
			}
			
			if (i == 5 && !world.isBlockNormalCubeDefault(x - 1, y, z, true))
			{
				x1 = x - 0.0625D;
			}
			
			if (x1 < x || x1 > x + 1 || y1 < 0.0D || y1 > y + 1 || z1 < z || z1 > z + 1)
			{
				world.spawnParticle(name, x1, y1, z1, 0.0D, 0.0D, 0.0D);
			}
		}
	}
	
	public static boolean transformMob(Entity entity)
	{
		Class c = entity.getClass();
		if (transform(entity, c, EntityHorse.class, EntitySpider.class))
		{
			return true;
		}
		if (transform(entity, c, EntityPig.class, EntityPigZombie.class))
		{
			return true;
		}
		if (transform(entity, c, EntityBat.class, EntitySilverfish.class))
		{
			return true;
		}
		if (transform(entity, c, EntitySquid.class, EntityGhast.class))
		{
			return true;
		}
		if (transform(entity, c, EntityVillager.class, EntityWitch.class))
		{
			return true;
		}
		if (transform(entity, c, EntitySnowman.class, EntityBlaze.class))
		{
			return true;
		}
		if (transform(entity, c, EntitySlime.class, EntityMagmaCube.class))
		{
			return true;
		}
		return false;
	}
	
	protected static boolean transform(Entity entity, Class<? extends Entity> class1, Class<? extends Entity> animal, Class<? extends Entity> mob)
	{
		if (class1 == animal)
		{
			return transform(entity, mob);
		}
		else if (class1 == mob)
		{
			return transform(entity, animal);
		}
		return false;
	}
	
	public static <T extends Entity> boolean transform(Entity entity, Class<T> newType)
	{
		try
		{
			World world = entity.worldObj;
			T newEntity = newType.getConstructor(World.class).newInstance(world);
			NBTTagCompound nbt = new NBTTagCompound();
			
			entity.writeToNBT(nbt);
			newEntity.readFromNBT(nbt);
			
			entity.setDead();
			if (!world.isRemote)
			{
				world.spawnEntityInWorld(newEntity);
			}
			
			return true;
		}
		catch (Exception ex)
		{
			return false;
		}
	}
	
	public static void removeRecipe(Item output)
	{
		CSCrafting.removeRecipe(new ItemStack(output, 1, CSCrafting.WILDCARD_VALUE));
	}
	
	public static void removeRecipe(Block output)
	{
		CSCrafting.removeRecipe(new ItemStack(output, 1, CSCrafting.WILDCARD_VALUE));
	}
	
	public static void removeRecipe(ItemStack output)
	{
		CSCrafting.removeRecipe(output);
	}
	
	public static double getVolume(Block block)
	{
		return block.getBlockBoundsMaxX() - block.getBlockBoundsMinX() * // x
				block.getBlockBoundsMaxY() - block.getBlockBoundsMinY() * // y
				block.getBlockBoundsMaxZ() - block.getBlockBoundsMinZ(); // z
	}
}
