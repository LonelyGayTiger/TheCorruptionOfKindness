package com.CorruptionOfKindness.Core;

import com.CorruptionOfKindness.CoreInterfaces.AfterInit;
import com.CorruptionOfKindness.CoreInterfaces.CheckInterface;
import com.CorruptionOfKindness.Core.Enum.Sexuality;
import com.CorruptionOfKindness.Core.Enum.Gender;
import com.CorruptionOfKindness.Core.Enum.Romantics;
import com.CorruptionOfKindness.Core.Enum.Race;
import com.CorruptionOfKindness.Body.Body;

public class Entity implements CheckInterface, AfterInit {
	
	public GameState GameState;
	
	public final boolean Player; 
	
	private Entity companion;
	
	public Entity(GameState GameState, boolean player) {
		
		this.GameState = GameState;
		this.Player = player;
		
	}
	
	public String Name;
	
	public Race race = Race.Human;
	
	//Gender Identity
	public Gender gender;
	
	//Sexuality and Romantic Identity
	public Sexuality sex = Sexuality.Heterosexual;
	public Romantics romanticAtraction = Romantics.Heteroromantic;
	
	//Biological Identity
	public boolean female;
	public boolean male;
	
	//Physical Specifications
	private int age;
	public int birthDate; //number out of 364
	public Body Body = new Body(this);
	
	//Stats
	public int Health = 100;
	private int maxHealth = 100;
	public int Fatigue = 0;
	private int maxFatigue = 100;
	public int Lust = 0;
	private int maxLust = 100;
	
	private int Level = 1;
	private int Exp = 0;
	private int[] maxExpByLevel = {1, 300, 500, 1000, 3000, 5000, 7500, 10000};
	private int gold = 0;

	@Override
	public void check() {
		// TODO Auto-generated method stub
		
		if (male) {
			
			female = false;
			
		}
		
	}

	@Override
	public void idleCheck() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterInit() {
		// TODO Auto-generated method stub
		if (this.male) {
			
			this.Body.afterInit();
			this.Body.check();
			
		}
		
	}

	@Override
	public void waitCheck(double hours) {
		// TODO Auto-generated method stub
		
	}
	
	public int getMaxExpByLevel(int i) {
		
		return maxExpByLevel[i];
		
	}

	/**
	 * @return the companion
	 */
	public Entity getCompanion() {
		return companion;
	}

	/**
	 * @param companion the companion to set
	 */
	public void setCompanion(Entity companion) {
		this.companion = companion;
	}

	/**
	 * @return the maxFatigue
	 */
	public int getMaxFatigue() {
		return maxFatigue;
	}

	/**
	 * @param maxFatigue set the maxFatigue
	 */
	public void setMaxFatigue(int maxFatigue) {
		this.maxFatigue = maxFatigue;
	}

	/**
	 * @return the maxLust
	 */
	public int getMaxLust() {
		return maxLust;
	}

	/**
	 * @param maxLust set the maxLust
	 */
	public void setMaxLust(int maxLust) {
		this.maxLust = maxLust;
	}

	/**
	 * @return the maxHealth
	 */
	public int getMaxHealth() {
		return maxHealth;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
		//TODO REPLACE
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return Level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		Level = level;
		//TODO REPLACE
	}

	/**
	 * @return the exp
	 */
	public int getExp() {
		return Exp;
	}

	/**
	 * @param exp the exp to set
	 */
	public void setExp(int exp) {
		Exp = exp;
		//TODO REPLACE
	}

	/**
	 * @return the gold
	 */
	public int getGold() {
		return gold;
	}

	/**
	 * @param gold the gold to set
	 */
	public void setGold(int gold) {
		this.gold = gold;
		//TODO REPLACE
	}

}
