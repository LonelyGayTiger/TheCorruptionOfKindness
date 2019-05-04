package com.CorruptionOfKindness.Map.Areas;

import com.CorruptionOfKindness.Core.Area;

/**
 * 
 * @author LonelyGayTiger
 *
 */
public class Camp extends Area {
	
	public final String Name = "Camp";
	public boolean discovered = true;
	
	//Resources
	public int wood = 0;
	public int stone = 0;
	
	//Camp improvements
	public final String[] improvements = {"Fire", "A-Frame Shelter", "Makeshift Wall", 
											"Wooden Hut", "Wood Wall", "Stone Hut", 
											"Stone Wall", "Log Cabin", "Reinforced Wall"};
	public final int[] stoneRequired = {5, 2, 10, 10, 15, 25, 40, 40, 60};
	public final int[] woodRequired = {5, 8, 20, 20, 30, 20, 25, 60, 60};
	
	//GUI Button names and states
	public boolean[] btnStateArray = {true, false, true, false, false,
									  false, false, false, true, true};
	public String[] btnNameArray = {"Explore", null, "Inventory", null, null,
									"Build", null, null, "Materbate", "Wait"};
	
	//GUI Button commands
	@Override
	public int btn1Press() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int btn2Press() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int btn3Press() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int btn4Press() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int btn5Press() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int btn6Press() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int btn7Press() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int btn8Press() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int btn9Press() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int btn10Press() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
