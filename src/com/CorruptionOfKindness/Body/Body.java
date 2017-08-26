package com.CorruptionOfKindness.Body;

import com.CorruptionOfKindness.Body.Genitals.Genitals;
import com.CorruptionOfKindness.Body.Genitals.Penis;
import com.CorruptionOfKindness.Core.Entity;
import com.CorruptionOfKindness.Core.Enum.ArmType;
import com.CorruptionOfKindness.Core.Enum.BeardStyle;
import com.CorruptionOfKindness.Core.Enum.Build;
import com.CorruptionOfKindness.Core.Enum.EarType;
import com.CorruptionOfKindness.Core.Enum.EyeColour;
import com.CorruptionOfKindness.Core.Enum.HairColour;
import com.CorruptionOfKindness.Core.Enum.HairStyle;
import com.CorruptionOfKindness.Core.Enum.LegType;
import com.CorruptionOfKindness.Core.Enum.SkinColour;
import com.CorruptionOfKindness.Core.Enum.SpecialSexTrait;
import com.CorruptionOfKindness.Core.Enum.TailType;
import com.CorruptionOfKindness.Core.Enum.TannerStage;
import com.CorruptionOfKindness.Core.Enum.WingType;
import com.CorruptionOfKindness.CoreInterfaces.AfterInit;
import com.CorruptionOfKindness.CoreInterfaces.CheckInterface;
import com.CorruptionOfKindness.Utill.Utills;
import com.CorruptionOfKindness.Utill.XtraMath;

public class Body implements CheckInterface, AfterInit {
	
	Entity E;
	
	private double bodyScale = 1;
	private double buildScale = 1;
	public double libidoScale = 1;
	public double fertilityScale = 1;
	
	public Body(Entity entity) {
		
		this.E = entity;
		
	}
	
	public Body(Entity entity, BodyHair bHair) {
		
		this.E = entity;
		bHair.setBody(this);
		this.bodyHair = bHair;
		
	}
	
	public void setBodyHair(BodyHair bHair) {
		
		this.bodyHair = bHair;
		
	}
	
	public void setGenitals(Genitals genitals) {
		
		this.genitals = genitals;
		
	}
	
	public double getBodyScale() {
		
		return this.bodyScale;
		
	}
	
	//Physical Specifications
	public double mass = 62; //In Kilograms
	public double height = 175; //In centimeters
	public double femininity = 50;
	public int muscleTone = 20;
	public int thickness = 10;
	public EyeColour eyeColour;
	public SkinColour skinColour;
	public HairColour hairColour;
	public HairStyle hairStyle;
	public BeardStyle beardStyle = BeardStyle.None;
	public EarType earType = EarType.Human;
	public boolean horns = false;
	public int hornLength = 0;
	public int numOfHorns = 0; //Multiple of two
	public int arms = 2; //must be a multiple of two
	public ArmType armType = ArmType.Human;
	public int leggs = 2; //must be a multiple of two
	public LegType legType = LegType.Human;
	public boolean gills = false;
	public boolean wings = false;
	public WingType wingType = WingType.None;
	public boolean tail = false;
	public TailType tailType = TailType.None;
	public int hips = 2;
	public int butt = 2;
	public int belly = 3; //1 = Super Skinny/ 2 = Slim/ 3 = toned/ 4 = Soft-Chubby/ 5 = Chubby Toned/ 6 =  Big-Fat/ 7 = Obese
	public Build build = Build.Normal;
	public BodyHair bodyHair = new BodyHair(this);
	public Genitals genitals = new Genitals(this);
	public SpecialSexTrait specialAtribute = SpecialSexTrait.None;
	
	//Stats
	public int Strength = 20;
	public int Toughness = 20;
	public int Speed = 15;
	public int Intelegence = 15;
	public int Libido = 20;
	public int Sensitivity = 20;
	public int Corruption = Utills.randomInt(1, 3);
	public int stamina = 100;
	
	public void orgasm() {
		
		if(!genitals.Cocks.isEmpty()) {
			
			for(Penis p: genitals.Cocks) {
				
				p.orgasm();
				
			}
			
		}
			
		if(genitals.prostate != null) {
			
			genitals.prostate.orgasm();
			
		}
		
		if(genitals.vagina != null) {
			
			genitals.vagina.orgasm();
			
		}
		
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		
		if (!puberty && !pubertyTrigger) {
			
			TStage = TannerStage.StageOne;
			
		}
		
		this.bodyScale = (height/175);
		
	}
	
	@Override
	public void idleCheck() {
		// TODO Auto-generated method stub
		
		if (!puberty && pubertyTrigger) {
			
			if (hasGoneThroughPuberty) {
				
				
				
			}
			else {
				
				
				
			}
			
		}
		
	}
	
	public void triggerPuberty() {
		
		puberty = false;
		pubertyTrigger = true;
		startDate = E.GameState.day;
		TStage = TannerStage.Start;
		Puberty.start();
		
	}
	
	//Puberty
	public Puberty Puberty = new Puberty(this);
	public boolean hasGoneThroughPuberty = true;
	public boolean puberty = true;
	public boolean pubertyTrigger = false;
	public int startDate;
	public TannerStage TStage = TannerStage.StageFive;

	@Override
	public void afterInit() {
		
		bodyScale = height / 170;
		
		switch (build) {
		
			case Skinny:
				
				buildScale = 0.95;
				
				break;
			case VeryThin:
				
				buildScale = 0.85;
				
				break;
			case Thin:
				
				buildScale = 1;
				
				break;
			case Lithe:
				
				buildScale = 1.2;
				
				break;
			case Normal:
				
				buildScale = 1.3;
				
				break;
			case Husky:
				
				buildScale = 1.45;
				
				break;
			case Thickset:
				
				buildScale = 1.4;
				
				break;
			case Fat:
				
				buildScale = 1.55;
				
				break;
		
		}
		
		mass = mass * bodyScale;
		mass = mass * buildScale;
		roundMass();
		System.out.println("Mass: " + mass);
		
		bodyHair.afterInit();
		genitals.afterInit();
		
	}
	
	private void roundMass() {
		
		mass = XtraMath.roundDouble(mass, 2);
		
	}

	@Override
	public void waitCheck(double hours) {
		// TODO Auto-generated method stub
		
	}

}
