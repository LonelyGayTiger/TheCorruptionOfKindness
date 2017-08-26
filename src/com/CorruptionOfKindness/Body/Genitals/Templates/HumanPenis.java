package com.CorruptionOfKindness.Body.Genitals.Templates;

import com.CorruptionOfKindness.Body.Genitals.Penis;
import com.CorruptionOfKindness.Core.Enum.CockSkin;

public class HumanPenis extends Penis {
	
	public static boolean checkHumanPenis(Penis penis) {
		
		int points = 0;
		
		if (penis.catSpikes) points -= 1;
		
		if (penis.dogSheath) return false;
		
		if (penis.dragonSheath) return false;
		
		if (penis.horseSheath) return false;
		
		if (penis.dragonSpikes) return false;
		
		if (penis.tentacleSheath) return false;
		
		if (penis.horseFlare) return false;
		
		if (penis.humanGlands) points += 2;
		
		if (penis.cockSkin.toString().equals(
				CockSkin.HumanSkin.toString())) points += 1;
		else {
			
			points -= 2;
			
		}
		
		if (penis.tentaclePenis) return false;
		
		if (penis.spearTip) return false;
		
		if (points >= 2) {
			
			return true;
			
		}
		else {
			
			return false;
			
		}
		
	}

}
