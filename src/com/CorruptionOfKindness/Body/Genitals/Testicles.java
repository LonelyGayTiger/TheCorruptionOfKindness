package com.CorruptionOfKindness.Body.Genitals;

import java.math.BigDecimal;

import com.CorruptionOfKindness.Body.Body;
import com.CorruptionOfKindness.CoreInterfaces.AfterInit;
import com.CorruptionOfKindness.CoreInterfaces.CheckInterface;
import com.CorruptionOfKindness.CoreInterfaces.Orgasm;
import com.CorruptionOfKindness.Utill.XtraMath;

public class Testicles implements CheckInterface, AfterInit, Orgasm {
	
	private Body body;
	
	public Testicles(Body body) {
		
		this.body = body;
		
	}
	
	public boolean internal = false;
	public double length = 1;
	public double girth = 0.5;
	public double volume = 0;
	public double spermVolume = 0;
	private int spermVolumeMax = 0;
	public int size = 1;

	@Override
	public void afterInit() {
		// TODO Auto-generated method stub
		
		this.volume = XtraMath.EllipsoidVolume(
				XtraMath.icm(length), XtraMath.icm(girth), XtraMath.icm(girth));
		this.spermVolume = (
				new BigDecimal(this.volume).multiply(new BigDecimal("0.9")).doubleValue());
		
	}
	
	public void overload(int amount) {
		
		//TODO Add Code
		
	}
	
	private void increaseSpermVolume(int amount) {
		
		if ((spermVolume + amount) <= spermVolumeMax) {
			
			this.spermVolume =+ amount;
			
		}
		else {
			
			this.spermVolume = this.spermVolumeMax;
			overload((int) ((spermVolume + amount) - spermVolumeMax));
			
		}
		
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		increaseSpermVolume(1 * (body.Libido / 10));
		
	}

	@Override
	public void idleCheck() {
		// TODO Auto-generated method stub
		increaseSpermVolume((int) ((3 * (body.Libido / 15)) * body.fertilityScale));
		
	}

	@Override
	public void waitCheck(double hours) {
		// TODO Auto-generated method stub
		increaseSpermVolume((int) ((13 * (body.Libido / 20)) * body.fertilityScale));
		
	}

	@Override
	public void orgasm() {
		// TODO Auto-generated method stub
		
	}

}