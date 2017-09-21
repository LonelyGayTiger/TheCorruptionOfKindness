package com.CorruptionOfKindness.Core;

import com.CorruptionOfKindness.Core.Frames.MainFrame;

public class GameManager {
	
	public GameState GameState = null;
	public Options options;
	
	Entity Player = null;
	
	MainFrame mainFrame = null;
	
	public GameManager(Options opt) {
		
		this.options = opt;
		
	}
	
	public GameManager(Options opt, GameState GD) {
		
		this.options = opt;
		this.GameState = GD;
		
	}
	
	@SuppressWarnings("unused")
	private void Main() {
		
		//TODO Add Main Game Loop
		
	}
	
	public void newGame() {
		
		//TODO Add New game Code
		
	}
	
	public boolean loadFromGD() {
		
		return false;
		
	}
	
	public boolean loadFromGD(GameState GD) {
		
		GameState = GD;
		return loadFromGD();
		
	}
	
	
	/**
	*public void newGame() {
	*	
	*	CharacterCreateFrame CCFrame = new CharacterCreateFrame(Options, gameState);
	*	Player = CCFrame.getCharacter();
	*	CCFrame.setEnabled(false);
	*	CCFrame.dispose();
	*	System.out.println("IT WORKS, BOO YEAH MOTHA FUCKA");
	*	gameState.Player = Player;
	*	System.out.println(Player.Name);
	*	IO.save();
	*	//Options.exsistingSave = true; Enable for final version, once a menu exists
	*	
	*	mainFrame = new MainFrame(Options, gameState);
	*	mainFrame.gameStart(true);
	*	
	*}
	*/

}
