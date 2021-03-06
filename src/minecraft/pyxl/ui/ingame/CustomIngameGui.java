package pyxl.ui.ingame;

import java.awt.Color;
import java.util.ArrayList;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import pyxl.module.Module;
import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiInventory;
import pyxl.Pyxl;

public class CustomIngameGui extends GuiIngame {
	private Minecraft mc = Minecraft.getMinecraft();
	private FontRenderer font = mc.fontRendererObj;
	
	public CustomIngameGui(Minecraft mcIn) {
		super(mcIn);
	}
	
	@Override
	public void renderGameOverlay(float partialTicks) {
		super.renderGameOverlay(partialTicks);
		
		if(!mc.gameSettings.showDebugInfo) {
			renderInfo();
			renderArrayList();
		}
	}
	
	private void renderInfo() {
		GL11.glPushMatrix();
		GL11.glScalef(1.5F, 1.5F, 1.5F);
		font.drawString("Pyxl", 2, 2, 0xff1C4BE0);
		GL11.glPopMatrix();
		font.drawString("FPS: " + mc.getDebugFPS(), 2, 20, 0xff1C4BE0);
	}
	
	private void renderArrayList() {
		ScaledResolution sr = new ScaledResolution(mc);
		
		ArrayList<Module> enabledMods = new ArrayList<Module>();
		for(Module m : Pyxl.instance.moduleManager.getModules())
			if(m.isToggled())
				enabledMods.add(m);
		
		enabledMods.sort((m1, m2) -> font.getStringWidth(m2.getDisplayName()) - font.getStringWidth(m1.getDisplayName()));
		
		int y = 2;
		for(Module m : enabledMods) {
			font.drawString(m.getDisplayName(), sr.getScaledWidth() - font.getStringWidth(m.getDisplayName()) - 2, y, 0xff1C4BE0);
			y += 10;
		}
	}
}
	
