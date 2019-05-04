package com.CorruptionOfKindness.Creatures.Parasites;

import com.CorruptionOfKindness.Core.Entity;
import com.CorruptionOfKindness.CoreInterfaces.Drop;
import com.CorruptionOfKindness.CoreInterfaces.Parasite;
import com.CorruptionOfKindness.CoreInterfaces.Transformative;

/**
 * 
 * @author LonelyGayTiger
 *
 */
public class TentacleParasite extends Entity implements Parasite, Drop, Transformative {

	public TentacleParasite(com.CorruptionOfKindness.Core.GameState GameState) {
		super(GameState, false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void use(Entity E) {
		// TODO Auto-generated method stub
		
	}

}
