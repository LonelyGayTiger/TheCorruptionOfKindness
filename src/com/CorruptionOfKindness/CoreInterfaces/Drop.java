package com.CorruptionOfKindness.CoreInterfaces;

import com.CorruptionOfKindness.Items.Bug;
import com.CorruptionOfKindness.Items.Item;

public interface Drop {
	
	Item[] dropOnDeathR = {new Bug()}; //Make sure this gets replaced for each creature, Bug is a debug alert thing
	Item[] dropOnOrgasmLoss = {new Bug()}; //Make sure this gets replaced for the relevant creatures, Minotaur, Dragon, etc

}
