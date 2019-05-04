package com.CorruptionOfKindness.Core;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author LonelyGayTiger
 *
 */
public class Perks {
	
	public Map<String, Boolean> perks = new HashMap<String, Boolean>();
	
	public Perks() {
		
		perks.put("Strong Back", false);
		perks.put("Strong Back 2", false);
		perks.put("Runner", false);
		perks.put("Evade", false);
		perks.put("Tank", false);
		perks.put("Tank 2", false);
		perks.put("Precision", false);
		perks.put("Nimble", false);
		perks.put("Messy Orgasms", false);
		perks.put("Fertile+", false);
		
		//System.out.println(perks.toString());
		
	}

}
