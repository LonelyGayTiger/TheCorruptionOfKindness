package com.CorruptionOfKindness.Creatures;

import com.CorruptionOfKindness.Body.Body;
import com.CorruptionOfKindness.Core.Entity;
import com.CorruptionOfKindness.Core.Enum.Gender;
import com.CorruptionOfKindness.Core.Enum.Romantics;
import com.CorruptionOfKindness.Core.Enum.Sexuality;
import com.CorruptionOfKindness.Core.Enum.TannerStage;
import com.CorruptionOfKindness.CoreInterfaces.AfterInit;
import com.CorruptionOfKindness.CoreInterfaces.Drop;
import com.CorruptionOfKindness.Utill.Utills;

public class Wolf extends Entity implements AfterInit, Drop {

	public Wolf(com.CorruptionOfKindness.Core.GameState GameState, boolean player) {
		super(GameState, player);
		// TODO Auto-generated constructor stub
	}
	
	public String Name = "Wolf";
	
	public Gender gender = Gender.Male;
	public boolean Female = false;
	public boolean Male = true;
	
	public Sexuality sex = Sexuality.Heteroflexible;
	public Romantics romanticAtraction = Romantics.Heteroromantic;
	
	public boolean female = false;
	public boolean male = true;
	
	public int age = Utills.randomInt(1, 3);
	public int birthDate = Utills.randomInt(1, 365);
	public Body Body = new Body(this);
	
	public int Health = 200;
	public int Fatigue = 0;
	public int lust = 38 + Utills.randomInt(0, 21);
	
	public int Level = 7;
	public int Exp = 186;
	
	public boolean hasGoneThroughPuberty = true;
	public boolean puberty = false;
	public boolean pubertyTrigger = false;
	public int startDate;
	public TannerStage TStage = TannerStage.StageFive;
	
	public void afterInit() {
		
		
		
	}

}
