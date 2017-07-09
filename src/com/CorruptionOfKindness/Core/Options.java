package com.CorruptionOfKindness.Core;

import java.util.HashMap;
import java.util.Map;

import com.CorruptionOfKindness.CoreInterfaces.AfterInit;

public class Options implements AfterInit {
	
	public String Path = "C:\\Users\\" 
	+ System.getProperty("user.name") + "\\Documents\\My games\\CorruptionOfKindness";
	
	public final String VERSION	= "v0.3 UI and Areas";
	
	public boolean exsistingSave = false;
	
	public boolean urine = true;
	public boolean urinePlay = false;
	public boolean parasites = true;
	
	private int maxHeight = 200;
	private int minHeight = 120;
	
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
	public final String[] fonts = {"Tahoma"};
	
	@Override
	public void afterInit() {
		
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
	
	public String getFont() {
		
		return fonts[selectedFont];
		
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
	 * @return the warlock
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
