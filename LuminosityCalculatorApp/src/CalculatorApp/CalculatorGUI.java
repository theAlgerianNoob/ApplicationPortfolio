package CalculatorApp;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class CalculatorGUI extends JFrame {
	/*Variable for main panel class*/
	private mainPanel MainPanel;
	/*Variables for JMenu*/
	private JMenuBar menuBar;
	private JMenu mnMenu;
	private JMenuItem mntmMinimize;
	private JMenuItem mntmClose;
	

	public static void main(String[] args) {
		CalculatorGUI frame = new CalculatorGUI();
		frame.setVisible(true);
	}
	/*
	 * Frame Properties
	 * */
	public CalculatorGUI(){
		setResizable(false);
		setTitle("The Luminosity Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		MenuBarItems();
		setContentPane(MainPanel);		
	}
	/*
	 * MenuBar Properties
	 * */
	private void MenuBarItems(){
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		mntmMinimize = new JMenuItem("Minimize");
		mntmMinimize.setIcon(new ImageIcon(CalculatorGUI.class.getResource("/Resources/Icons/minimize.png")));
		mntmMinimize.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, InputEvent.META_MASK));
		mnMenu.add(mntmMinimize);
		
		mntmClose = new JMenuItem("Close ");
		mntmClose.setIcon(new ImageIcon(CalculatorGUI.class.getResource("/Resources/Icons/exit.png")));
		mntmClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, InputEvent.META_MASK));
		mnMenu.add(mntmClose);
		
		MainPanel = new mainPanel();		
	}
}//The Last Bracket
/****Disclamer****
 * I will be declaring all of the resources I use in the section of the code:
 * 
 * -The Icon used for the mntmMinimize was made by Gregor Cresnar from http://www.flaticons.com
 * -The Icon used for the mntmClose was made by Smashicons from http://www.flaticons.com
 * 
 * 
 * */








