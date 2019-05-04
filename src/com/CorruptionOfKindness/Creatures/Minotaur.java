package com.CorruptionOfKindness.Creatures;

import com.CorruptionOfKindness.Body.Genitals.Prostate;
import com.CorruptionOfKindness.Body.Genitals.Testicles;
import com.CorruptionOfKindness.Body.Genitals.Templates.MinotaurCock;
import com.CorruptionOfKindness.Core.Entity;
import com.CorruptionOfKindness.Core.Enum.BeardStyle;
import com.CorruptionOfKindness.Core.Enum.Build;
import com.CorruptionOfKindness.Core.Enum.Gender;
import com.CorruptionOfKindness.Core.Enum.Race;
import com.CorruptionOfKindness.Core.Enum.Romantics;
import com.CorruptionOfKindness.Core.Enum.Sexuality;
import com.CorruptionOfKindness.Core.Enum.SpecialSexTrait;
import com.CorruptionOfKindness.Core.Enum.TailType;
import com.CorruptionOfKindness.CoreInterfaces.AfterInit;
import com.CorruptionOfKindness.CoreInterfaces.Drop;
import com.CorruptionOfKindness.Items.Consumables.MinotaurBlood;
import com.CorruptionOfKindness.Items.Consumables.MinotaurCum;
import com.CorruptionOfKindness.Items.Weapons.MinotaurAxe;
import com.CorruptionOfKindness.Utill.Utills;

/**
 * 
 * @author LonelyGayTiger
 *
 */
public class Minotaur extends Entity implements AfterInit, Drop {

	public Minotaur(com.CorruptionOfKindness.Core.GameState GameState) {
		super(GameState, false);
		
		Name = "Minotaur";
		
		race = Race.Minotaur;
		
		gender = Gender.Male;
		
		sex = Sexuality.Pansexual;
		romanticAtraction = Romantics.Aromantic;
		
		female = false;
		male = true;
		
		super.Level = Utills.randomInt(5, 8);
		
		setGold(Utills.randomInt(3, 17));
		
		Body.beardStyle = BeardStyle.None;
		Body.belly = 3;
		Body.build = Build.Thickset;
		Body.hornLength = 4;
		Body.numOfHorns = 2;
		Body.specialAtribute = SpecialSexTrait.EtraArdor;
		
		Testicles t = new Testicles(Body);
		t.length = 7;
		t.girth = 6;
		t.afterInit();
		
		Body.genitals.Balls.add(t);
		Body.genitals.Cocks.add(new MinotaurCock());
		Body.genitals.prostate = new Prostate();
		
		Body.bodyHair.pubertyStage1();
		Body.bodyHair.pubertyStage2();
		Body.bodyHair.pubertyStage3();
		Body.bodyHair.pubertyStage4();
		Body.bodyHair.pubertyStage5();
		
		Body.Strength = 80;
		Body.femininity = -100d;
		Body.Corruption = 53;
		Body.fertilityScale = 3;
		Body.height = 300;
		Body.Intelegence = 15;
		Body.Speed = 20;
		Body.Toughness = 80;
		Body.thickness = 70;
		Body.Sensitivity = 15;
		Body.height = 312;
		Body.tail = true;
		Body.tailType = TailType.Cow;
		
		inven.equipedWeapon = new MinotaurAxe();
		
		dropOnDeath[0] = new MinotaurBlood();
		dropOnOrgasmLoss[0] = new MinotaurBlood();
		dropOnOrgasmLoss[2] = new MinotaurCum();
		
		afterInit();
		idleCheck();
		
	}

}
