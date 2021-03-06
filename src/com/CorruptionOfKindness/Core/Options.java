package com.CorruptionOfKindness.Core;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.HashMap;
import java.util.Map;

import com.CorruptionOfKindness.Core.Main.IO;
import com.CorruptionOfKindness.Core.Enum.OSType;
import com.CorruptionOfKindness.CoreInterfaces.AfterInit;

/**
 * 
 * @author LonelyGayTiger
 *
 */
public class Options implements AfterInit {
	
	public OSType OS = OSType.Windows;
	
	public String Path = "C:\\Users\\" 
	+ System.getProperty("user.name") + "\\Documents\\My games\\CorruptionOfKindness";
	
	public final String VERSION	= "v0.4 GameManager";
	
	public boolean urine = true;
	public boolean urinePlay = false;
	public boolean parasites = true;
	
	private int maxHeight = 200;
	private int minHeight = 130;
	
	public boolean easyMode = false;
	private boolean debug = false;
	
	//Character Enable
	private Map<String, Boolean> characterMap = new HashMap<String, Boolean>();
	
	//species enable
	private boolean warlock = false;
	
	//Character Creator
	public final int CHAR_CREATE_WIDTH = 450;
	public final int CHAR_CREATE_HEIGHT = 300;
	
	//MainFrame
	public final int MAIN_FRAME_WIDTH = 1024;
	public final int MAIN_FRAME_HEIGHT = 784;
	
	//Font and text size
	public int selectedFont = 0;
	public String[] fonts = {"Tahoma"};
	public int fontSize = 14;
	
	@Override
	public void afterInit() {
		
		OS = IO.getOperatingSystemType();
		
		switch (OS) {
		
		case Windows:
			Path = "C:\\Users\\" 
					+ System.getProperty("user.name") + "\\Documents\\My games\\CorruptionOfKindness";
			break;
		case Linux:
			Path = "/home/" + System.getProperty("user.name") + "/.CorruptionOfKindness";
			break;
		case MacOS:
			break;
		default:
			break;
		
		}
		
		characterMap.put("Auriel", true);
		characterMap.put("Cameron", true);
		characterMap.put("Evelyn", true);
		characterMap.put("Gabriel", true);
		characterMap.put("Justin", true);
		characterMap.put("Leo", true);
		characterMap.put("Lone", true);
		characterMap.put("Lucian", true);
		characterMap.put("Lucian Farsky", true);
		characterMap.put("Beast", true);
		
	}
	
	public boolean getCharacterEnabled(String key) {
		
		return characterMap.get(key);
		
	}
	
	public Font getFont() {
		
		return new Font(fonts[selectedFont], fontSize, Font.PLAIN);
		
	}
	
	public void updateFonts() {
		
		fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
	}
	
	public boolean setMaxHeight(int max) {
		
		if (debug) {
			
			this.maxHeight = max;
			return true;
			
		}
		else {
			
			return false;
			
		}
		
	}
	
	public boolean setMinHeight(int min) {
		
		if (debug) {
			
			this.minHeight = min;
			return true;
			
		}
		else {
			
			return false;
			
		}
		
	}
	
	public int getMaxHeight() {
		
		return maxHeight;
		
	}
	
	public int getMinHeight() {
		
		return minHeight;
		
	}
	
	public boolean getDebugState() {
		
		return debug;
		
	}

	/**
	 * @return the value for warlock
	 */
	public boolean isWarlock() {
		return warlock;
	}

	/**
	 * @param set the value for warlock
	 */
	public void setWarlock(boolean warlock) {
		this.warlock = warlock;
	}

}
