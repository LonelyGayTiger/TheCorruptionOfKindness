package com.CorruptionOfKindness.Items.Weapons;

import com.CorruptionOfKindness.Items.Item;

public class Weapon extends Item {
	
	//Basic Weapon stats
	public double dammage;
	public double hitChance;
	
	//Player wield requirements
	public int toneRec;
	public int heightRec;
	
	
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
