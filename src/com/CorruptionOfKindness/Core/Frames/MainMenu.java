package com.CorruptionOfKindness.Core.Frames;

import java.awt.Dimension;

import javax.swing.JFrame;

import com.CorruptionOfKindness.Core.Options;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame implements Runnable {
	
	public MainMenu(Options options) {
		
		try {
			this.setIconImage(ImageIO.read(new File(options.Path + "\\res\\purple_heart.png")));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		this.setLocation((int) ((width / 2) - (1024 / 2)), (int) ((height / 2) - (784 / 2)));
		setTitle("Corruption Of Kindness " + options.VERSION);
		setSize(new Dimension(1024, 784));
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				selection = 1;
				
			}
		});
		btnNewGame.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(btnNewGame);
		btnLoadGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				selection = 2;
				
			}
		});
		btnLoadGame.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(btnLoadGame);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(UIManager.getBorder("InternalFrame.border"));
		panel.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		lblThe = new JLabel("The");
		lblThe.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblThe = new GridBagConstraints();
		gbc_lblThe.insets = new Insets(0, 0, 5, 5);
		gbc_lblThe.gridx = 2;
		gbc_lblThe.gridy = 1;
		panel_1.add(lblThe, gbc_lblThe);
		
		JLabel lblCorruption = new JLabel("Corruption");
		lblCorruption.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblCorruption = new GridBagConstraints();
		gbc_lblCorruption.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorruption.gridx = 2;
		gbc_lblCorruption.gridy = 2;
		panel_1.add(lblCorruption, gbc_lblCorruption);
		
		JLabel lblOf = new JLabel("Of");
		lblOf.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblOf = new GridBagConstraints();
		gbc_lblOf.insets = new Insets(0, 0, 5, 5);
		gbc_lblOf.gridx = 2;
		gbc_lblOf.gridy = 3;
		panel_1.add(lblOf, gbc_lblOf);
		
		JLabel lblKindness = new JLabel("Kindness");
		lblKindness.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblKindness = new GridBagConstraints();
		gbc_lblKindness.insets = new Insets(0, 0, 5, 5);
		gbc_lblKindness.gridx = 2;
		gbc_lblKindness.gridy = 4;
		panel_1.add(lblKindness, gbc_lblKindness);
		
		JLabel lblNewLabel_1 = new JLabel("                                                               ");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 5;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblVersion = new JLabel("Version:");
		lblVersion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblVersion = new GridBagConstraints();
		gbc_lblVersion.insets = new Insets(0, 0, 5, 5);
		gbc_lblVersion.gridx = 2;
		gbc_lblVersion.gridy = 6;
		panel_1.add(lblVersion, gbc_lblVersion);
		
		JLabel lblNewLabel = new JLabel(options.VERSION + " ");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 7;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Options");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				selection = 3;
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Quit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				selection = 4;
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(btnNewButton_3);
		setVisible(true);
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -5694581379430263106L;
	private final JButton btnLoadGame = new JButton("Load Game");
	private JLabel lblThe;
	private int selection = 0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
	}
	
	public synchronized int getSelection() {
		
		selection = 0;
		
		while (selection == 0) {
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return selection;
		
	}

}
