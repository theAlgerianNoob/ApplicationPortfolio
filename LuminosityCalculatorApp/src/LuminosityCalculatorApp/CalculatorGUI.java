package LuminosityCalculatorApp;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

public class CalculatorGUI extends JFrame {
	
	/*Menu bar items variables*/
	private JMenu mnMenu;
	private JMenuItem mntmMinimize, mntmClose;
	private JMenuBar menuBar;
	
	/*Panel variables*/
	private JPanel pnlMain, pnlScience;
	
	/*Label variables*/
	private JLabel lblImgBanner;
	private JLabel lblTitle1, lblTitle2, lblTitle3, lblHelp;
	private JButton btnScience, btnCalculator;
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*--------------------------------------------------------------FRAME PROPERTIES------------------------------------------------------------------------------------------------
*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	
	public CalculatorGUI() {	
		setResizable(false);
		setTitle("The Luminosity Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 250, 550, 600);
		getContentPane().setLayout(null);
		
		MenuBarProperties();
		Panels();
		Labels();
		Buttons();
	}
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*--------------------------------------------------------------MENU BAR PROPERTIES---------------------------------------------------------------------------------------------
*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/	
	
	void MenuBarProperties(){
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		mntmMinimize = new JMenuItem("Minimize");
		mntmMinimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {setExtendedState(JFrame.ICONIFIED);}});
		mntmMinimize.setAlignmentX(Component.LEFT_ALIGNMENT);
		mntmMinimize.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, InputEvent.META_MASK));
		mntmMinimize.setIcon(new ImageIcon(CalculatorGUI.class.getResource("/Resources/Icons/minimize.png")));
		mnMenu.add(mntmMinimize);
		
		mntmClose = new JMenuItem("Close");
		mntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {System.exit(JFrame.EXIT_ON_CLOSE);}});
		mntmClose.setIcon(new ImageIcon(CalculatorGUI.class.getResource("/Resources/Icons/exit.png")));
		mntmClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, InputEvent.META_MASK));
		mnMenu.add(mntmClose);
	}
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*--------------------------------------------------------------PANEL PROPERTIES------------------------------------------------------------------------------------------------
*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	
	void Panels(){
		pnlMain = new JPanel();
		pnlMain.setBounds(0, 0, 550, 556);
		getContentPane().add(pnlMain);
		pnlMain.setLayout(null);
		
		pnlScience = new JPanel();
		pnlScience.setBounds(0, 0, 550, 556);
		getContentPane().add(pnlScience);
		pnlScience.setLayout(null);
	}
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*--------------------------------------------------------------LABEL PROPERTIES------------------------------------------------------------------------------------------------
*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

	void Labels(){
		/*
		 * Labels for pnlMain
		 * */
		lblImgBanner = new JLabel("");
		lblImgBanner.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgBanner.setIcon(new ImageIcon(CalculatorGUI.class.getResource("/Resources/Images/SpaceImage.jpg")));
		lblImgBanner.setBounds(0, 0, 550, 150);
		pnlMain.add(lblImgBanner);
		
		lblTitle1 = new JLabel("THE");
		lblTitle1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle1.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblTitle1.setFont(new Font("Monospaced", Font.PLAIN, 40));
		lblTitle1.setBounds(237, 162, 75, 45);
		pnlMain.add(lblTitle1);
		
		lblTitle2 = new JLabel("LUMINOSITY");
		lblTitle2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblTitle2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle2.setFont(new Font("Monospaced", Font.PLAIN, 70));
		lblTitle2.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblTitle2.setBounds(49, 201, 451, 70);
		pnlMain.add(lblTitle2);
		
		lblTitle3 = new JLabel("CALCULATOR");
		lblTitle3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle3.setFont(new Font("Monospaced", Font.PLAIN, 40));
		lblTitle3.setAlignmentX(0.5f);
		lblTitle3.setBounds(150, 267, 250, 45);
		pnlMain.add(lblTitle3);
		
		lblHelp = new JLabel("");
		lblHelp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblHelp.setIcon(new ImageIcon(CalculatorGUI.class.getResource("/Resources/Icons/info.png")));
		lblHelp.setBounds(263, 473, 24, 24);
		pnlMain.add(lblHelp);
		
		
	}
/*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*--------------------------------------------------------------BUTTON PROPERTIES----------------------------------------------------------------------------------------------
*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	
	void Buttons(){
		/*
		 * Buttons for pnlMain
		 * */
		btnScience = new JButton("The Science\n");
		btnScience.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnScience.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlMain.setVisible(false);
				pnlScience.setVisible(true);}});		
		btnScience.setIcon(new ImageIcon(CalculatorGUI.class.getResource("/Resources/Icons/atom.png")));
		btnScience.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnScience.setHorizontalTextPosition(SwingConstants.CENTER);
		btnScience.setAlignmentX(0.5f);
		btnScience.setBounds(49, 378, 160, 80);
		pnlMain.add(btnScience);
		
		btnCalculator = new JButton("The Calculator\n");
		btnCalculator.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnCalculator.setIcon(new ImageIcon(CalculatorGUI.class.getResource("/Resources/Icons/calculator.png")));
		btnCalculator.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCalculator.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCalculator.setAlignmentX(0.5f);
		btnCalculator.setBounds(340, 378, 160, 80);
		pnlMain.add(btnCalculator);
	}
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*--------------------------------------------------------------------------MAIN------------------------------------------------------------------------------------------------
*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

	public static void main(String[] args) {
		CalculatorGUI frame = new CalculatorGUI();
		frame.setVisible(true);
	}
}//Closing Bracket

/****Disclamer****
 * I will be declaring all of the resources I use in the section of the code:
 * 
 * -The Image used for the imgBanner label was from http://getwallpapers.com/collection/space-wallpapers-1920x1080
 * 
 * -The Icon used for the mntmMinimize was made by Gregor Cresnar from http://www.flaticons.com
 * -The Icon used for the mntmClose was made by Smashicons from http://www.flaticons.com
 * -The Icon used for btnScience button was made by Freepik from http://www.flaticons.com 
 * -The Icon used for btnCalculator button was made by Smashicons from http://www.flaticons.com
 * 
 * 
 * */
