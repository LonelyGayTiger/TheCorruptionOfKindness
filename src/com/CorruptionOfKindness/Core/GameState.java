package com.CorruptionOfKindness.Core;

import com.CorruptionOfKindness.CoreInterfaces.AfterInit;
import com.CorruptionOfKindness.CoreInterfaces.CheckInterface;

public class GameState implements CheckInterface, AfterInit {
	
	public boolean gameContinue = true;
	
	private int GAME_STATE = -1;
	public int day = 1;
	public int date = 1;
	public int year = 1;
	public int timeArrayInt = 8;
	public String[] timeArray = {"00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", 
			"08:00", "00:00", "00:00", "00:00", "00:00" ,"00:00"};
	
	public Entity Player;
	public final Map MAP = new Map(this);
	
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

	/**
	 * @return the gAME_STATE
	 */
	public int getGAME_STATE() {
		return GAME_STATE;
	}

	/**
	 * @param GAME_STATE the gAME_STATE to set
	 */
	public void incGAME_STATE() {
		GAME_STATE = GAME_STATE + 1;;
	}

}
