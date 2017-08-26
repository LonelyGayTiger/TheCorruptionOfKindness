package com.CorruptionOfKindness.Sentients.Special;

import com.CorruptionOfKindness.Body.Body;
import com.CorruptionOfKindness.Body.BodyHair;
import com.CorruptionOfKindness.Body.Genitals.Genitals;
import com.CorruptionOfKindness.Body.Genitals.Penis;
import com.CorruptionOfKindness.Body.Genitals.Prostate;
import com.CorruptionOfKindness.Body.Genitals.Testicles;
import com.CorruptionOfKindness.Body.Genitals.Templates.HumanPenis;
import com.CorruptionOfKindness.Core.Entity;
import com.CorruptionOfKindness.Core.Enum.EyeColour;
import com.CorruptionOfKindness.Core.Enum.Gender;
import com.CorruptionOfKindness.Core.Enum.HairColour;
import com.CorruptionOfKindness.Core.Enum.Romantics;
import com.CorruptionOfKindness.Core.Enum.Sexuality;
import com.CorruptionOfKindness.Core.Enum.SkinColour;
import com.CorruptionOfKindness.Core.Enum.TannerStage;
import com.CorruptionOfKindness.Core.GameState;

public class CameronBarnes extends Entity {
	
public CameronBarnes(GameState GameState, boolean player) {
	
		super(GameState, player);
		
	}

	public String Name = "Cameron Barnes";
	
	public Gender gender = Gender.Male;
	public boolean Female = false;
	public boolean Male = true;
	
	public Sexuality sex = Sexuality.Homosexual;
	public Romantics romanticAtraction = Romantics.DemiPanromantic;
	
	public boolean female = false;
	public boolean male = true;
	
	public int age = 17;
	public int birthDate = 205;
	public Body Body = new Body(this);
	
	public int Health = 172;
	public int Fatigue = 0;
	public int lust = 38;
	
	public int Level = 3;
	public int Exp = 186;
	
	public boolean hasGoneThroughPuberty = false;
	public boolean puberty = true;
	public boolean pubertyTrigger = false;
	public int startDate;
	public TannerStage TStage = TannerStage.StageFour;
	
	public void afterInit() {
		
		Body.mass = 51;
		Body.height = 175;
		Body.muscleTone = 20;
		Body.thickness = 10;
		Body.eyeColour = EyeColour.Brown;
		Body.skinColour = SkinColour.Fair;
		Body.hairColour = HairColour.Brown;
		
		BodyHair bHair = new BodyHair(Body);
		bHair.treasureTrail = true;
		bHair.treasureTrailDense = 1;
		bHair.armHair = true;
		bHair.armHairDense = 2;
		bHair.assHair = true;
		bHair.assHairDense = 2;
		bHair.chestHair = true;
		bHair.chestHairDense = -1;
		bHair.breastHair = false;
		bHair.breastHairDense = 0;
		bHair.pubicHair = true;
		bHair.pubicHairDense = 2;
		bHair.armPitHair = true;
		bHair.armPitHairDense = 2;
		bHair.legHair = true;
		bHair.legHairDense = 2;
		
		Body.setBodyHair(bHair);
		
		Genitals g = new Genitals(Body);
		
		Testicles balls = new Testicles(Body);
		
		balls.length = 2;
		balls.girth = 1.25;
		
		Penis penis = new HumanPenis();
		
		penis.length = 8.5;
		penis.girth = 2.3;
		
		penis.foreskin = false;
		
		g.Balls.add(balls);
		g.Cocks.add(penis);
		
		g.prostate = new Prostate();
		
		Body.genitals = g;
		
		Body.Strength = 16;
		Body.Toughness = 21;
		Body.Speed = 27;
		Body.Libido = 48;
		Body.Sensitivity = 49;
		
	}

}
