package com.CorruptionOfKindness.Body.Genitals.Templates;

import com.CorruptionOfKindness.Body.Genitals.Penis;

public class MinotaurCock extends Penis {
	
	public double length = 12; //Minimum
	public double girth = 4;
	
	public boolean horseFlare = true;
	public boolean horseSheath = true;
	public boolean humanSkin = false;
	public boolean foreskin = false;
	public boolean horseCockSkin = true;
	public boolean medianRing = true;
	public int medianRings = 3;
	
	public static boolean minotaurCockCheck(Penis penis) {
		
		int points = 0;
		
		if (penis.length >= 12) points += 1;
		if (penis.length >= 18) points += 1;
		
		if (penis.girth > 3.5) points += 1;
		
		if (penis.horseCockSkin) points += 2;
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
