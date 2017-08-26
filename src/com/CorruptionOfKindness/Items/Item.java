package com.CorruptionOfKindness.Items;

import com.CorruptionOfKindness.CoreInterfaces.AfterInit;
import com.CorruptionOfKindness.CoreInterfaces.CheckInterface;

public abstract class Item implements CheckInterface, AfterInit {
	
	public String name;
	public double mass;
	public double weight;
	public boolean Corrupted = false;
	public boolean Hallowed = false;
	
	private int numOfItems = 1;
	
	public int getNumOfItems() {
		
		return numOfItems;
		
	}
	
	public boolean addItemToStack() {
		
		if (numOfItems >= 5) {
			
			numOfItems = 5;
			return false;
			
		}
		else {
			
			numOfItems++;
			return true;
			
		}
		
	}

	public boolean removeItemFromStack() {
		
		if (numOfItems <= 0) {
			
			numOfItems = 0;
			return false;
			
		}
		else {
			
			numOfItems--;
			return true;
			
		}
		
	}
	
	public void check() {
		
		if (Corrupted) {
			
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
