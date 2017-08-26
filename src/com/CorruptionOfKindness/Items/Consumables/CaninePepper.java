package com.CorruptionOfKindness.Items.Consumables;

import com.CorruptionOfKindness.Core.Entity;
import com.CorruptionOfKindness.Core.Enum.CaninePepperType;
import com.CorruptionOfKindness.CoreInterfaces.Transformative;
import com.CorruptionOfKindness.Items.Item;

public class CaninePepper extends Item implements Transformative {
	
	public final CaninePepperType type;
	
	public CaninePepper(CaninePepperType type) {
		
		this.type = type;
		
	}

	@Override
	public void use(Entity E) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void idleCheck() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waitCheck(double hours) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterInit() {
		// TODO Auto-generated method stub
		
	}

}
