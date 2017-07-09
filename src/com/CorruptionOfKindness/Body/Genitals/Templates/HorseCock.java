package com.CorruptionOfKindness.Body.Genitals.Templates;

import com.CorruptionOfKindness.Body.Genitals.Penis;

public class HorseCock extends Penis {
	
	public double length = 8; //Minimum
	public double girth = 2.5;
	
	public boolean horseFlare = true;
	public boolean horseSheath = true;
	public boolean humanSkin = false;
	public boolean foreskin = false;
	public boolean horseCockSkin = true;
	public boolean medianRing = true;
	public int medianRings = 1;
	
	public static boolean horseCockCheck(Penis penis) {
		
		int points = 0;
		
		if (penis.length >= 8) points += 1;
		if (penis.length >= 16) points += 1;
		
		if (penis.girth > 2) points += 1;
		
		if (penis.humanSkin) points += 1;
		else if (penis.horseCockSkin) points += 2;
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
