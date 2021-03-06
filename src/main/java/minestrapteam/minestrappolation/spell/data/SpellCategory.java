package minestrapteam.minestrappolation.spell.data;

import java.util.Random;

import clashsoft.cslib.minecraft.lang.I18n;
import minestrapteam.minestrappolation.util.MAssetManager;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class SpellCategory
{
	public static SpellCategory[]		spellCategories	= new SpellCategory[4];
	
	public static final SpellCategory	OFFENSE				= new SpellCategory(0, "offense");
	public static final SpellCategory	DEFENSE				= new SpellCategory(1, "defense");
	public static final SpellCategory	ALTERATION			= new SpellCategory(2, "alteration");
	public static final SpellCategory	SUMMONING			= new SpellCategory(3, "summoning");
	
	public final int					id;
	public String						name;
	
	public IIcon						icon;
	
	private SpellCategory(int id, String name)
	{
		this.id = id;
		this.name = name;
		
		spellCategories[id] = this;
	}
	
	public String getUnlocalizedName()
	{
		return "spellcategory." + this.name;
	}
	
	public String getDisplayName()
	{
		return I18n.getString(this.getUnlocalizedName());
	}
	
	public void registerIcons(IIconRegister iconRegister)
	{
		this.icon = iconRegister.registerIcon(MAssetManager.getSpellTexture("category_" + this.name));
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return this == obj;
	}
	
	@Override
	public int hashCode()
	{
		return this.id;
	}
	
	@Override
	public String toString()
	{
		return this.name;
	}
	
	public static SpellCategory get(int id)
	{
		return spellCategories[id];
	}
	
	public static SpellCategory random(Random random)
	{
		return get(random.nextInt(spellCategories.length));
	}
}
