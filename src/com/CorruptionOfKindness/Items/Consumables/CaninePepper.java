package com.CorruptionOfKindness.Items.Consumables;

import com.CorruptionOfKindness.Core.Entity;
import com.CorruptionOfKindness.Core.Enum.CaninePepperType;
import com.CorruptionOfKindness.CoreInterfaces.Transformative;

public class CaninePepper implements Transformative {
	
	public final CaninePepperType type;
	
	public CaninePepper(CaninePepperType type) {
		
		this.type = type;
		
	}

	@Override
	public void use(Entity E) {
		// TODO Auto-generated method stub
		
	}

}
