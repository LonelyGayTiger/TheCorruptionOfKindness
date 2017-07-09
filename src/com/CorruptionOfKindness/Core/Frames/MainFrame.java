package com.CorruptionOfKindness.Core.Frames;

import javax.swing.JFrame;

import com.CorruptionOfKindness.Core.Area;
import com.CorruptionOfKindness.Core.Entity;
import com.CorruptionOfKindness.Core.GameState;
import com.CorruptionOfKindness.Core.Options;
import com.CorruptionOfKindness.CoreInterfaces.AfterInit;
import com.CorruptionOfKindness.CoreInterfaces.CheckInterface;
import com.CorruptionOfKindness.Core.Map;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSeparator;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame implements AfterInit, CheckInterface {
	
	public Entity Player;
	
	public GameState gameState;
	public Options options;
	
	public boolean cont = true;
	
	private static final long serialVersionUID = 7583679603052302296L;
	
	public Area currentArea;
	
	public Map Map;
	
	public JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btnLevelUp;
	public JTextPane textPane;
	public JMenuItem mntmMainMenu, mntmData, mntmStats, mntmPerks, mntmApearance;
	private JLabel lblStrength, lblToughness, lblIntelegence, lblLibido, lblSensitivity, lblCorruption, lblHealth, lblLust, lblStamina, lblLevel, lblExperience, lblGold, lblYear, lblDay, lblTime;
	private JProgressBar corrBar, healthBar, lustBar, stamBar, expBar;
	
	public MainFrame(Options options, GameState gameState) {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				
				exit();
				
			}
		});
		
		this.gameState = gameState;
		this.options = options;
		this.Player = gameState.Player;
		
		try {
			this.setIconImage(ImageIO.read(new File(options.Path + "\\res\\purple_heart.png")));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setSize(new Dimension(1024, 784));
		setTitle("Corruption Of Kindness: " + options.VERSION);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		this.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.EAST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel name = new JLabel("Name: " + Player.Name);
		name.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_name = new GridBagConstraints();
		gbc_name.insets = new Insets(0, 0, 5, 0);
		gbc_name.gridx = 0;
		gbc_name.gridy = 0;
		panel.add(name, gbc_name);
		
		JLabel lblCoreStats = new JLabel("Core Stats:");
		lblCoreStats.setFont(new Font("Tahoma", Font.BOLD, 19));
		GridBagConstraints gbc_lblCoreStats = new GridBagConstraints();
		gbc_lblCoreStats.insets = new Insets(0, 0, 5, 0);
		gbc_lblCoreStats.gridx = 0;
		gbc_lblCoreStats.gridy = 1;
		panel.add(lblCoreStats, gbc_lblCoreStats);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 2;
		panel.add(separator, gbc_separator);
		
		lblStrength = new JLabel("Strength: " + Player.Body.Strength);
		lblStrength.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblStrength = new GridBagConstraints();
		gbc_lblStrength.insets = new Insets(0, 0, 5, 0);
		gbc_lblStrength.gridx = 0;
		gbc_lblStrength.gridy = 3;
		panel.add(lblStrength, gbc_lblStrength);
		
		lblToughness = new JLabel("Toughness: " + Player.Body.Toughness);
		lblToughness.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblToughness = new GridBagConstraints();
		gbc_lblToughness.insets = new Insets(0, 0, 5, 0);
		gbc_lblToughness.gridx = 0;
		gbc_lblToughness.gridy = 4;
		panel.add(lblToughness, gbc_lblToughness);
		
		lblIntelegence = new JLabel("Intelegence: " + Player.Body.Intelegence);
		lblIntelegence.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblIntelegence = new GridBagConstraints();
		gbc_lblIntelegence.insets = new Insets(0, 0, 5, 0);
		gbc_lblIntelegence.gridx = 0;
		gbc_lblIntelegence.gridy = 5;
		panel.add(lblIntelegence, gbc_lblIntelegence);
		
		lblLibido = new JLabel("Libido: " + Player.Body.Libido);
		lblLibido.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblLibido = new GridBagConstraints();
		gbc_lblLibido.insets = new Insets(0, 0, 5, 0);
		gbc_lblLibido.gridx = 0;
		gbc_lblLibido.gridy = 6;
		panel.add(lblLibido, gbc_lblLibido);
		
		lblSensitivity = new JLabel("Sensitivity: " + Player.Body.Sensitivity);
		lblSensitivity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblSensitivity = new GridBagConstraints();
		gbc_lblSensitivity.insets = new Insets(0, 0, 5, 0);
		gbc_lblSensitivity.gridx = 0;
		gbc_lblSensitivity.gridy = 7;
		panel.add(lblSensitivity, gbc_lblSensitivity);
		
		lblCorruption = new JLabel("Corruption: " + Player.Body.Corruption);
		lblCorruption.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCorruption = new GridBagConstraints();
		gbc_lblCorruption.insets = new Insets(0, 0, 5, 0);
		gbc_lblCorruption.gridx = 0;
		gbc_lblCorruption.gridy = 8;
		panel.add(lblCorruption, gbc_lblCorruption);
		
		corrBar = new JProgressBar();
		corrBar.setForeground(Color.BLACK);
		corrBar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		corrBar.setStringPainted(true);
		corrBar.setValue(Player.Body.Corruption);
		GridBagConstraints gbc_corrBar = new GridBagConstraints();
		gbc_corrBar.insets = new Insets(0, 0, 5, 0);
		gbc_corrBar.gridx = 0;
		gbc_corrBar.gridy = 9;
		panel.add(corrBar, gbc_corrBar);
		
		JSeparator separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.insets = new Insets(0, 0, 5, 0);
		gbc_separator_1.gridx = 0;
		gbc_separator_1.gridy = 10;
		panel.add(separator_1, gbc_separator_1);
		
		JLabel lblCombatStats = new JLabel("Combat Stats: ");
		lblCombatStats.setFont(new Font("Tahoma", Font.BOLD, 19));
		GridBagConstraints gbc_lblCombatStats = new GridBagConstraints();
		gbc_lblCombatStats.insets = new Insets(0, 0, 5, 0);
		gbc_lblCombatStats.gridx = 0;
		gbc_lblCombatStats.gridy = 11;
		panel.add(lblCombatStats, gbc_lblCombatStats);
		
		lblHealth = new JLabel("Health: " + Player.Health + "/" + Player.getMaxHealth());
		lblHealth.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblHealth = new GridBagConstraints();
		gbc_lblHealth.insets = new Insets(0, 0, 5, 0);
		gbc_lblHealth.gridx = 0;
		gbc_lblHealth.gridy = 12;
		panel.add(lblHealth, gbc_lblHealth);
		
		healthBar = new JProgressBar();
		healthBar.setForeground(Color.RED);
		healthBar.setToolTipText("Health");
		healthBar.setStringPainted(true);
		healthBar.setMaximum(Player.getMaxHealth());
		healthBar.setValue(Player.Health);
		healthBar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_healthBar = new GridBagConstraints();
		gbc_healthBar.insets = new Insets(0, 0, 5, 0);
		gbc_healthBar.gridx = 0;
		gbc_healthBar.gridy = 13;
		panel.add(healthBar, gbc_healthBar);
		
		lblLust = new JLabel("Lust: " + Player.Lust);
		lblLust.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblLust = new GridBagConstraints();
		gbc_lblLust.insets = new Insets(0, 0, 5, 0);
		gbc_lblLust.gridx = 0;
		gbc_lblLust.gridy = 14;
		panel.add(lblLust, gbc_lblLust);
		
		lustBar = new JProgressBar();
		lustBar.setForeground(Color.RED);
		lustBar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lustBar.setStringPainted(true);
		lustBar.setMaximum(Player.getMaxLust());
		lustBar.setValue(Player.Lust);
		GridBagConstraints gbc_lustBar = new GridBagConstraints();
		gbc_lustBar.insets = new Insets(0, 0, 5, 0);
		gbc_lustBar.gridx = 0;
		gbc_lustBar.gridy = 15;
		panel.add(lustBar, gbc_lustBar);
		
		lblStamina = new JLabel("Stamina: " + Player.Body.stamina + "/100");
		lblStamina.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblStamina = new GridBagConstraints();
		gbc_lblStamina.insets = new Insets(0, 0, 5, 0);
		gbc_lblStamina.gridx = 0;
		gbc_lblStamina.gridy = 16;
		panel.add(lblStamina, gbc_lblStamina);
		
		stamBar = new JProgressBar();
		stamBar.setForeground(Color.GREEN);
		stamBar.setStringPainted(true);
		stamBar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		stamBar.setValue(Player.Body.stamina);
		GridBagConstraints gbc_stamBar = new GridBagConstraints();
		gbc_stamBar.insets = new Insets(0, 0, 5, 0);
		gbc_stamBar.gridx = 0;
		gbc_stamBar.gridy = 17;
		panel.add(stamBar, gbc_stamBar);
		
		JSeparator separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.insets = new Insets(0, 0, 5, 0);
		gbc_separator_2.gridx = 0;
		gbc_separator_2.gridy = 18;
		panel.add(separator_2, gbc_separator_2);
		
		JLabel lblAdvancmentStats = new JLabel("Advancment Stats: ");
		lblAdvancmentStats.setFont(new Font("Tahoma", Font.BOLD, 19));
		GridBagConstraints gbc_lblAdvancmentStats = new GridBagConstraints();
		gbc_lblAdvancmentStats.insets = new Insets(0, 0, 5, 0);
		gbc_lblAdvancmentStats.gridx = 0;
		gbc_lblAdvancmentStats.gridy = 19;
		panel.add(lblAdvancmentStats, gbc_lblAdvancmentStats);
		
		lblLevel = new JLabel("Level: " + Player.getLevel());
		lblLevel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblLevel = new GridBagConstraints();
		gbc_lblLevel.insets = new Insets(0, 0, 5, 0);
		gbc_lblLevel.gridx = 0;
		gbc_lblLevel.gridy = 20;
		panel.add(lblLevel, gbc_lblLevel);
		
		lblExperience = new JLabel("Experience: " + Player.getExp());
		lblExperience.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblExperience = new GridBagConstraints();
		gbc_lblExperience.insets = new Insets(0, 0, 5, 0);
		gbc_lblExperience.gridx = 0;
		gbc_lblExperience.gridy = 21;
		panel.add(lblExperience, gbc_lblExperience);
		
		expBar = new JProgressBar();
		expBar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		expBar.setStringPainted(true);
		expBar.setMaximum(Player.getMaxExpByLevel(Player.getLevel()));
		expBar.setValue(Player.getExp());
		GridBagConstraints gbc_expBar = new GridBagConstraints();
		gbc_expBar.insets = new Insets(0, 0, 5, 0);
		gbc_expBar.gridx = 0;
		gbc_expBar.gridy = 22;
		panel.add(expBar, gbc_expBar);
		
		btnLevelUp = new JButton("Level Up");
		btnLevelUp.setEnabled(false);
		btnLevelUp.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		GridBagConstraints gbc_btnLevelUp = new GridBagConstraints();
		gbc_btnLevelUp.insets = new Insets(0, 0, 5, 0);
		gbc_btnLevelUp.gridx = 0;
		gbc_btnLevelUp.gridy = 23;
		panel.add(btnLevelUp, gbc_btnLevelUp);
		
		lblGold = new JLabel("Gold: " + Player.getGold());
		lblGold.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblGold = new GridBagConstraints();
		gbc_lblGold.insets = new Insets(0, 0, 5, 0);
		gbc_lblGold.gridx = 0;
		gbc_lblGold.gridy = 24;
		panel.add(lblGold, gbc_lblGold);
		
		JSeparator separator_3 = new JSeparator();
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.insets = new Insets(0, 0, 5, 0);
		gbc_separator_3.gridx = 0;
		gbc_separator_3.gridy = 25;
		panel.add(separator_3, gbc_separator_3);
		
		JLabel lblCalendar = new JLabel("Calendar: ");
		lblCalendar.setFont(new Font("Tahoma", Font.BOLD, 19));
		GridBagConstraints gbc_lblCalendar = new GridBagConstraints();
		gbc_lblCalendar.insets = new Insets(0, 0, 5, 0);
		gbc_lblCalendar.gridx = 0;
		gbc_lblCalendar.gridy = 26;
		panel.add(lblCalendar, gbc_lblCalendar);
		
		lblYear = new JLabel("Year: " + gameState.year);
		lblYear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblYear = new GridBagConstraints();
		gbc_lblYear.insets = new Insets(0, 0, 5, 0);
		gbc_lblYear.gridx = 0;
		gbc_lblYear.gridy = 27;
		panel.add(lblYear, gbc_lblYear);
		
		lblDay = new JLabel("Day: " + gameState.date);
		lblDay.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblDay = new GridBagConstraints();
		gbc_lblDay.insets = new Insets(0, 0, 5, 0);
		gbc_lblDay.gridx = 0;
		gbc_lblDay.gridy = 28;
		panel.add(lblDay, gbc_lblDay);
		
		lblTime = new JLabel("Time: " + gameState.timeArray[gameState.timeArrayInt]);
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblTime = new GridBagConstraints();
		gbc_lblTime.gridx = 0;
		gbc_lblTime.gridy = 29;
		panel.add(lblTime, gbc_lblTime);
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_2.add(panel_1, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {0, 30, 0, 30, 0, 30, 0, 30};
		gbl_panel_1.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel_1.setLayout(gbl_panel_1);
		
		JSeparator separator_6 = new JSeparator();
		GridBagConstraints gbc_separator_6 = new GridBagConstraints();
		gbc_separator_6.insets = new Insets(0, 0, 5, 5);
		gbc_separator_6.gridx = 0;
		gbc_separator_6.gridy = 0;
		panel_1.add(separator_6, gbc_separator_6);
		
		btn1 = new JButton("New button");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn1();
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.insets = new Insets(0, 0, 5, 5);
		gbc_btn1.gridx = 0;
		gbc_btn1.gridy = 1;
		panel_1.add(btn1, gbc_btn1);
		
		btn2 = new JButton("New button");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn2();
				
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.insets = new Insets(0, 0, 5, 5);
		gbc_btn2.gridx = 2;
		gbc_btn2.gridy = 1;
		panel_1.add(btn2, gbc_btn2);
		
		btn3 = new JButton("New button");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn3();
				
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.insets = new Insets(0, 0, 5, 5);
		gbc_btn3.gridx = 4;
		gbc_btn3.gridy = 1;
		panel_1.add(btn3, gbc_btn3);
		
		btn4 = new JButton("New button");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn4();
				
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.insets = new Insets(0, 0, 5, 5);
		gbc_btn4.gridx = 6;
		gbc_btn4.gridy = 1;
		panel_1.add(btn4, gbc_btn4);
		
		btn5 = new JButton("New button");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn5();
				
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.insets = new Insets(0, 0, 5, 0);
		gbc_btn5.gridx = 8;
		gbc_btn5.gridy = 1;
		panel_1.add(btn5, gbc_btn5);
		
		JSeparator separator_4 = new JSeparator();
		GridBagConstraints gbc_separator_4 = new GridBagConstraints();
		gbc_separator_4.insets = new Insets(0, 0, 5, 5);
		gbc_separator_4.gridx = 0;
		gbc_separator_4.gridy = 2;
		panel_1.add(separator_4, gbc_separator_4);
		
		JSeparator separator_5 = new JSeparator();
		GridBagConstraints gbc_separator_5 = new GridBagConstraints();
		gbc_separator_5.insets = new Insets(0, 0, 5, 5);
		gbc_separator_5.gridx = 0;
		gbc_separator_5.gridy = 3;
		panel_1.add(separator_5, gbc_separator_5);
		
		btn6 = new JButton("New button");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn6();
				
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btn6 = new GridBagConstraints();
		gbc_btn6.insets = new Insets(0, 0, 5, 5);
		gbc_btn6.gridx = 0;
		gbc_btn6.gridy = 4;
		panel_1.add(btn6, gbc_btn6);
		
		btn7 = new JButton("New button");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn7();
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btn7 = new GridBagConstraints();
		gbc_btn7.insets = new Insets(0, 0, 5, 5);
		gbc_btn7.gridx = 2;
		gbc_btn7.gridy = 4;
		panel_1.add(btn7, gbc_btn7);
		
		btn8 = new JButton("New button");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn8();
				
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btn8 = new GridBagConstraints();
		gbc_btn8.insets = new Insets(0, 0, 5, 5);
		gbc_btn8.gridx = 4;
		gbc_btn8.gridy = 4;
		panel_1.add(btn8, gbc_btn8);
		
		btn9 = new JButton("New button");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn9();
				
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btn9 = new GridBagConstraints();
		gbc_btn9.insets = new Insets(0, 0, 5, 5);
		gbc_btn9.gridx = 6;
		gbc_btn9.gridy = 4;
		panel_1.add(btn9, gbc_btn9);
		
		btn10 = new JButton("New button");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn10();
				
			}
		});
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btn10 = new GridBagConstraints();
		gbc_btn10.insets = new Insets(0, 0, 5, 0);
		gbc_btn10.gridx = 8;
		gbc_btn10.gridy = 4;
		panel_1.add(btn10, gbc_btn10);
		
		JSeparator separator_7 = new JSeparator();
		GridBagConstraints gbc_separator_7 = new GridBagConstraints();
		gbc_separator_7.insets = new Insets(0, 0, 0, 5);
		gbc_separator_7.gridx = 0;
		gbc_separator_7.gridy = 5;
		panel_1.add(separator_7, gbc_separator_7);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setText(Player.Name);
		panel_2.add(textPane, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mntmMainMenu = new JMenuItem("Main Menu");
		menuBar.add(mntmMainMenu);
		
		mntmData = new JMenuItem("Data");
		menuBar.add(mntmData);
		
		mntmStats = new JMenuItem("Stats");
		menuBar.add(mntmStats);
		
		mntmPerks = new JMenuItem("Perks");
		menuBar.add(mntmPerks);
		
		mntmApearance = new JMenuItem("Apearance");
		menuBar.add(mntmApearance);
		this.setVisible(true);
		
	}
	
	public void gameStart() {
		// TODO Add Code for game start(From beginig)
		
		while (cont) {
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	private void exit() {
		
		cont = false;
		
	}

	public void setButtonNames(String[] buttons) {
		
		int i = 0;
		
		while (i < 10) {
			
			switch (i) {
			
			case 0:
				if (buttons[i].equals(null)) {
					
					btn1.setName("          ");
					
				}
				else {
					
					btn1.setName(buttons[i]);
					
				}
				break;
			case 1:
				if (buttons[i].equals(null)) {
					
					btn2.setName("          ");
					
				}
				else {
					
					btn2.setName(buttons[i]);
					
				}
				break;
			case 2:
				if (buttons[i].equals(null)) {
					
					btn3.setName("          ");
					
				}
				else {
					
					btn3.setName(buttons[i]);
					
				}
				break;
			case 3:
				if (buttons[i].equals(null)) {
					
					btn4.setName("          ");
					
				}
				else {
					
					btn4.setName(buttons[i]);
					
				}
				break;
			case 4:
				if (buttons[i].equals(null)) {
					
					btn5.setName("          ");
					
				}
				else {
					
					btn5.setName(buttons[i]);
					
				}
				break;
			case 5:
				if (buttons[i].equals(null)) {
					
					btn6.setName("          ");
					
				}
				else {
					
					btn6.setName(buttons[i]);
					
				}
				break;
			case 6:
				if (buttons[i].equals(null)) {
					
					btn7.setName("          ");
					
				}
				else {
					
					btn7.setName(buttons[i]);
					
				}
				break;
			case 7:
				if (buttons[i].equals(null)) {
					
					btn8.setName("          ");
					
				}
				else {
					
					btn8.setName(buttons[i]);
					
				}
				break;
			case 8:
				if (buttons[i].equals(null)) {
					
					btn9.setName("          ");
					
				}
				else {
					
					btn9.setName(buttons[i]);
					
				}
				break;
			case 9:
				if (buttons[i].equals(null)) {
					
					btn10.setName("          ");
					
				}
				else {
					
					btn10.setName(buttons[i]);
					
				}
				break;
		
			}
			
			i++;
			
		}
		
	}
	
	public void enableDisableButtons(boolean[] buttons) {
		
		int i = 0;
		boolean enable = true;
		
		while (i < 10) {
			
			if (buttons[i]) {
				
				enable = true;
				
			}
			else {
				
				enable = false;
				
			}
			
			switch (i) {
			
				case 0:
					btn1.setEnabled(enable);
					break;
				case 1:
					btn2.setEnabled(enable);
					break;
				case 2:
					btn3.setEnabled(enable);
					break;
				case 3:
					btn4.setEnabled(enable);
					break;
				case 4:
					btn5.setEnabled(enable);
					break;
				case 5:
					btn6.setEnabled(enable);
					break;
				case 6:
					btn7.setEnabled(enable);
					break;
				case 7:
					btn8.setEnabled(enable);
					break;
				case 8:
					btn9.setEnabled(enable);
					break;
				case 9:
					btn10.setEnabled(enable);
					break;
			
			}
			
			i++;
			
		}
		
	}
	
	public void btn1() {
		
		currentArea.btn1Press();
		
	}
	
	public void btn2() {
		
		currentArea.btn2Press();
		
	}
	
	public void btn3() {
		
		currentArea.btn3Press();
		
	}
	
	public void btn4() {
		
		currentArea.btn4Press();
		
	}
	
	public void btn5() {
		
		currentArea.btn5Press();
		
	}
	
	public void btn6() {
		
		currentArea.btn6Press();
		
	}
	
	public void btn7() {
		
		currentArea.btn7Press();
		
	}
	
	public void btn8() {
		
		currentArea.btn8Press();
		
	}
	
	public void btn9() {
		
		currentArea.btn9Press();
		
	}
	
	public void btn10() {
		
		currentArea.btn10Press();
		
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub

	}

	@Override
	public void idleCheck() {
		// TODO Auto-generated method stub

	}

	@Override
	public void waitCheck(double hours) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterInit() {
		// TODO Auto-generated method stub

	}

}
