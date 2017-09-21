package com.CorruptionOfKindness.Body.Genitals;

import com.CorruptionOfKindness.Body.Genitals.Templates.HorseCock;
import com.CorruptionOfKindness.Body.Genitals.Templates.HumanPenis;
import com.CorruptionOfKindness.Body.Genitals.Templates.MinotaurCock;
import com.CorruptionOfKindness.Body.Genitals.Templates.TentacleCock;
import com.CorruptionOfKindness.Core.Enum.CockSkin;
import com.CorruptionOfKindness.CoreInterfaces.AfterInit;
import com.CorruptionOfKindness.CoreInterfaces.GetDescription;
import com.CorruptionOfKindness.CoreInterfaces.Orgasm;
import com.CorruptionOfKindness.Utill.Utills;

public class Penis implements AfterInit, Orgasm, GetDescription {
	
	public double length = 5;
	public double girth = 1;
	public double volume = 5;
	
	//Cockskin
	public CockSkin cockSkin = CockSkin.HumanSkin;
	
	//Glands
	public boolean humanGlands = true;
	public boolean horseFlare = false;
	public boolean spearTip = false; //Used for Dog Cocks or Dragon cocks
	public boolean tentaclePenis = false;
	public boolean splitCock = false;
	
	//Knots and Other Protrusions
	public boolean knot = false;
	public int knotGirth = 1;
	public int knotLength = 1;
	public boolean dragonSpikes = false;
	public int spikeSize = 1;
	public boolean catSpikes = false;
	public boolean bumps = false;
	public boolean medianRing = false;
	public int medianRings = 1;
	
	//Sheath and Coverings
	public boolean foreskin = true;
	public boolean dogSheath = false;
	public boolean horseSheath = false;
	public boolean dragonSheath = false;
	public boolean tentacleSheath = false;
	
	public final String[] cockSizeDesc = 
		{"micro", "tiny", "small", "average", "big", "huge", "giant", "monsterous"}; 
	
	public int calculateCockSizeInt() {
		
		if (length >= 5 && length < 6) return 3;
		else if (length >= 4 && length < 5) return 2;
		else if (length >= 2.5 && length < 4) return 1;
		else if (length < 2.5) return 0;
		else if (length >= 6 && length < 8.5) return 4;
		else if (length >= 8.5 && length < 10) return 5;
		else if (length >= 10 && length < 14) return 6;
		else if (length >= 14) return 7;
		
		return 1;
		
	}
	
	public String getCockType() {
		
		if (HumanPenis.checkHumanPenis(this)) return "human";
		else if (HorseCock.horseCockCheck(this)) return "horse";
		else if (MinotaurCock.minotaurCockCheck(this)) return "minotaur";
		else if (TentacleCock.tentacleCockCheck(this)) return "tentacle";
		return "human";
		
	}
	
	public String getCockTypeDesc() {
		
		if (HumanPenis.checkHumanPenis(this)) return "cock";
		else if (HorseCock.horseCockCheck(this)) {
			
			int i = Utills.randomInt(0, 2);
			
			switch (i) {
			
			case 0:
				
				return "stalion cock";
			case 1:
				
				return "horse-cock";
			case 2:
				
				return "horse-shaft";
			
			}
			
		}
		else if (MinotaurCock.minotaurCockCheck(this)) {
			
			int i = Utills.randomInt(0, 5);
			
			switch (i) {
			
			case 0:
				
				return "horse-cock";
			case 1:
				
				return "minotaur cock";
			case 2:
				
				return "stalion cock";
			case 3:
				
				return "horse-shaft";
			case 4:
				
				return "horse-member";
			case 5:
				
				return "minotaur cock";
			
			}
			
		}
		else if (TentacleCock.tentacleCockCheck(this)) return "tentacle cock";
		return "cock";
		
	}
	
	public String getDescription() {
		
		int size = calculateCockSizeInt();
		
		String s = "";
		
		s = ( s + "Your " + cockSizeDesc[size] + ", " + getCockTypeDesc() + "is " + length 
				+ "inches long, and " + girth + " inches thick.");
		
		if (getCockType().equals("minotaur")) {
			
			
			
		}
		else if (getCockType().equals("horse")) {
			
			
			
		}
		
		return s;
		
	}

	@Override
	public void afterInit() {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void orgasm() {
		// TODO Auto-generated method stub
		
	}

}
