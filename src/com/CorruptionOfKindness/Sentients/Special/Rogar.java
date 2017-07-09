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
import com.CorruptionOfKindness.Core.Enum.Race;
import com.CorruptionOfKindness.Core.Enum.Romantics;
import com.CorruptionOfKindness.Core.Enum.Sexuality;
import com.CorruptionOfKindness.Core.Enum.SkinColour;
import com.CorruptionOfKindness.Sentients.Orc;

public class Rogar extends Orc {

	public Rogar(com.CorruptionOfKindness.Core.GameState GameState) {
		super(GameState);
	}
	
	public String Name = "Ro'gar";
	
	public Race race = Race.Orc;
	
	public Gender gender = Gender.Male;
	
	public Sexuality sex = Sexuality.Homosexual;
	public Romantics romanticAtraction = Romantics.Homoromantic;
	
	public boolean female = false;
	public boolean male = true;
	
	public int age = 27;
	public int birthDate = 97;
	public Body Body = new Body(this);
	
	public int Health = 327;
	@SuppressWarnings("unused") //TODO fix
	private int maxHealth = 327;
	public int Fatigue = 0;
	public int lust = 30;
	
	public int Level = 7;
	public int Exp = 23;
	
	public void afterInit() {
		
		Body.mass = 113;
		Body.height = 212.5;
		Body.muscleTone = 55;
		Body.thickness = 30;
		Body.eyeColour = EyeColour.Hazel;
		Body.skinColour = SkinColour.Green;
		Body.hairColour = HairColour.Brown;
		
		BodyHair bHair = new BodyHair(Body);
		bHair.treasureTrail = true;
		bHair.treasureTrailDense = 2;
		bHair.armHair = true;
		bHair.armHairDense = 1;
		bHair.assHair = true;
		bHair.assHairDense = 1;
		bHair.chestHair = true;
		bHair.chestHairDense = 1;
		bHair.breastHair = true;
		bHair.breastHairDense = 1;
		bHair.pubicHair = true;
		bHair.pubicHairDense = 2;
		bHair.armPitHair = true;
		bHair.armPitHairDense = 1;
		bHair.legHair = true;
		bHair.legHairDense = 1;
		
		Body.setBodyHair(bHair);
		
		Genitals g = new Genitals(Body);
		
		Testicles balls = new Testicles(Body);
		
		balls.length = 1.5;
		balls.girth = 1;
		
		Penis penis = new HumanPenis();
		
		penis.length = 10;
		penis.girth = 2;
		
		penis.humanSkin = false;
		penis.orcSkin = true;
		
		g.Balls.add(balls);
		g.Cocks.add(penis);
		
		g.prostate = new Prostate();
		
		Body.genitals = g;
		
		Body.Strength = 36;
		Body.Toughness = 43;
		Body.Speed = 19;
		Body.Libido = 41;
		Body.Sensitivity = 31;
		
	}

}
