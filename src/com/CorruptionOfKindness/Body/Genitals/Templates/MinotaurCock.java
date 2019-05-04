package com.CorruptionOfKindness.Body.Genitals.Templates;

import com.CorruptionOfKindness.Body.Genitals.Penis;
import com.CorruptionOfKindness.Core.Enum.CockSkin;

/**
 * 
 * @author LonelyGayTiger
 *
 */
public class MinotaurCock extends Penis {
	
	public MinotaurCock() {
		
		length = 16;
		girth = 4;
		
		horseFlare = true;
		horseSheath = true;
		
		cockSkin = CockSkin.HorseCockSkin;
		
		foreskin = false;
		medianRing = true;
		medianRings = 3;
		
	}
	
	public static boolean minotaurCockCheck(Penis penis) {
		
		int points = 0;
		
		if (penis.length >= 12) points += 1;
		if (penis.length >= 18) points += 1;
		
		if (penis.girth > 3.5) points += 1;
		
		if (penis.cockSkin.toString().equals(
				CockSkin.HorseCockSkin.toString())) points += 2;
		else {
			
			points -= 2;
			
		}
		
		if (penis.horseFlare) points += 2;
		
		if (penis.horseSheath) points += 2;
		
		if (penis.medianRing) points += 1;
		
		if (penis.medianRings >= 3) points += 1;
		
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
