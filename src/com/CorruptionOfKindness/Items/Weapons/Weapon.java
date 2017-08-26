package com.CorruptionOfKindness.Items.Weapons;

import com.CorruptionOfKindness.Items.Item;

public abstract class Weapon extends Item {
	
	//Basic Weapon stats
	public double dammage;
	
	public boolean magic = false;
	public double magicMult = 1;
	
	//Player wield requirements
	public int strengthRec;
	public int toneRec;
	public int heightRec;
	
	public int maxCorr = 100;
	public int minCorr = 0;
	
	public void check() {
		
		super.check();
		
	}


	@Override
	public void idleCheck() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void afterInit() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void waitCheck(double hours) {
		// TODO Auto-generated method stub
		
	}

}
