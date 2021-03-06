package minestrapteam.minestrappolation.client.gui;

import org.lwjgl.opengl.GL11;

import clashsoft.cslib.minecraft.lang.I18n;
import minestrapteam.minestrappolation.inventory.ContainerMelter;
import minestrapteam.minestrappolation.tileentity.TileEntityMelter;
import minestrapteam.minestrappolation.util.MAssetManager;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiMelter extends GuiContainer
{
	public static ResourceLocation	texture	= MAssetManager.getGUIResource("container/melter");
	
	private TileEntityMelter		melter;
	
	public GuiMelter(EntityPlayer player, TileEntityMelter melter)
	{
		super(new ContainerMelter(player, melter));
		this.melter = melter;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
	{
		String s = this.melter.getInventoryName();
		this.fontRendererObj.drawString(s, (this.xSize - this.fontRendererObj.getStringWidth(s)) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.getString("container.inventory"), 8, this.ySize - 94, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTickTime, int mouseX, int mouseY)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(texture);
		int j = (this.width - this.xSize) / 2;
		int k = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(j, k, 0, 0, this.xSize, this.ySize);
		
		boolean power = this.melter.isPowered();
		if (this.melter.isBurning())
		{
			int burn = this.melter.getBurnTimeRemainingScaled(12);
			this.drawTexturedModalRect(j + 56, k + 48 - burn, power ? 190 : 176, 12 - burn, 14, burn + 2);
		}
		
		if (power)
		{
			this.drawTexturedModalRect(j + 43, k + 20, 176, 31, 12, 10);
		}
		
		int update = this.melter.getProgressScaled(24);
		this.drawTexturedModalRect(j + 79, k + 34, 176, 14, update + 1, 16);
	}
}