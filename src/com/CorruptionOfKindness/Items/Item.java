package com.CorruptionOfKindness.Items;

import com.CorruptionOfKindness.CoreInterfaces.AfterInit;
import com.CorruptionOfKindness.CoreInterfaces.CheckInterface;

public abstract class Item implements CheckInterface, AfterInit {
	
	public String name;
	public double mass;
	public double weight;
	public boolean Corrupted = false;
	public boolean Hallowed = false;
	
	public void check() {
		
		if (Corrupted) { //TODO This is very broken plz fix
			
			Hallowed = false;
			weight = (mass * 1.22);
			
		}
		else if (Hallowed) {
			
			weight = (mass * 0.7);
			
		}
		else {
			
			weight = mass;
			
		}
		
	}
	
	public void cleanse() {
		
		Corrupted = false;
		
	}

}
