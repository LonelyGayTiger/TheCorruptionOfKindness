package com.CorruptionOfKindness.Core.Frames;

import javax.swing.JFrame;
import com.CorruptionOfKindness.Core.Options;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JSpinner;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.SpinnerNumberModel;
import java.awt.Choice;
import javax.swing.JSeparator;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

/**
 * 
 * @author LonelyGayTiger
 *
 */
public class OptionFrame extends JFrame {
	
	private static final long serialVersionUID = -1520241338386670106L;
	
	public Options Options;
	
	public OptionFrame(Options options) {
		
		Options = options;
		Options.updateFonts();
		
		setTitle("Corruption Of Kindness: " + Options.VERSION);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 2;
		gbc_separator.gridy = 1;
		getContentPane().add(separator, gbc_separator);
		
		JLabel labelFont = new JLabel("Font: ");
		labelFont.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_labelFont = new GridBagConstraints();
		gbc_labelFont.gridwidth = 4;
		gbc_labelFont.insets = new Insets(0, 0, 5, 5);
		gbc_labelFont.gridx = 1;
		gbc_labelFont.gridy = 2;
		getContentPane().add(labelFont, gbc_labelFont);
		
		Choice choice = new Choice();
		choice.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				
				for (int i = 0; i <= Options.fonts.length; i++) {
					
					if (Options.fonts[i].equals(choice.getSelectedItem())) {
						
						Options.selectedFont = i;
						
					}
					
				}
				
				labelFont.setFont(Options.getFont());
				labelFont.repaint();
				
			}
		});
		GridBagConstraints gbc_choice = new GridBagConstraints();
		gbc_choice.gridwidth = 4;
		gbc_choice.insets = new Insets(0, 0, 0, 5);
		gbc_choice.gridx = 2;
		gbc_choice.gridy = 3;
		
		for (String s: Options.fonts) {
			
			choice.add(s);
			
		}
		
		getContentPane().add(choice, gbc_choice);
		
		JSpinner spinner = new JSpinner();
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
				Options.fontSize = (int) spinner.getValue();
				
				labelFont.setFont(Options.getFont());
				labelFont.repaint();
			}
		});
		spinner.setModel(new SpinnerNumberModel(15, 8, 32, 1));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.gridwidth = 3;
		gbc_spinner.insets = new Insets(0, 0, 0, 5);
		gbc_spinner.gridx = 7;
		gbc_spinner.gridy = 3;
		getContentPane().add(spinner, gbc_spinner);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.gridx = 15;
		gbc_verticalStrut.gridy = 3;
		getContentPane().add(verticalStrut, gbc_verticalStrut);
		
		this.setSize(new Dimension(450, 300));
		this.setLocationRelativeTo(null);
		this.setEnabled(true);
		this.setVisible(true);
	
	}

}
