package pyxl;

import pyxl.event.EventManager;
import pyxl.event.EventTarget;
import pyxl.event.events.EventKey;
import pyxl.module.ModuleManager;
import de.Hero.clickgui.ClickGUI;
import de.Hero.settings.SettingsManager;
import org.lwjgl.opengl.Display;

public class Pyxl {
    public final String name = "Pyxl";
    public final String version = "1.0";
    public final String name_ver = "Pyxl Beta v1.0";

    public static Pyxl instance = new Pyxl();

    public SettingsManager settingsManager;
    public EventManager eventManager;
    public ModuleManager moduleManager;
    public ClickGUI clickGui;

    public void startClient() {
        settingsManager = new SettingsManager();
        eventManager = new EventManager();
        moduleManager = new ModuleManager();
        clickGui = new ClickGUI();

        System.out.println("[Pyxl Client] Starting client...");
        Display.setTitle(name_ver);

        eventManager.register(this);
    }

    public void stopClient() {
        eventManager.unregister(this);
    }

    @EventTarget
    public void onKey(EventKey event) {
        moduleManager.getModules().stream().filter(module -> module.getKey() == event.getKey()).forEach(module -> module.toggle());
    }
}
