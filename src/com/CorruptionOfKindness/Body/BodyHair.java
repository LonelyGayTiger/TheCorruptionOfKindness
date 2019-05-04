package com.CorruptionOfKindness.Body;

import com.CorruptionOfKindness.CoreInterfaces.AfterInit;
import com.CorruptionOfKindness.CoreInterfaces.CheckInterface;
import com.CorruptionOfKindness.Utill.Utills;
import com.CorruptionOfKindness.Core.Enum.HairColour;
import com.CorruptionOfKindness.Core.Enum.HairType;

/**
 * 
 * @author LonelyGayTiger
 *
 */
public class BodyHair implements CheckInterface, AfterInit {
	
	private Body body;
	
	public HairColour hairColour = HairColour.Brown;
	
	public BodyHair(Body body) {
		
		this.body = body;
		hairColour = body.hairColour;
		
	}
	
	//Male Specific
	public boolean treasureTrail = false;
	public int treasureTrailDense = 0;
	public int treasuretrailHairLength;
	public HairType treasureTrailHairType = HairType.Hair;
	public boolean armHair = false;
	public int armHairDense = 0;
	public int armHairLength = 0;
	public HairType armHairType = HairType.Hair;
	public boolean assHair = false;
	public int assHairDense = 0;
	public int assHairLength = 0;
	public HairType assHairType = HairType.Hair;
	public boolean facialHair = false;
	public int facialHairDense = 0;
	public int facialHairLength = 0;
	public HairType facialHairType = HairType.Hair;
	public boolean chestHair = false;
	public int chestHairDense = 0;
	public int chestHairLength = 0;
	public HairType chestHairType = HairType.Hair;
	public boolean breastHair = false;
	public int breastHairDense = 0;
	public int breastHairLength = 0;
	public HairType breastHairType = HairType.Hair;
	public boolean backHair = false;
	public int backHairDense = 0;
	public int backHairLength = 0;
	public HairType backHairType = HairType.Hair;
	
	//Non gender specific
	public boolean pubicHair = false;
	public int pubicHairDense = 0;
	public int pubicHairLength = 0;
	public boolean armPitHair = false;
	public int armPitHairDense = 0;
	public int armPitHairLength = 0;
	public boolean legHair = false;
	public int legHairDense = 0;
	public int legHairLength = 0;
	
	public void setBody(Body body) {
		
		this.body = body;
		
	}
	
	public void setAll(HairType type) {
		
		treasureTrailHairType = type;
		armHairType = type;
		assHairType = type;
		
		
	}
	
	public void pubertyStage1() {
		
		if (!body.hasGoneThroughPuberty) {
			
			pubicHair = true;
			pubicHairDense = -1;
			
		}
		else {
			
			pubicHair = true;
			
		}
		
	}
	
	public void pubertyStage2() {
		
		if (!body.hasGoneThroughPuberty) {
			
			pubicHair = true;
			pubicHairDense = 1;
			armPitHair = true;
			armPitHairDense = -1;
			
			if (body.E.male) {
				
				facialHair = true;
				facialHairDense = -1;
				
			}
			
		}
		else {
			
			pubicHair = true;
			pubicHairDense += 1;
			
			if (body.E.male) {
				
				facialHair = true;
				facialHairDense += 1;
				
			}
			
		}
		
	}
	
	public void pubertyStage3() {
		
		pubicHair = true;
		pubicHairDense += 1;
		
		if (body.E.male) {
			
			facialHair = true;
			facialHairDense += 1;
			treasureTrail = true;
			breastHair = true;
			chestHair = true;
			
			if (!body.hasGoneThroughPuberty) {
				
				treasureTrailDense = -1;
				breastHairDense = -1;
				chestHairDense = -1;
				
			}
			
		}
		
	}
	
	public void pubertyStage4() {
		
		pubicHair = true;
		pubicHairDense += 1;
		legHair = true;
		
		if (!body.hasGoneThroughPuberty) {
			
			legHairDense = 1;
			
		}
		else {
			
			legHairDense += 1;
			
		}
		
		if (body.E.male) {
			
			facialHair = true;
			facialHairDense += 1;
			legHairDense += 1;
			treasureTrail = true;
			assHair = true;
			backHair = true;
			
			if (!body.hasGoneThroughPuberty) {
				
				treasureTrailDense = 1;
				assHairDense = 1;
				backHairDense = -1;
				
			}
			else {
				
				treasureTrailDense += 1;
				breastHairDense += 1;
				chestHairDense += 1;
				assHairDense += 1;
				
			}
			
		}
		
	}
	
	public void pubertyStage5() {
		
		pubicHair = true;
		pubicHairDense += 1;
		legHair = true;
		legHairDense += 1;
		
		if (body.E.male) {
			
			facialHair = true;
			facialHairDense += 1;
			legHairDense += 1;
			treasureTrail = true;
			assHair = true;
			backHair = true;
			
			if (!body.hasGoneThroughPuberty) {
				
				if (Utills.getRandomBoolean()) {
					
					chestHairDense += 1;
					breastHairDense += 1;
					treasureTrailDense += 1;
					backHairDense = 1;
					
					if (Utills.getRandomBoolean()) {
						
						assHairDense += 1;
						chestHairDense += 1;
						breastHairDense += 1;
						treasureTrailDense += 1;
						
					}
					
					if (Utills.getRandomBoolean()) {
						
						backHairDense += 1;
						
					}
					
				}
				
			}
			else {
				
				treasureTrailDense += 1;
				breastHairDense += 1;
				chestHairDense += 1;
				
				if (Utills.getRandomBoolean()) {
					
					if (Utills.getRandomBoolean()) {
						
						backHairDense += 1;
						
					}
					
					if (Utills.getRandomBoolean()) {
						
						assHairDense += 1;
						
					}
					
				}
				
			}
			
		}
		
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		hairColour = body.hairColour;
		
	}

	@Override
	public void idleCheck() {
		// TODO Auto-generated method stub
		
		//if 
		
	}

	@Override
	public void afterInit() {
		// TODO Auto-generated method stub
		//TODO add gender specific body hair upon character creation
		
	}

	@Override
	public void waitCheck(double hours) {
		// TODO Auto-generated method stub
		
	}

}
