package com.CorruptionOfKindness.Map.Locations.Story;

import com.CorruptionOfKindness.Core.Location;

public class Start extends Location {
	
	public Start() {
		
		super();
		
		for (int i = 0; i < 10; i++) {
			
			btnStateArray[i] = false;
			btnNameArray[i] = " ";
			
		}
		
		btnStateArray[0] = true;
		btnNameArray[0] = "Fight";
		
		text = "HEY! Does this work?";
		updateText = true;
		
	}

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
