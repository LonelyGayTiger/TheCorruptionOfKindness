package com.CorruptionOfKindness.Core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;

import com.CorruptionOfKindness.Core.Main.IO;
import com.CorruptionOfKindness.Core.Frames.CharacterCreateFrame;
import com.CorruptionOfKindness.Core.Frames.MainFrame;
import com.CorruptionOfKindness.Map.Locations.Story.Start;
import com.CorruptionOfKindness.Utill.Utills;

/**
 * 
 * @author LonelyGayTiger
 *
 */
public class GameManager {
	
	public GameState GameState = null;
	public Options options;
	
	Entity Player = null;
	
	MainFrame mainFrame = null;
	boolean end = false;
	
	public Area currentArea;
	
	WindowListener windoAdpt = new WindowListener() {

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			
			if (GameState.saved) {
				
				end = true;
				mainFrame.dispose();
				
			}
			else if (GameState.canSave) {
				
				if (Utills.getYNWFrame("Save The Game?")) {
					
					IO.save();
					
				}
				
				end = true;
				mainFrame.dispose();
				
			}
			else {
				
				end = true;
				mainFrame.dispose();
				
			}
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
	};
	
	ActionListener actionListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			action(((JButton) e.getSource()).getText());
			
		}
		
	};
	
	public GameManager(Options opt) {
		
		this.options = opt;
		
	}
	
	public GameManager(Options opt, GameState GD) {
		
		this.options = opt;
		this.GameState = GD;
		
	}
	
	private void action(String actionName) {
		
		//TODO Add Code
		Utills.log(actionName);
		
	}
	
	private void Main() {
		
		mainFrame.reload();
		
		//TODO Add Main Game Loop
		while(!end) {
			
			mainFrame.setButtonNames(currentArea.btnNameArray);
			mainFrame.enableDisableButtons(currentArea.btnStateArray);
			
			if (currentArea.updateText) {
				
				mainFrame.setText(currentArea.text);
				currentArea.updateText = false;
				
			}
			
		}
		
	}
	
	public void newGame() {
		
		Utills.log("Starting new game");
		
		this.GameState = new GameState();
		
		//TODO Implement Game Start Frame
		CharacterCreateFrame CCFrame = new CharacterCreateFrame(options, GameState);
		Player = CCFrame.getCharacter();
		CCFrame.setEnabled(false);
		CCFrame.dispose();
		GameState.Player = Player;
		IO.save();
		
		mainFrame = new MainFrame(options, GameState, actionListener, windoAdpt);
		
		currentArea = new Start();
		
		Main();
		
	}
	
	public void load() {
		
		Utills.log("Loading Game");
		
		Player = GameState.Player;
		
		mainFrame = new MainFrame(options, GameState, actionListener, windoAdpt);
		
		Main();
				
	}
	
	public void loadFromGD(GameState GD) {
		
		GameState = GD;
		load();
				
	}

}
