package com.CorruptionOfKindness.Body.Genitals;

import java.util.ArrayList;

import com.CorruptionOfKindness.Body.Body;
import com.CorruptionOfKindness.CoreInterfaces.AfterInit;
import com.CorruptionOfKindness.CoreInterfaces.CheckInterface;
import com.CorruptionOfKindness.CoreInterfaces.GetDescription;

public class Genitals implements CheckInterface, AfterInit, GetDescription {
	
	public Body body;
	
	public Genitals(Body body) {
		
		this.body = body;
		
	}
	
	public ArrayList<Penis> Cocks = new ArrayList<Penis>();
	public ArrayList<Testicles> Balls = new ArrayList<Testicles>();
	public Prostate prostate = null;
	public Vagina vagina = null;
	public Breasts breasts = new Breasts();

	@Override
	public void check() {
		
		for(Testicles t: Balls) {
			
			t.check();
			
		}
		
		if(prostate != null) {
			
			prostate.check();
			
		}
		
		if(vagina != null) {
			
			vagina.check();
			
		}
		
		breasts.check();
		
	}

	@Override
	public void idleCheck() {
		
		for(Testicles t: Balls) {
			
			t.idleCheck();
			
		}
		
		if(prostate != null) {
			
			prostate.idleCheck();
			
		}
		
		if(vagina != null) {
			
			vagina.idleCheck();
			
		}
		
		breasts.idleCheck();
		
	}

	@Override
	public void afterInit() {
		
		for(Penis p: Cocks) {
			
			p.afterInit();
			
		}
		
		for(Testicles t: Balls) {
			
			t.afterInit();
			
		}
		
		if(prostate != null) {
			
			prostate.afterInit();
			
		}
		
		if(vagina != null) {
			
			vagina.afterInit();
			
		}
		
		breasts.afterInit();
		
	}

	@Override
	public void waitCheck(double hours) {
		
		for(Testicles t: Balls) {
			
			t.waitCheck(hours);
			
		}
		
		if(prostate != null) {
			
			prostate.waitCheck(hours);
			
		}
		
		if(vagina != null) {
			
			vagina.waitCheck(hours);
			
		}
		
		breasts.waitCheck(hours);
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
