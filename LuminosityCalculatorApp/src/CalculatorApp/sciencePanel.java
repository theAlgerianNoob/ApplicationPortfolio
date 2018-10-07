package CalculatorApp;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class sciencePanel extends JPanel {
	/*Variables for Labels*/
	private JLabel Title1lbl;
	private JLabel Title2lbl;
	/*Variables for Text Area and ScrollBar*/
	private JScrollPane scroll;
	private JTextArea textArea;
	/*Variables for Buttons*/
	private JButton MainMenuBtn;
	private JButton TheCalculatorBtn;
	
	public sciencePanel(){
		panel2Properties();
	}
	
	private void panel2Properties(){
		setBounds(0, 0, 450, 456);
		setLayout(null);
		panel2Labels();
		panel2Buttons();
		panel2TextArea();
		
	}
	/*
	 * Label Properties
	 * */
	private void panel2Labels(){
		Title1lbl = new JLabel("THE");
		Title1lbl.setFont(new Font("Monospaced", Font.PLAIN, 30));
		Title1lbl.setBounds(195, 6, 60, 30);
		add(Title1lbl);
		
		Title2lbl = new JLabel("SCIENCE");
		Title2lbl.setFont(new Font("Monospaced", Font.PLAIN, 40));
		Title2lbl.setBounds(137, 37, 175, 35);
		add(Title2lbl);
	}
	/*
	 * Buttons Properties
	 * */
	private void panel2Buttons(){
		MainMenuBtn = new JButton("MainMenu\n");
		MainMenuBtn.setIcon(new ImageIcon(sciencePanel.class.getResource("/Resources/Icons/physics.png")));
		MainMenuBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
		MainMenuBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		MainMenuBtn.setAlignmentX(0.5f);
		MainMenuBtn.setBounds(16, 368, 140, 70);
		add(MainMenuBtn);
		
		TheCalculatorBtn = new JButton("The Calculator\n");
		TheCalculatorBtn.setIcon(new ImageIcon(sciencePanel.class.getResource("/Resources/Icons/calculating.png")));
		TheCalculatorBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
		TheCalculatorBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		TheCalculatorBtn.setAlignmentX(0.5f);
		TheCalculatorBtn.setBounds(293, 368, 140, 70);
		add(TheCalculatorBtn);
	}
	/*
	 * Text Area and Scroll Bar Properties 
	 * */
	private void panel2TextArea(){
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setText("wq\ndas\n\nSAd\nsa\nD\nSAD\nSA\nd\nas\nD\nSAd\naw\nsf\ndas\nf\ndas\nf\n");
		
		scroll = new JScrollPane(textArea);
		scroll.setBounds(6, 76, 438, 292);
		add(scroll);
	}
}
