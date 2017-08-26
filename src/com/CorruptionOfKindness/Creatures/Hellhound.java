package com.CorruptionOfKindness.Creatures;

import com.CorruptionOfKindness.Body.Genitals.Prostate;
import com.CorruptionOfKindness.Body.Genitals.Testicles;
import com.CorruptionOfKindness.Body.Genitals.Templates.DogCock;
import com.CorruptionOfKindness.Core.Entity;
import com.CorruptionOfKindness.Core.Enum.BeardStyle;
import com.CorruptionOfKindness.Core.Enum.Build;
import com.CorruptionOfKindness.Core.Enum.CaninePepperType;
import com.CorruptionOfKindness.Core.Enum.Gender;
import com.CorruptionOfKindness.Core.Enum.HairType;
import com.CorruptionOfKindness.Core.Enum.Race;
import com.CorruptionOfKindness.Core.Enum.Romantics;
import com.CorruptionOfKindness.Core.Enum.Sexuality;
import com.CorruptionOfKindness.Core.Enum.SpecialSexTrait;
import com.CorruptionOfKindness.Core.Enum.TailType;
import com.CorruptionOfKindness.CoreInterfaces.AfterInit;
import com.CorruptionOfKindness.CoreInterfaces.Drop;
import com.CorruptionOfKindness.Items.Consumables.CaninePepper;
import com.CorruptionOfKindness.Utill.Utills;

public class Hellhound extends Entity implements AfterInit, Drop {

	public Hellhound(com.CorruptionOfKindness.Core.GameState GameState) {
		super(GameState, false);
		
		Name = "Male HellHound";
		
		race = Race.Hellhound;
		
		gender = Gender.Male;
		
		sex = Sexuality.Heteroflexible;
		romanticAtraction = Romantics.Aromantic;
		
		female = false;
		male = true;
		
		super.Level = Utills.randomInt(6, 8);
		
		setGold(Utills.randomInt(4, 11));
		
		Body.beardStyle = BeardStyle.Fur;
		Body.belly = 3;
		Body.build = Build.Normal;
		Body.specialAtribute = SpecialSexTrait.Bulgy;
		Body.tail = true;
		Body.tailType = TailType.Dog;
		
		Testicles t = new Testicles(Body);
		t.length = 2;
		t.girth = 2;
		t.afterInit();
		
		Body.genitals.Balls.add(t);
		
		if (Utills.getRandomBoolean()) {
			
			Body.genitals.Balls.add(t.clone());
			dropOnDeath[1] = new CaninePepper(CaninePepperType.Bulbous);
			
		}
		
		DogCock c = new DogCock();
		c.girth = 2.5;
		c.length = 8;
		c.knotGirth = 2;
		c.knotLength = 2;
		
		Body.genitals.Cocks.add(c);
		Body.genitals.Cocks.add(c);
		
		Body.genitals.prostate = new Prostate();
		
		Body.bodyHair.armHairType = HairType.Fur;
		Body.bodyHair.assHairType = HairType.Fur;
		Body.bodyHair.backHairType = HairType.Fur;
		Body.bodyHair.breastHairType = HairType.Fur;
		Body.bodyHair.chestHairType = HairType.Fur;
		Body.bodyHair.facialHairType = HairType.Fur;
		Body.bodyHair.treasureTrailHairType = HairType.Fur;
		
		Body.Strength = 50;
		Body.femininity = -100d;
		Body.Corruption = 84;
		Body.fertilityScale = 2;
		Body.height = 140;
		Body.Intelegence = 30;
		Body.Speed = 35;
		Body.Toughness = 55;
		Body.thickness = 15;
		Body.Sensitivity = 40;
		
		dropOnDeath[0] = new CaninePepper(CaninePepperType.Regular);
		dropOnDeath[2] = new CaninePepper(CaninePepperType.Double);
		dropOnDeath[3] = new CaninePepper(CaninePepperType.Large);
		dropOnDeath[4] = new CaninePepper(CaninePepperType.Knotty);
		dropOnDeath[5] = new CaninePepper(CaninePepperType.Black);
		
		for (int i = 0; i >= 5; i++) {
			
			dropOnOrgasmLoss[i] = dropOnDeath[i];
			
		}
		
		idleCheck();
		Health = maxHealth;
		
	}

}
