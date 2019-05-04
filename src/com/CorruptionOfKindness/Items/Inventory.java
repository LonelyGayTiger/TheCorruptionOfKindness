package com.CorruptionOfKindness.Items;

import com.CorruptionOfKindness.Body.Body;
import com.CorruptionOfKindness.Core.Perks;
import com.CorruptionOfKindness.Items.Armor.Armor;
import com.CorruptionOfKindness.Items.Weapons.Weapon;

/**
 * 
 * @author LonelyGayTiger
 *
 */
public class Inventory {
	
	public Weapon equipedWeapon = null;
	public Armor equipedArmor = null;
	
	private Item[] inven =  {null, null, null, null, null};
	
	Body body;
	Perks perks;
	
	public int maxWeight;
	private int numOfSlots = 3;
	
	public Inventory(Body body, Perks perks) {
		
		this.perks = perks;
		this.body = body;
		maxWeight = body.Strength;
		
		check();
		
	}
	
	public boolean addItem(Item item) {
		
		for (int i = 0; i <= numOfSlots; i++) {
			
			if (inven[i].getClass().equals(item.getClass())) {
				
				if (inven[i].addItemToStack()) {
					
					return true;
					
				}
				
			}
			if (inven[i] == null) {
				
				inven[i] = item;
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	public boolean removeItem(Item item) {
		
		for (int i = 0; i <= numOfSlots; i++) {
			
			if (inven[i].getClass().equals(item.getClass())) {
				
				if (inven[i].removeItemFromStack()) {
					
					if (inven[i].getNumOfItems() == 0) {
						
						inven[i] = null;
						
					}
					
					return true;
					
				}
				
			}
			
		}
		
		return false;
		
	}
	
	public Item[] getInventory() {
		
		return inven.clone();
		
	}

	public void check() {
		
		maxWeight = body.Strength;
		
		if (perks.perks.get("Strong Back")) {
			
			numOfSlots = 4;
			
			if (perks.perks.get("Strong Back 2")) numOfSlots = 5;
			
		}
		
	}

}
