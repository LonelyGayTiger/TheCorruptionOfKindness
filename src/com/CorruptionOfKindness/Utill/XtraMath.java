package com.CorruptionOfKindness.Utill;

import java.math.BigDecimal;

public class XtraMath {
	
	public static String convertCmToFI(double cm) {
		
		double feet = cm/30.48;
		double inches = (cm/2.54) - ((int)feet * 12);
		
		return (feet + "feet " + inches + "inches");
		
	}
	
	public static String convertCmToFI(int cm) {
		
		double feet = cm/30.48;
		double inches = (cm/2.54) - ((int)feet * 12);
		int feetInt = (int) feet;
		
		inches = roundDouble(inches, 1);
		
		return (feetInt + "'feet " + inches + "\"inches");
		
	}
	
	public static double EllipsoidVolume(double l, double w, double h) {
		
		double halfL, halfW, halfH;
		halfL = (l / 2);
		halfW = (w / 2);
		halfH = (h / 2);
		
		int roundVolume;
		
		BigDecimal volume;
		
		volume = new BigDecimal(1.333333333 * (Math.PI * (halfL * halfW * halfH)));
		
		roundVolume = volume.movePointRight(2).intValue();
		volume = new BigDecimal(roundVolume).movePointLeft(2);
		
		return volume.doubleValue();
		
	}
	
	public static double cmi(double cm) {
		
		return (cm / 2.5);
		
	}
	
	public static double icm(double inches) {
		
		return (inches * 2.5);
		
	}
	
	public static double roundDouble(double Double, int places) {
		
		return new BigDecimal(new BigDecimal(Double).movePointRight(places).intValue()).movePointLeft(places).doubleValue();
		
	}

}
