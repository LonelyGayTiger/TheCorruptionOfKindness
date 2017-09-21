package com.CorruptionOfKindness.Core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.CorruptionOfKindness.Core.Frames.MainMenu;
import com.CorruptionOfKindness.Core.Frames.OptionFrame;
import com.CorruptionOfKindness.Utill.Utills;

public class Main {
	
	public static Options Options = new Options();
	public static MainMenu mainMenu;
	public static Thread mMenu;
	
	public static GameManager GameManager;
	
	private static boolean cont = true;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		IO.createDirs();
		
		if (!IO.loadOptions()) IO.updateSavedOptions();
		
		mainMenu = new MainMenu(Options);
		mMenu = new Thread(mainMenu);
		mMenu.start();
		
		while (cont) {
			
			int menuInt = mainMenu.getSelection();
			
			switch (menuInt) {
			
				case 1:
					mainMenu.setVisible(false);
					mainMenu.setEnabled(false);
					GameManager = new GameManager(Options);
					GameManager.newGame();
					mainMenu.setEnabled(true);
					mainMenu.setVisible(true);
					break;
				case 2:
					mainMenu.setVisible(false);
					mainMenu.setEnabled(false);
					GameManager = new GameManager(Options);
					GameManager.loadFromGD(load());
					mainMenu.setEnabled(true);
					mainMenu.setVisible(true);
					break;
				case 3:					
					mainMenu.setEnabled(false);
					new OptionFrame(Options);
					mainMenu.setEnabled(true);
					break;
				case 4:
					cont = false;
					mainMenu.setVisible(false);
					mainMenu.setEnabled(false);
					mainMenu.dispose();
					mMenu.stop();
					break;
			
			}
			
		}
		
		mainMenu.dispose();
		mMenu.stop();
		
	}
	
	public static GameState load() {
		
		//TODO Create a save/file selector of some sort
		String savepath = null;
		return IO.load(savepath);
		
	}
	
	public static class IO {
		
		public static void createDirs() {
			
			new File(Options.Path + "\\data").mkdirs();
			new File(Options.Path + "\\saves").mkdirs();
			new File(Options.Path + "\\res").mkdirs();
			
			if (!new File(Options.Path + "\\res\\purple_heart.png").exists()) {
				
				Utills.download(Options.Path + "\\res\\purple_heart.png", 
						"https://emojipedia-us.s3.amazonaws.com/cache/92/a7/92a701115916590546d0229611338f33.png");
				
			}
			
		}
		
		public static void updateSavedOptions() {
			
			try {
				
				FileOutputStream fileOut =
				         new FileOutputStream(Options.Path + "\\data\\options.cokOptions");
				         ObjectOutputStream out = new ObjectOutputStream(fileOut);
				         out.writeObject(Options);
				         out.close();
				         fileOut.close();
				         //System.out.printf("Serialized data is saved as" + path);
				
			}
			catch (IOException e) {
				
				new File(Options.Path + "\\data").mkdirs();
				
			}
			
		}
		
		public static boolean loadOptions() {
			
			Options e = null;
		      try {
		         FileInputStream fileIn = new FileInputStream(
		        		 Options.Path + "\\data\\options.cokOptions");
		         ObjectInputStream in = new ObjectInputStream(fileIn);
		         e = (Options) in.readObject();
		         in.close();
		         fileIn.close();
		      }catch(IOException i) {
		         //i.printStackTrace();
		         return false;
		      }catch(ClassNotFoundException c) {
		         System.out.println("Options class not found");
		         c.printStackTrace();
		         return false;
		      }
		      
		      Options = e;
			
			return true;
			
		}
		
		public static void save() {
			
			save("/saves/gameState.cok");
			
		}
		
		public static void save(String path) {
			
			try {
				
				FileOutputStream fileOut =
				         new FileOutputStream(Options.Path + path);
				         ObjectOutputStream out = new ObjectOutputStream(fileOut);
				         out.writeObject(GameManager.GameState);
				         out.close();
				         fileOut.close();
				         System.out.printf("Serialized data is saved as" + path);
				         GameManager.GameState.setSaved(true);
				
			}
			catch (IOException e) {
				
				new File(Options.Path + path).mkdirs();
				
			}
			
		}
		
		public static GameState load() {
			
			return load("/saves/gameState.cok");
			
		}
		
		public static GameState load(String path) {
			
			GameState e = null;
		      try {
		         FileInputStream fileIn = new FileInputStream(Options.Path + path);
		         ObjectInputStream in = new ObjectInputStream(fileIn);
		         e = (GameState) in.readObject();
		         in.close();
		         fileIn.close();
		      }catch(IOException i) {
		         System.out.println(path + " Does not exsist");
		         return null;
		      }catch(ClassNotFoundException c) {
		         System.out.println("GameState class not found");
		         c.printStackTrace();
		         return null;
		      }
			
			return e;
			
		}
		
		public static GameState quickLoad(int i) {
			
			return load("\\saves\\quick\\gameState" + i + ".cok");
			
		}
		
		public static void quickSave(int i) {
			
			save("\\saves\\quick\\gameState" + i + ".cok");
			
		}

	}

}
