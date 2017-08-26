package com.CorruptionOfKindness.Creatures;

import com.CorruptionOfKindness.Core.Entity;
import com.CorruptionOfKindness.Core.Enum.Build;
import com.CorruptionOfKindness.Core.Enum.Gender;
import com.CorruptionOfKindness.Core.Enum.HairType;
import com.CorruptionOfKindness.Core.Enum.Romantics;
import com.CorruptionOfKindness.Core.Enum.Sexuality;
import com.CorruptionOfKindness.Core.Enum.TailType;
import com.CorruptionOfKindness.CoreInterfaces.AfterInit;
import com.CorruptionOfKindness.CoreInterfaces.Drop;
import com.CorruptionOfKindness.Utill.Utills;

public class Wolf extends Entity implements AfterInit, Drop {

	public Wolf(com.CorruptionOfKindness.Core.GameState GameState, boolean player) {
		super(GameState, player);
		// TODO Auto-generated constructor stub
		
		Name = "Wolf";
		
		gender = Gender.Male;
		female = false;
		male = true;
		
		super.Level = Utills.randomInt(4, 7);
		
		if (!player) super.gold = Utills.randomInt(3, 9);
		
		sex = Sexuality.Heteroflexible;
		romanticAtraction = Romantics.Heteroflexible;
		
		if (Utills.getRandomBoolean()) super.setAge(Utills.randomInt(1, 3));
		else super.setAge(Utills.randomInt(16, 27));
		
		birthDate = Utills.randomInt(1, 365);
		
		Body.build = Build.Lithe;
		Body.bodyHair.setAll(HairType.Fur);
		Body.tail = true;
		Body.tailType = TailType.Dog;
		
	}

}
