package com.CorruptionOfKindness.Core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.CorruptionOfKindness.Core.Frames.CharacterCreateFrame;
import com.CorruptionOfKindness.Core.Frames.MainFrame;
import com.CorruptionOfKindness.Core.Frames.MainMenu;
import com.CorruptionOfKindness.Utill.Utills;

public class Main {
	
	public static Entity Player;
	
	public static GameState gameState = new GameState();
	public static Options Options = new Options();
	public static MainFrame mainFrame;
	public static MainMenu mainMenu;
	public static Thread mMenu;
	
	private static boolean cont = true;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		IO.createDirs();
		
		if (!IO.loadOptions()) {
			
			IO.updateSavedOptions();
			
		}
		
		mainMenu = new MainMenu(Options, gameState);
		mMenu = new Thread(mainMenu);
		mMenu.start();
		
		while (cont) {
			
			int menuInt = mainMenu.getSelection();
			
			switch (menuInt) {
			
				case 1:
					mainMenu.setVisible(false);
					mainMenu.setEnabled(false);
					newGame();
					mainFrame.setVisible(false);
					mainFrame.setEnabled(false);
					mainFrame.dispose();
					mainMenu.setEnabled(true);
					mainMenu.setVisible(true);
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					cont = false;
					mainMenu.setEnabled(false);
					mainMenu.dispose();
					mMenu.stop();
					
					break;
			
			}
			
		}
		
	}
	
	public static void newGame() {
		
		CharacterCreateFrame CCFrame = new CharacterCreateFrame(Options, gameState);
		Player = CCFrame.getCharacter();
		CCFrame.setEnabled(false);
		CCFrame.dispose();
		System.out.println("IT WORKS, BOO YEAH MOTHA FUCKA");
		gameState.Player = Player;
		System.out.println(Player.Name);
		IO.save();
		//Options.exsistingSave = true; Enable for final version, once a menu exists
		
		mainFrame = new MainFrame(Options, gameState);
		mainFrame.gameStart();
		
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
				         out.writeObject(gameState);
				         out.close();
				         fileOut.close();
				         System.out.printf("Serialized data is saved as" + path);
				         gameState.setSaved(true);
				
			}
			catch (IOException e) {
				
				new File(Options.Path + path).mkdirs();
				
			}
			
		}
		
		public static boolean load() {
			
			return load("/saves/gameState.cok");
			
		}
		
		public static boolean load(String path) {
			
			GameState e = null;
		      try {
		         FileInputStream fileIn = new FileInputStream(Options.Path + path);
		         ObjectInputStream in = new ObjectInputStream(fileIn);
		         e = (GameState) in.readObject();
		         in.close();
		         fileIn.close();
		      }catch(IOException i) {
		         System.out.println(path + " Does not exsist");
		         return false;
		      }catch(ClassNotFoundException c) {
		         System.out.println("GameState class not found");
		         c.printStackTrace();
		         return false;
		      }
		      
		      gameState = e;
			
			return true;
			
		}
		
		//public static boolean deleteSave() {
			
		//	//TO\DO ADD CODE
		//	return true;
			
		//}
		
		public static void quickSave(int i) {
			
			save("\\saves\\quick\\gameState" + i + ".cok");
			
		}

	}

}
