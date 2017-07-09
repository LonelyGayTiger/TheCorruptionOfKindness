package com.CorruptionOfKindness.Body;

import com.CorruptionOfKindness.CoreInterfaces.AfterInit;
import com.CorruptionOfKindness.CoreInterfaces.CheckInterface;

public class Bladder implements CheckInterface, AfterInit {
	
	public double urine = 0;
	private double maxUrine = 710;
	public int defaultValue = 710;

	@Override
	public void check() {
		// TODO Auto-generated method stub
		
		addUrine(1);
		
	}

	@Override
	public void idleCheck() {
		// TODO Auto-generated method stub
		
		addUrine(50);
		
	}

	@Override
	public void afterInit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waitCheck(double hours) {
		// TODO Auto-generated method stub
		
		addUrine((50 * hours));
		
	}
	
	public void urinate(boolean oops) {
		
		//TODO Add code
		
	}
	
	private void addUrine(double urine) {
		
		if ((urine + this.urine) >= maxUrine) {
			
			this.urine = this.maxUrine;
			urinate(true);
			
		}
		else {
			
			this.urine += urine;
			
		}
		
	}

}
