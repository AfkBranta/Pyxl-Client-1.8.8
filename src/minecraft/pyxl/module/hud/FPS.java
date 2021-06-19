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

public class FPS extends Module {
	//NOTE: text stuck in top right for some reason
	
	public FPS() {
        super("FPS", Keyboard.KEY_NONE, Category.HUD);
    }
	
	private Minecraft mc = Minecraft.getMinecraft();
	private FontRenderer font = mc.fontRendererObj;
	
	public void onEnable() {
		super.onEnable();
		font.drawString("FPS: " + mc.getDebugFPS(), 2, 20, 0xff1C4BE0);
	}
}
