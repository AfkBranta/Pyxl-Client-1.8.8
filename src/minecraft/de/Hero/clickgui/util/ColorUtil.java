package de.Hero.clickgui.util;

import java.awt.Color;

import pyxl.Pyxl;

/**
 *  Made by HeroCode
 *  it's free to use
 *  but you have to credit me
 *
 *  @author HeroCode
 */
public class ColorUtil {
	
	public static Color getClickGUIColor(){
		return new Color((int) Pyxl.instance.settingsManager.getSettingByName("GuiRed").getValDouble(), (int)Pyxl.instance.settingsManager.getSettingByName("GuiGreen").getValDouble(), (int)Pyxl.instance.settingsManager.getSettingByName("GuiBlue").getValDouble());
	}
}
