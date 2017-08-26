package com.CorruptionOfKindness.Core.Frames;

import java.awt.Dimension;

import javax.swing.JFrame;

import com.CorruptionOfKindness.Core.GameState;
import com.CorruptionOfKindness.Core.Options;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class GameStartFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 295996088993293251L;
	
	public GameState gameState;
	public Options options;
	
	public GameStartFrame(GameState g, Options o) {
		
		this.gameState = g;
		this.options = o;
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setTitle("Corruption Of Kindness: ");
		this.setSize(new Dimension(750, 450));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnJace = new JButton("Jace");
		panel.add(btnJace);
		
		JButton btnMathew = new JButton("Mathew");
		panel.add(btnMathew);
		
		JButton btnEvelyn = new JButton("Evelyn");
		panel.add(btnEvelyn);
		
		JButton btnGabriel = new JButton("Gabriel");
		panel.add(btnGabriel);
		
		JButton btnChristina = new JButton("Christina");
		panel.add(btnChristina);
		
		JButton btnMichael = new JButton("Michael");
		panel.add(btnMichael);
		
	}

}
