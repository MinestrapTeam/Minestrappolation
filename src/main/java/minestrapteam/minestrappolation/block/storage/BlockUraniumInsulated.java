package minestrapteam.minestrappolation.block.storage;

import minestrapteam.minestrappolation.util.MAssetManager;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;

public class BlockUraniumInsulated extends BlockInsulatedRadiation
{
	private IIcon	topIcon;
	private IIcon	bottomIcon;
	
	public BlockUraniumInsulated(Material material)
	{
		super(material);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon(MAssetManager.getMineralTexture("uranium_insulated"));
		this.topIcon = iconRegister.registerIcon(MAssetManager.getMineralTexture("steel_block_top"));
		this.bottomIcon = iconRegister.registerIcon(MAssetManager.getMineralTexture("steel_block_bottom"));
	}
	
	@Override
	public IIcon getIcon(int i, int j)
	{
		if (i == 1)
		{
			return this.topIcon;
		}
		if (i == 0)
		{
			return this.bottomIcon;
		}
		
		return this.blockIcon;
	}
	
	@Override
	public void addPotionEffect(EntityLivingBase living)
	{
		if (living instanceof EntityZombie)
		{
			living.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 300, 2, false));
			living.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 300, 1, false));
		}
		else
		{
			living.addPotionEffect(new PotionEffect(Potion.poison.getId(), 180, 1, false));
		}
		
	}
	
	@Override
	public float getRange()
	{
		return 6F;
	}
}