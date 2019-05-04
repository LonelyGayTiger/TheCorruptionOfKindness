package com.CorruptionOfKindness.Body.Genitals.Templates;

import com.CorruptionOfKindness.Body.Genitals.Penis;
import com.CorruptionOfKindness.Core.Enum.CockSkin;

/**
 * 
 * @author LonelyGayTiger
 *
 */
public class TentacleCock extends Penis {
	
	public double length = 13;
	public double girth = 2.5;
	
	public boolean humanSkin = false;
	public boolean plantTentacleSkin = true;
	
	public boolean humanGlands = false;
	public boolean tentaclePenis = true;
	
	public boolean foreskin = false;
	public boolean tentacleSheath = true;
	
	public TentacleCock() {
		
		length = 13;
		girth = 3;
		
		cockSkin = CockSkin.PlantTentacleSkin;
		
		humanGlands = false;
		tentaclePenis = true;
		
		foreskin = false;
		tentacleSheath = true;
		
	}
	
	public static boolean tentacleCockCheck(Penis penis) {
		
		int points = 0;
		
		if (penis.length <= 7) points -= 1;
		if (penis.length >= 13) points += 1;
		if (penis.length >= 20) points += 1;
		
		if (penis.girth > 2.5) points += 1;
		
		if (penis.cockSkin.toString().equals(
				CockSkin.PlantTentacleSkin.toString())) points += 1;
		else if (penis.cockSkin.toString().equals(
				CockSkin.DemonTentacleSkin.toString())) points += 2;
		else {
			
			points -= 2;
			
		}
		
		if (penis.horseFlare) return false;
		
		if (penis.horseSheath) points -= 2;
		else if (penis.foreskin) points -= 3;
		else if (penis.tentacleSheath) points += 2;
		else if (penis.dragonSheath) points -= 1;
		else {
			
			return false;
			
		}
		
		if (penis.medianRing) points += 1;
		
		if (penis.medianRings >= 2) points += 1;
		
		if (penis.dragonSpikes) points -= 2;
		
		if (penis.splitCock) return false;
		
		if (penis.tentaclePenis) points += 3;
		
		if (penis.spearTip) return false;
		
		if (points >= 5) {
			
			return true;
			
		}
		else {
			
			return false;
			
		}
		
	}

}
