package com.CorruptionOfKindness.Core;

import com.CorruptionOfKindness.CoreInterfaces.AfterInit;
import com.CorruptionOfKindness.CoreInterfaces.CheckInterface;
import com.CorruptionOfKindness.Utill.Utills;

/**
 * 
 * @author LonelyGayTiger
 *
 */
public class GameState implements CheckInterface, AfterInit {
	
	public boolean gameContinue = true;
	
	private int GAME_STATE = -1;
	public int day = 1;
	public int date = 1;
	public int year = 1;
	public int timeInt = 8;
	public boolean twelveHourTime = true;
	
	public Entity Player;
	public final Map MAP = new Map(this);
	
	public boolean canSave = true;
	
	public boolean saved = false;

	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void idleCheck() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterInit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void waitCheck(double hours) {
		// TODO Auto-generated method stub
		
	}

	public void setSaved(boolean b) {
		
		saved = b;
		
	}
	
	public String getTime() {
		
		return Utills.getTimeFromInt(timeInt, twelveHourTime);
		
	}

	/**
	 * @return the gAME_STATE
	 */
	public int getGAME_STATE() {
		return GAME_STATE;
	}

	/**
	 * increases GAME_STATE
	 */
	public void incGAME_STATE() {
		GAME_STATE = GAME_STATE + 1;
	}

}
