package pyxl.module.hud;

import pyxl.Pyxl;
import pyxl.module.Category;
import pyxl.module.Module;

import java.util.ArrayList;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;


public class ModuleList extends Module {
	//NOTE: does not work
	
	private Minecraft mc = Minecraft.getMinecraft();
	private FontRenderer font = mc.fontRendererObj;
	
	public ModuleList() {
		super("Array List", Keyboard.KEY_NONE, Category.HUD);
	}
	
	public void onEnable() {
		super.onEnable();
		/*ScaledResolution sr = new ScaledResolution(mc);
		
		ArrayList<Module> enabledMods = new ArrayList<Module>();
		for(Module m : Pyxl.instance.moduleManager.getModules())
			if(m.isToggled())
				enabledMods.add(m);
		
		enabledMods.sort((m1, m2) -> font.getStringWidth(m2.getDisplayName()) - font.getStringWidth(m1.getDisplayName()));
		
		int y = 2;
		for(Module m : enabledMods) {
			font.drawString(m.getDisplayName(), sr.getScaledWidth() - font.getStringWidth(m.getDisplayName()) - 2, y, 0xff1C4BE0);
			y += 10;
		}*/
	}
}
