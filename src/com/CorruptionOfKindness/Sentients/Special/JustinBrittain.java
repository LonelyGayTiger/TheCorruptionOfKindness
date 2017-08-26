package com.CorruptionOfKindness.Sentients.Special;

import com.CorruptionOfKindness.Body.Body;
import com.CorruptionOfKindness.Body.BodyHair;
import com.CorruptionOfKindness.Body.Genitals.Genitals;
import com.CorruptionOfKindness.Body.Genitals.Penis;
import com.CorruptionOfKindness.Body.Genitals.Prostate;
import com.CorruptionOfKindness.Body.Genitals.Testicles;
import com.CorruptionOfKindness.Body.Genitals.Templates.HumanPenis;
import com.CorruptionOfKindness.Core.Enum.EyeColour;
import com.CorruptionOfKindness.Core.Enum.Gender;
import com.CorruptionOfKindness.Core.Enum.HairColour;
import com.CorruptionOfKindness.Core.Enum.Romantics;
import com.CorruptionOfKindness.Core.Enum.Sexuality;
import com.CorruptionOfKindness.Core.Enum.SkinColour;
import com.CorruptionOfKindness.Core.Enum.TannerStage;
import com.CorruptionOfKindness.Sentients.Individual;

public class JustinBrittain extends Individual {

	public JustinBrittain(com.CorruptionOfKindness.Core.GameState GameState, boolean player) {
		super(GameState, player);
		// TODO Auto-generated constructor stub
	}
	
	public String Name = "Justin Brittain";
	
	public Gender gender = Gender.Male;
	public boolean Female = false;
	public boolean Male = true;
	
	public Sexuality sex = Sexuality.Bisexual;
	public Romantics romanticAtraction = Romantics.Biromantic;
	
	public boolean female = false;
	public boolean male = true;
	
	public int age = 21;
	public int birthDate = 351;
	public Body Body = new Body(this);
	
	public int Health = 172;
	public int Fatigue = 0;
	public int lust = 38;
	
	public int Level = 3;
	public int Exp = 186;
	
	public boolean hasGoneThroughPuberty = true;
	public boolean puberty = false;
	public boolean pubertyTrigger = false;
	public int startDate;
	public TannerStage TStage = TannerStage.StageFive;
	
	public void afterInit() {
		
		Body.mass = 61;
		Body.height = 175;
		Body.muscleTone = 25;
		Body.thickness = 13;
		Body.eyeColour = EyeColour.BlueishGreen;
		Body.skinColour = SkinColour.Fair;
		Body.hairColour = HairColour.DirtyBlonde;
		
		BodyHair bHair = new BodyHair(Body);
		bHair.treasureTrail = true;
		bHair.treasureTrailDense = 2;
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
		bHair.armPitHairDense = 1;
		bHair.legHair = true;
		bHair.legHairDense = 3;
		
		Body.setBodyHair(bHair);
		
		Genitals g = new Genitals(Body);
		
		Testicles balls = new Testicles(Body);
		
		balls.length = 0.5;
		balls.girth = 1;
		
		Penis penis = new HumanPenis();
		
		penis.length = 6.5;
		penis.girth = 1.8;
		
		penis.foreskin = false;
		
		g.Balls.add(balls);
		g.Cocks.add(penis);
		
		g.prostate = new Prostate();
		
		Body.genitals = g;
		
		Body.Strength = 21;
		Body.Toughness = 24;
		Body.Speed = 24;
		Body.Libido = 56;
		Body.Sensitivity = 59;
		
	}


}
