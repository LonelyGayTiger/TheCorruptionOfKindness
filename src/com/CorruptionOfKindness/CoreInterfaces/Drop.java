package com.CorruptionOfKindness.CoreInterfaces;

import com.CorruptionOfKindness.Items.Bug;
import com.CorruptionOfKindness.Items.Item;

public interface Drop {
	
	Item[] dropOnDeath = {new Bug(), null, null}; //Make sure this gets replaced for each creature, Bug is a debug alert thing
	Item[] dropOnOrgasmLoss = {new Bug(), null, null}; //Make sure this gets replaced for the relevant creatures, Minotaur, Dragon, etc

}
