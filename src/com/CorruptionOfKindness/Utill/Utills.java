package com.CorruptionOfKindness.Utill;

import java.awt.Choice;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;


/**
 * 
 * @author LonelyGayTiger
 *
 */
public class Utills {
	
	public static void log(String s) {
		
		log(s, false);
		
	}
	
	public static void log(String s, boolean err) {
		
		DateFormat df = new SimpleDateFormat("hh:mm:ss");
		
		if (!err) {
			
			System.out.println("[" + df.format(Calendar.getInstance().getTime()) + "]Log: " + s);
			
		}
		else {
			
			System.err.println("[" + df.format(Calendar.getInstance().getTime()) + "]Error: " + s);
		}
		
	}
	
	public static void addStrArrayToChoiceMenu(Choice choice, String[] e) {
		
		for (String w: e) {
			
			choice.add(w);
			
		}
		
	}
	
	public static String getTimeFromInt(int t) {
		
		if (t < 10) return ("0" + t + ":00");
		else return (t + ":00");
		
	}
	
	public static String getTimeFromInt(int t, boolean militaryTime) {
		
		if (militaryTime) return getTimeFromInt(t);
		else {
			
			if (t < 12) {
				
				if (t == 0) return "12:00AM";
				else if (t < 10) return ("0" + t + ":00AM");
				else return (t + ":00AM");
				
			}
			else {
				
				if ((t - 12) == 0) return "12:00PM";
				else if ((t - 12) < 10) return ("0" + (t - 12) + ":00PM");
				else return ((t - 12) + ":00PM");
				
			}
			
		}
		
	}
	
	public static BigDecimal bgD(int num) {
		
		return new BigDecimal(String.valueOf(num));
		
	}
	
	public static BigDecimal bgD(double num) {
		
		return new BigDecimal(String.valueOf(num));
		
	}
	
	public static BigDecimal bgD(String num) {
		
		return new BigDecimal(num);
		
	}

	public static boolean getYNWFrame(String prompt) {
		
		int dialogResult;
		
		while (true) {
			
			dialogResult = JOptionPane.showConfirmDialog (null, prompt, "???", JOptionPane.YES_NO_OPTION);
			
			if (dialogResult == JOptionPane.YES_OPTION) {
				
				return true;
				
			}
			else if (dialogResult == JOptionPane.NO_OPTION) {
				
				return false;
				
			}
			
		}
		
	}
	
	public static int randomInt(int min, int max) {  
		
		int result = (int) (Math.random()
				* (max - min + 1)) + min;

		return result;
		
	}
	
	public static boolean getRandomBoolean() {
		
		if (randomInt(0, 1) == 0) {
			
			return false;
			
		}
		else {
			
			return true;
			
		}
		
	}
	
	public static double randomDouble(int min, int max, int places) {
		
		return (randomInt(min, (int) (max * Math.pow(10, places))) 
				* Math.pow(10, -places));
		
	}
	
	public static StringBuilder empty(StringBuilder str) {
		
		str.delete(0, (str.length() + 1));
		
		return str;
		
	}
	
	public static String capitalise(String name) {
		
		//Variables
		String[] Name = name.toLowerCase().split(" ");
		
		StringBuilder sb = new StringBuilder();
		StringBuilder endStr = new StringBuilder();
		
		char temp;
		
		int i = 0;
		
		//Sorting
		for(String w: Name) {
			
			sb.append(w);
			
			temp = Character.toUpperCase(sb.charAt(0));
			sb.setCharAt(0, temp);
			
			if(i >= 1) {
				
				endStr.append(" " + sb.toString());
				
			}
			else {
				
				endStr.append(sb);
				
			}
			
			i++;
			empty(sb);
			
		}

		
		return endStr.toString();
		
	}	
	
	/**Downloads a file from @fileURL and saves it to @fileName*/
	public static void download(String fileName, String fileURL) {
		
		URL website;
		try {
			website = new URL(fileURL);
			ReadableByteChannel rbc = Channels.newChannel(website.openStream());
			FileOutputStream fos = new FileOutputStream(fileName);
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
			
			Thread.sleep(100);
			
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public static String convertIntToMonth(int month) {
		
		switch (month) {
		
			case 0:
				return "January";
			case 1:
				return "Febuary";
			case 2:
				return "March";
			case 3:
				return "April";
			case 4:
				return "May";
			case 5:
				return "June";
			case 6:
				return "July";
			case 7:
				return "August";
			case 8:
				return "September";
			case 9:
				return "October";
			case 10:
				return "November";
			case 11:
				return "December";
		
		}
		return "ERROR CODE 367";
		
	}
	
	public static int specialCheck(String name) {
		
		String[] equals = {"Lucian Farsky", "Cameron Barnes", "Leo King", "Justin Brittain", "Lone Wolf", "Auriel"};
		
		for (int i = 0; i <= 5; i++) {
			
			if (name.equals(equals[i])) {
				
				return i;
				
			}
			
		}
		
		return 111;
		
	}
	
	public static boolean profan(String name) {
		
		String[] contains = {"fuck", "kek", "bitch", "cock", "dick", "porn", 
				"penis", "dong", "nigger", "arse", "cunt", "shit", "faggot", 
				"fag", "gay", "kkk", "sex", "pepe", "gloryhole", "glory", "hole", 
				"xxx", "mlg", "0", "1", "2", "3", "4" , "5", "6", "7", "8", "9", 
				"jackass", "whore", "hore", "anal", "devil", "angel", "satan", 
				"douche", "duch", "lesbo", "testicles", "breasts", "testicle", "breast", 
				"god", "trump", "boobs", "vagina", "boobies", "vajj", "vaj", 
				"va-jj", "penile", "vaj", "clinton", "harper", "obama", "pussy", "rectum", "anus", "lesbian", 
				"poop", "poo", "feces", "defacate", "cum", "ejaculate", "orgasm", 
				"urethra", "isis", "osoma", "binladden", "nuke", "tnt", 
				"homosexual", "pansexual", "bisexual", "asexual", "heterosexual", 
				"foreskin", "nipple", "kill", "death", "murder", "rape", 
				"suicide", "castrate", "firstnations", "first", "nations", 
				"fat", "obese", "cow", "terrorist", "masterbate", "foreplay", 
				"teste", "scrotum", "clitoris", "bladder", "force", "brain", 
				"stomach", "throat", "butt", "bum", "buttock", "stupid", 
				"retard", "disabled", "imbecile", "inferior", "nuts", "idiot",
				"antidisestablishmentarianism", "Afghanistan", "Albania", 
				"Algeria", "Andorra", "Angola", "Antigua", "Barbuda", 
				"Argentina", "Armenia", "Aruba", "Australia", "Austria", 
				"Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", 
				"Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", 
				"Bosnia", "Herzegovina", "Botswana", "Brazil", "Brunei","Bulgaria", 
				"Burkina", "Faso", "Burma", "Burundi", "Cambodia", "Cameroon", 
				"Canada", "Cape Verde", "Central", "African", "Republic", "Chad", 
				"Chile", "China", "America", "United", "Mexico", "Trump", "carnivore", 
				"herbivore", "omnivore", "furry", "furrsuit", "murrsuit", "fursuit", "mursuit", "yiff",
				"yif", "  ", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", 
				"-", "_", "=", "+", "[", "]", "{", "}", "\\", "|", ",", "<", ">", ".",
				"/", "?", "~", "`", "'", "\"", "axwound", "rimjob", "queer", "quee", "quef",
				"ass", "racial", "slur", "male", "female", "pirate", "genit", "jerk",
				"clown", "notch", "terror", "islam", "christ", "pot", "mate", "child", 
				"baby", "beaner", "mean", "blow", "bollocks", "boloc", "bolloc", 
				"plug", "chinese", "asian", "choad", "small", "mess", "dirty", "italian", 
				"damn", "darn", "deggo", "dego", "phallace", "phalic", "phallic", "hygene", 
				"fellatio", "person", "flamer", "gooch", "goch", "gringo", "hard",
				"job", "homo", "white", "hoe", "woman", "hump", "semen", "jungle", "bunny", 
				"jew", "german", "mother", "fornic", "muff", "negro", "child", "nut", "sack", "paki",
				"femail", "urine", "piss", "pee", "angry", "polish", "monkey", "dog", "puss", 
				"reproductive", "shlong", "schlong", "shiz", "bad", "slut", "popular",
				"bag", "spic", "mental", "smeg", "tits", "cok", "coc", "twat", "wank", "wet",
				"feltch", "erection", "weight", "japanesse", "russian", "girl", "mexic", "skeet"};
		String[] equals = {"ass", "vore", "aurora", "Lucian", null, "", " "};
		
		if (name.toLowerCase().equals("sexy beast")) return true;
		
		for (String w: contains) {
			
			if (name.toLowerCase().contains(w.toLowerCase())) {
				
				System.err.println("Name Not Allowed, Try again. ");
				return false;
				
			}
			
		}
		
		for (String w: equals) {
			
			if (name.toLowerCase().equals(w)) {
				
				System.err.println("Name Not Allowed, Try again. ");
				return false;
				
			}
			
		}
		
		return true;
		
	}

}
