package com.CorruptionOfKindness.Core.Frames;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import net.miginfocom.swing.MigLayout;
import java.awt.Choice;
import java.awt.Dimension;

import com.CorruptionOfKindness.Body.Genitals.Penis;
import com.CorruptionOfKindness.Body.Genitals.Prostate;
import com.CorruptionOfKindness.Body.Genitals.Testicles;
import com.CorruptionOfKindness.Body.Genitals.Vagina;
import com.CorruptionOfKindness.Core.Entity;
import com.CorruptionOfKindness.Core.GameState;
import com.CorruptionOfKindness.Core.Options;
import com.CorruptionOfKindness.Core.Enum.BreastSize;
import com.CorruptionOfKindness.Core.Enum.Build;
import com.CorruptionOfKindness.Core.Enum.EyeColour;
import com.CorruptionOfKindness.Core.Enum.Gender;
import com.CorruptionOfKindness.Core.Enum.HairColour;
import com.CorruptionOfKindness.Core.Enum.Romantics;
import com.CorruptionOfKindness.Core.Enum.Sexuality;
import com.CorruptionOfKindness.Core.Enum.SkinColour;
import com.CorruptionOfKindness.Core.Enum.SpecialSexTrait;
import com.CorruptionOfKindness.Sentients.Special.Auriel;
import com.CorruptionOfKindness.Sentients.Special.CameronBarnes;
import com.CorruptionOfKindness.Sentients.Special.JustinBrittain;
import com.CorruptionOfKindness.Sentients.Special.LeoKing;
import com.CorruptionOfKindness.Sentients.Special.LoneWolf;
import com.CorruptionOfKindness.Sentients.Special.LucianFarsky;
import com.CorruptionOfKindness.Utill.Utills;
import com.CorruptionOfKindness.Utill.XtraMath;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CharacterCreateFrame extends JFrame {
	
	private boolean cock = true;
	private boolean done = false;
	private Entity Character;
	
	public CharacterCreateFrame(Options options, GameState gameState) {
		
		//Setup
		try {
			this.setIconImage(ImageIO.read(new File(options.Path + "\\res\\purple_heart.png")));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Charecter Creator");
		this.setSize(new Dimension(458, 320));
		this.setLocationRelativeTo(null);
		
		//Contents
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{434, 0};
		gridBagLayout.rowHeights = new int[]{261, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 0;
		getContentPane().add(tabbedPane, gbc_tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Gender and Sex", null, panel, "Gender, Sex, and Sexuality");
		tabbedPane.setEnabledAt(0, true);
		panel.setLayout(new MigLayout("", "[grow,fill][][grow,fill]", "[grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill]"));
		
		JLabel lblBiologicalSex = new JLabel("Biological Sex");
		panel.add(lblBiologicalSex, "cell 0 0");
		
		JLabel lblGender = new JLabel("Gender");
		panel.add(lblGender, "cell 2 0");
		
		
		JSlider slider_1 = new JSlider();
		slider_1.setPaintTicks(true);
		slider_1.setSnapToTicks(true);
		slider_1.setMajorTickSpacing(1);
		slider_1.setToolTipText("");
		slider_1.setValue(5);
		slider_1.setMinimum(2);
		slider_1.setMaximum(8);
		slider_1.setPaintLabels(true);
		slider_1.setEnabled(cock);
		
		Choice choice = new Choice();
		choice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				if ((choice.getSelectedItem() == "Male") || (choice.getSelectedItem() == "Herm")) {
					
					cock = true;
					slider_1.setEnabled(true);
					
				}
				else {
					
					cock = false;
					slider_1.setEnabled(false);
					
				}
				
			}
		});
		choice.add("Male");
		choice.add("Female");
		choice.add("Herm");
		panel.add(choice, "cell 0 1,grow");
		
		Choice choice_1 = new Choice();
		
		for (Gender w: Gender.values()) {
			
			choice_1.add(w.toString());
			
		}
		
		panel.add(choice_1, "cell 2 1,grow");
		
		JLabel lblSexualAtraction = new JLabel("Sexual Atraction");
		panel.add(lblSexualAtraction, "cell 0 2");
		
		JLabel lblRomanticAtraction = new JLabel("Romantic Atraction");
		panel.add(lblRomanticAtraction, "cell 2 2");
		
		Choice choice_2 = new Choice();
		
		for (Sexuality w: Sexuality.values()) {
			
			choice_2.add(w.toString());
			
		}
		
		panel.add(choice_2, "cell 0 3,grow");
		
		Choice choice_3 = new Choice();
		
		for (Romantics w: Romantics.values()) {
			
			choice_3.add(w.toString());
			
		}
		
		panel.add(choice_3, "cell 2 3");
		
		JLabel lblAge = new JLabel("Age");
		panel.add(lblAge, "cell 0 4");
		
		JLabel birthDay = new JLabel("Birth Day: January 1");
		panel.add(birthDay, "cell 2 4");
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(18, 14, 30, 1));
		panel.add(spinner, "cell 0 5");
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.addChangeListener(new ChangeListener() {
			@SuppressWarnings("deprecation")
			public void stateChanged(ChangeEvent e) {
				
				Calendar calendar = Calendar.getInstance();
				calendar.set(Calendar.DAY_OF_YEAR, (int) spinner_1.getValue());
				birthDay.setText("Birth Day: " 
				+ Utills.convertIntToMonth(calendar.getTime().getMonth()) + " " + calendar.getTime().getDate());
				
			}
		});
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 356, 1));
		panel.add(spinner_1, "cell 2 5");
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Physical Specifications", null, panel_1, null);
		tabbedPane.setEnabledAt(1, true);
		panel_1.setLayout(new MigLayout("", "[grow,fill][][grow,fill]", "[grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][][grow,fill]"));
		
		JLabel lblHeight = new JLabel("Height (cm) 5'feet 6.9\"inches");
		panel_1.add(lblHeight, "cell 0 0");
		
		JLabel lblBuild = new JLabel("Build");
		panel_1.add(lblBuild, "cell 2 0");
		
		JSpinner height_spinner = new JSpinner();
		height_spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				lblHeight.setText("Height (cm) " + XtraMath.convertCmToFI(Integer.parseInt(height_spinner.getValue().toString())));
				
			}
		});
		height_spinner.setModel(new SpinnerNumberModel(170, options.getMinHeight(), options.getMaxHeight(), 10));
		panel_1.add(height_spinner, "cell 0 1,aligny top");
		
		Choice build = new Choice();
		
		for (Build w: Build.values()) {
			
			build.add(w.toString());
			
		}
		
		panel_1.add(build, "cell 2 1");
		
		JLabel lblEyeColour = new JLabel("Eye Colour");
		
		panel_1.add(lblEyeColour, "cell 0 2");
		
		JLabel lblSkinColour = new JLabel("Skin Colour");
		panel_1.add(lblSkinColour, "cell 2 2");
		
		Choice eye_colour = new Choice();
		
		if (options.isWarlock()) {
			
			for (EyeColour w: EyeColour.values()) {
				
				eye_colour.add(w.toString());
				
			}
			
		}
		else {
			
			eye_colour.add("Brown");
			eye_colour.add("BlueGrey");
			eye_colour.add("SaphireBlue");
			eye_colour.add("Hazel");
			eye_colour.add("Green");
			eye_colour.add("SeaGreen");
			eye_colour.add("Grey");
			eye_colour.add("GreyGreen");
			eye_colour.add("Amber");
			
		}
		
		panel_1.add(eye_colour, "cell 0 3");
		
		Choice skin_colour = new Choice();
		
		if (options.isWarlock()) {
			
			for (SkinColour w: SkinColour.values()) {
				
				skin_colour.add(w.toString());
				
			}
			
		}
		else {
			
			skin_colour.add("Pale");
			skin_colour.add("Olive");
			skin_colour.add("Tanned");
			skin_colour.add("Ebony");
			skin_colour.add("Fair");
			skin_colour.add("Ashen");
			
		}
		
		panel_1.add(skin_colour, "cell 2 3");
		
		JLabel lblHairColour = new JLabel("Hair Colour");
		panel_1.add(lblHairColour, "cell 0 4");
		
		JLabel lblSpecialAttribute = new JLabel("Special Attribute");
		lblSpecialAttribute.setToolTipText("Select Bellow and read description on DONE page");
		panel_1.add(lblSpecialAttribute, "cell 2 4");
		
		Choice hair_colour = new Choice();
		
		if (options.isWarlock()) {
			
			for (HairColour w: HairColour.values()) {
				
				hair_colour.add(w.toString());
				
			}
			
		}
		else {
			
			hair_colour.add("Brown");
			hair_colour.add("Black");
			hair_colour.add("Grey");
			hair_colour.add("DirtyBlonde");
			hair_colour.add("SandyBlonde");
			hair_colour.add("PaltinumBlonde");
			hair_colour.add("GoldenBlonde");
			hair_colour.add("Auburn");
			hair_colour.add("Red");
			hair_colour.add("ReddishOrange");
			hair_colour.add("Orange");
			hair_colour.add("White");
			hair_colour.add("Silver");
			hair_colour.add("Chocholate");
			
		}
		
		panel_1.add(slider_1, "cell 2 8");
		
		panel_1.add(hair_colour, "cell 0 5");
		
		Choice special = new Choice();
		for (SpecialSexTrait w: SpecialSexTrait.values()) {
			
			special.add(w.toString());
			
		}
		panel_1.add(special, "cell 2 5");
		
		JLabel lblBreasts = new JLabel("Breasts: B Cup");
		panel_1.add(lblBreasts, "cell 0 6");
		
		JLabel lblCock = new JLabel("Cock (inches)");
		panel_1.add(lblCock, "cell 2 6");
		
		JSlider slider = new JSlider();
		slider.setMajorTickSpacing(1);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int num = slider.getValue();
				switch (num) {
				
				case 0:
					lblBreasts.setText("Breasts: Flat");
					break;
				case 1:
					lblBreasts.setText("Breasts: A Cup");
					break;
				case 2:
					lblBreasts.setText("Breasts: B Cup");
					break;
				case 3:
					lblBreasts.setText("Breasts: C Cup");
					break;
				case 4:
					lblBreasts.setText("Breasts: D Cup");
					break;
				}
				
			}
		});
		slider.setPaintTicks(true);
		slider.setSnapToTicks(true);
		slider.setValue(1);
		slider.setMaximum(4);
		panel_1.add(slider, "cell 0 8");
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Done", null, panel_2, null);
		panel_2.setLayout(new MigLayout("", "[grow,fill][grow,fill][grow,fill][grow,fill]", "[grow,fill][grow,fill][grow,fill][grow,fill][grow,fill][grow,fill]"));
		
		JLabel lblName = new JLabel("Name:");
		panel_2.add(lblName, "cell 0 0");
		
		name = new JTextField();
		panel_2.add(name, "cell 0 1 2 1,growx");
		name.setColumns(10);
		
		JButton btnGo = new JButton("Go");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Character = new Entity(gameState, true);
				
				boolean go = false;
				boolean defoGo = false;
				
				switch (Utills.specialCheck(name.getText())) {
				
					case 111:
						go = true;
						break;
					case 0:
						Character = new LucianFarsky(gameState, true);
						Character.Name = "Lucian Farsky";
						done = true;
						break;
					case 1:
						Character = new CameronBarnes(gameState, true);
						Character.Name = "Cameron Barnes";
						done = true;
						break;
					case 2:
						Character = new LeoKing(gameState, true);
						Character.Name = "Leo King";
						done = true;
						break;
					case 3:
						Character = new JustinBrittain(gameState, true);
						Character.Name = "Justin Brittain";
						done = true;
						break;
					case 4:
						Character = new LoneWolf(gameState, true);
						Character.Name = "Lone Wolf";
						done = true;
						break;
					case 5:
						Character = new Auriel(gameState, true);
						Character.Name = "Auriel";
						break;
				
				}
				
				if (!Utills.profan(name.getText())) {
					
					go = false;
					
					name.setText(null);
					JOptionPane.showMessageDialog(null, "Name Not Allowed. Try Again", "Error", JOptionPane.ERROR_MESSAGE);
					
				}
				
				if (go) {
					
					
					Character.Name = name.getText();
					
					for (Gender g: Gender.values()) {
						
						if (choice_1.getSelectedItem().toString().equals(g.toString())) {
							
							Character.gender = g;
							
						}
						
					}
					
					for (Sexuality s: Sexuality.values()) {
						
						if (choice_2.getSelectedItem().toString().equals(s.toString())) {
							
							Character.sex = s;
							
						}
						
					}
					
					for (Romantics r: Romantics.values()) {
						
						if (choice_3.getSelectedItem().toString().equals(r.toString())) {
							
							Character.romanticAtraction = r;
							
						}
						
					}
					
					if (choice.getSelectedItem().toString().equals("Herm")) {
						
						Character.male = true;
						Character.female = true;
						
					}
					else if (choice.getSelectedItem().toString().equals("Male")) {
						
						Character.male = true;
						Character.female = false;
						
					}
					else {
						
						Character.male = false;
						Character.female = true;
						
					}
					
					Character.setAge((int) spinner.getValue());
					Character.birthDate = (int) spinner_1.getValue();
					
					Character.Body.height = Double.valueOf(height_spinner.getValue().toString());
					
					for (EyeColour c: EyeColour.values()) {
						
						if (eye_colour.getSelectedItem().toString().equals(e.toString())) {
							
							Character.Body.eyeColour = c;
							
						}
						
					}
					
					for (HairColour h: HairColour.values()) {
						
						if (hair_colour.getSelectedItem().toString().equals(h.toString())) {
							
							Character.Body.hairColour = h;
							
						}
						
					}
					
					for (SkinColour s: SkinColour.values()) {
						
						if(skin_colour.getSelectedItem().toString().equals(s.toString())) {
							
							Character.Body.skinColour = s;
							
						}
						
					}
					
					for (SpecialSexTrait x: SpecialSexTrait.values()) {
						
						if (special.getSelectedItem().toString().equals(x.toString())) {
							
							Character.Body.specialAtribute = x;
							
						}
						
					}
					
					for (Build b: Build.values()) {
						
						if (build.getSelectedItem().toString().equals(b.toString())) {
							
							Character.Body.build = b;
							
						}
						
					}
					
					switch (slider.getValue()) {
					
						case 0:
							Character.Body.genitals.breasts.boobSize = BreastSize.Flat;
							break;
						case 1:
							Character.Body.genitals.breasts.boobSize = BreastSize.ACup;
							break;
						case 2:
							Character.Body.genitals.breasts.boobSize = BreastSize.BCup;
							break;
						case 3:
							Character.Body.genitals.breasts.boobSize = BreastSize.CCup;
							break;
						case 4:
							Character.Body.genitals.breasts.boobSize = BreastSize.DCup;
							break;
					
					}
					
					if (Character.male) {
						
						Character.Body.genitals.prostate = new Prostate();
						Testicles balls = new Testicles(Character.Body);
						if (Character.Body.specialAtribute == SpecialSexTrait.Bulgy) {
							
							balls.girth = balls.girth * 2;
							balls.length = balls.length * 2;
							
						}
						else if (Character.Body.specialAtribute == SpecialSexTrait.Tiny) {
							
							balls.girth = balls.girth / 2;
							balls.length = balls.length / 2;
							
						}
						
						Character.Body.genitals.Balls.add(balls);
						
						Penis penis = new Penis();
						if (Character.Body.specialAtribute == SpecialSexTrait.Hung) {
							
							penis.girth = penis.girth + 1;
							penis.length = slider_1.getValue() + 2;
							
							if (Character.Body.build == Build.Husky) {
								
								penis.girth = penis.girth + 1;
								
							}
							
						}
						else if (Character.Body.specialAtribute == SpecialSexTrait.Mini) {
							
							if (slider_1.getValue() == 2) {
								
								penis.length = 1;
								penis.girth = penis.girth / 2;
								
							}
							
						}
						else {
							
							penis.length = slider_1.getValue();
							
							if (Character.Body.build == Build.Husky) {
								
								penis.girth = penis.girth + 1;
								
							}
							
						}
						
						Character.Body.genitals.Cocks.add(penis);
						
					}
					if (Character.female) {
						
						Character.Body.genitals.vagina = new Vagina();
						
					}
					
					if (Character.Body.specialAtribute == SpecialSexTrait.EtraArdor) {
						
						Character.Body.libidoScale = Character.Body.libidoScale * 2;
						
					}
					if (Character.Body.specialAtribute == SpecialSexTrait.IceCold) {
						
						Character.Body.libidoScale = Character.Body.libidoScale / 4;
						
					}
					
					if (Character.Body.specialAtribute == SpecialSexTrait.Fertile) {
						
						Character.Body.fertilityScale = Character.Body.fertilityScale * 2;
						
					}
					if (Character.Body.specialAtribute == SpecialSexTrait.Infertile) {
						
						Character.Body.fertilityScale = 0;
						
					}
					
				}
				
				Character.afterInit();
				
				if (defoGo) {
					
					done = true;
					
				}
				else if (go) {
					
					done = true;
					
				}
				
			}
		});
		panel_2.add(btnGo, "cell 3 1");
		
		this.setVisible(true);
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 3073196881646315138L;
	private JTextField name;
	
	public Entity getCharacter() {
		
		while(!done) {
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return Character;
		
	}
	
}
