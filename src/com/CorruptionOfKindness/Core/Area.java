package com.CorruptionOfKindness.Core;

import com.CorruptionOfKindness.CoreInterfaces.AfterInit;

/**
 * 
 * @author LonelyGayTiger
 *
 */
public abstract class Area implements AfterInit {
	
	private String Name;
	
	protected String desc;
	protected String text;
	public boolean updateText = false;
	
	int[] btnIteration = {0, 0, 0, 0 , 0, 0, 0, 0, 0, 0};
	
	protected boolean discovered = false;
	protected boolean discoverable = true;
	public boolean[] btnStateArray = {true, true, true, true, true, true, true, true, true, true};
	public String[] btnNameArray = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
	
	public String getName() {
		
		return Name;
		
	}
	
	public void discover() {
		
		discovered = true;
		
	}
	
	public abstract int btn1Press();
	
	public abstract int btn2Press();
	
	public abstract int btn3Press();
	
	public abstract int btn4Press();
	
	public abstract int btn5Press();
	
	public abstract int btn6Press();
	
	public abstract int btn7Press();
	
	public abstract int btn8Press();
	
	public abstract int btn9Press();
	
	public abstract int btn10Press();

	@Override
	public void afterInit() {
		// TODO Auto-generated method stub

	}

}
