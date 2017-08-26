package com.CorruptionOfKindness.Body.Genitals.Templates;

import com.CorruptionOfKindness.Body.Genitals.Penis;
import com.CorruptionOfKindness.Core.Enum.CockSkin;

public class HorseCock extends Penis {
	
	public HorseCock() {
		
		length = 8;
		girth = 2.5;
		
		horseFlare = true;
		horseSheath = true;
		
		cockSkin = CockSkin.HorseCockSkin;
		
		foreskin = false;
		medianRing = true;
		
	}
	
	public static boolean horseCockCheck(Penis penis) {
		
		int points = 0;
		
		if (penis.length >= 8) points += 1;
		if (penis.length >= 16) points += 1;
		
		if (penis.girth > 2) points += 1;
		
		if (penis.cockSkin.toString().equals(
				CockSkin.HumanSkin.toString())) points += 1;
		else if (penis.cockSkin.toString().equals(
				CockSkin.HorseCockSkin.toString())) points += 2;
		else {
			
			points -= 2;
			
		}
		
		if (penis.horseFlare) points += 2;
		
		if (penis.horseSheath) points += 2;
		
		if (penis.medianRing) points += 1;
		
		if (penis.medianRings > 1) points += 1;
		
		if (penis.catSpikes) points -= 1;
		
		if (penis.dragonSpikes) return false;
		
		if (penis.splitCock) return false;
		
		if (penis.tentaclePenis) return false;
		
		if (penis.spearTip) return false;
		
		if (points >= 8) {
			
			return true;
			
		}
		else {
			
			return false;
			
		}
		
	}

}
