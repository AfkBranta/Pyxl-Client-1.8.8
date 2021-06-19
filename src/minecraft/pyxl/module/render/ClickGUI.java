package pyxl.module.render;

import pyxl.module.Category;
import pyxl.module.Module;
import de.Hero.settings.Setting;
import pyxl.Pyxl;

import org.lwjgl.input.Keyboard;

import java.util.ArrayList;

public class ClickGUI extends Module {
    public ClickGUI() {
        super("ClickGUI", Keyboard.KEY_RSHIFT, Category.RENDER);
    }

    @Override
    public void setup() {
        ArrayList<String> options = new ArrayList<>();
        options.add("New");
        options.add("JellyLike");
        Pyxl.instance.settingsManager.rSetting(new Setting("Design", this, "New", options));
        Pyxl.instance.settingsManager.rSetting(new Setting("Sound", this, false));
        Pyxl.instance.settingsManager.rSetting(new Setting("GuiRed", this, 255, 0, 255, true));
        Pyxl.instance.settingsManager.rSetting(new Setting("GuiGreen", this, 26, 0, 255, true));
        Pyxl.instance.settingsManager.rSetting(new Setting("GuiBlue", this, 42, 0, 255, true));
    }

    @Override
    public void onEnable() {
        super.onEnable();

        mc.displayGuiScreen(Pyxl.instance.clickGui);
        toggle();
    }
}
