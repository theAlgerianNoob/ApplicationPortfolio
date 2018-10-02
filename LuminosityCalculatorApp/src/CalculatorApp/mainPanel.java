package CalculatorApp;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Cursor;

public class mainPanel extends JPanel {
	/*Variables for Labels*/
	private JLabel imgBanner;
	private JLabel titleLabel1;
	private JLabel titleLabel2;
	private JLabel titleLabel3;
	private JLabel helpIcon;
	/*Variables for Buttons*/
	private JButton TheScienceBtn;
	private JButton TheCalculatorBtn;
	
	public mainPanel(){
		panelProperties();
	}
	/*
	 * Panel Properties
	 * */
	private void panelProperties(){
		setBounds(100, 100, 450, 456);
		setLayout(null);
		Labels();
		Buttons();	
	}
	/*
	 * Label Properties
	 * */
	private void Labels(){
		imgBanner = new JLabel("\n");
		imgBanner.setIcon(new ImageIcon(mainPanel.class.getResource("/Resources/Images/SpaceImage.jpg")));
		imgBanner.setBounds(0, 0, 450, 130);
		add(imgBanner);
		
		titleLabel1 = new JLabel("THE");
		titleLabel1.setVerticalAlignment(SwingConstants.TOP);
		titleLabel1.setFont(new Font("Monospaced", Font.PLAIN, 30));
		titleLabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
		titleLabel1.setBounds(195, 140, 60, 35);
		add(titleLabel1);
		
		titleLabel2 = new JLabel("LUMINOSITY");
		titleLabel2.setVerticalAlignment(SwingConstants.TOP);
		titleLabel2.setFont(new Font("Monospaced", Font.PLAIN, 40));
		titleLabel2.setAlignmentX(0.5f);
		titleLabel2.setBounds(102, 170, 245, 45);
		add(titleLabel2);
		
		titleLabel3 = new JLabel("CALCULATOR");
		titleLabel3.setVerticalAlignment(SwingConstants.TOP);
		titleLabel3.setFont(new Font("Monospaced", Font.PLAIN, 35));
		titleLabel3.setAlignmentX(0.5f);
		titleLabel3.setBounds(117, 215, 215, 45);
		add(titleLabel3);
		
		helpIcon = new JLabel("");
		helpIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		helpIcon.setIcon(new ImageIcon(mainPanel.class.getResource("/Resources/Icons/info.png")));
		helpIcon.setBounds(213, 376, 24, 24);
		add(helpIcon);
		
	}
	/*
	 * Buttons Properties
	 * */
	private void Buttons(){
		TheScienceBtn = new JButton("The Science\n");
		TheScienceBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
		TheScienceBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		TheScienceBtn.setIcon(new ImageIcon(mainPanel.class.getResource("/Resources/Icons/physics.png")));
		TheScienceBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		TheScienceBtn.setBounds(45, 310, 140, 70);
		add(TheScienceBtn);
		
		TheCalculatorBtn = new JButton("The Calculator");
		TheCalculatorBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		TheCalculatorBtn.setIcon(new ImageIcon(mainPanel.class.getResource("/Resources/Icons/calculating.png")));
		TheCalculatorBtn.setVerticalTextPosition(SwingConstants.BOTTOM);
		TheCalculatorBtn.setBounds(270, 310, 140, 70);
		add(TheCalculatorBtn);
		
	}

}//The Last Bracket
/****Disclamer****
 * I will be declaring all of the resources I use in the section of the code:
 * 
 * -The Image used for the imgBanner label was from http://getwallpapers.com/collection/space-wallpapers-1920x1080
 * -The Icon used for the helpIcon was made by Smashicons from http://www.flaticons.com
 * -The Icon used for TheScienceBtn button was made by Freepik from http://www.flaticons.com 
 * -The Icon used for TheCalculatorBtn button was made by Freepik from http://www.flaticons.com 
 * 
 * */








