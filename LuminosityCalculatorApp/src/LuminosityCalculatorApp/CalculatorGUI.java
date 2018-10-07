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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalculatorGUI extends JFrame {
	
	/*Menu bar items variables*/
	private JMenu mnMenu;
	private JMenuItem mntmMinimize, mntmClose;
	private JMenuBar menuBar;
	
	/*Panel variables*/
	private JPanel pnlMain, pnlScience;//, pnlCalculator;
	
	/*Label variables*/
	private JLabel lblImgBanner, lblTitle1, lblTitle2, lblTitle3, lblHelp, lblTitle4, lblTitle5;
	
	/*Button variables*/
	private JButton btnScience, btnCalculator, btnMainMenu, btnCalculator2;
	
	/*Text area and Scroll pane variables*/
	private JTextArea txtArea;
	private JScrollPane scrollPane;
	private JPanel pnlCalculator;
	private JLabel lblTitle6;
	private JLabel lblTitle7;
	
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
		MainPanel();
		SciencePanel();
		CalculatorPanel();
		
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
*--------------------------------------------------------------MAIN PANEL PROPERTIES-------------------------------------------------------------------------------------------
*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	
	void MainPanel(){
		
		/*Main Panel Properties*/
		pnlMain = new JPanel();
		pnlMain.setBounds(0, 0, 550, 556);
		getContentPane().add(pnlMain);
		pnlMain.setLayout(null);
		
		/*Label Properties*/
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
		lblHelp.addMouseListener(new MouseAdapter() {@Override
			public void mouseClicked(MouseEvent arg0) {
			Help helpFrame = new Help();
			helpFrame.setVisible(true);
			}
		});
		lblHelp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblHelp.setIcon(new ImageIcon(CalculatorGUI.class.getResource("/Resources/Icons/info.png")));
		lblHelp.setBounds(263, 473, 24, 24);
		pnlMain.add(lblHelp);	
		
		/*Button Properties*/
		btnScience = new JButton("The Science\n");
		btnScience.setFont(new Font("Monospaced", Font.PLAIN, 15));
		btnScience.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlMain.setVisible(false); pnlScience.setVisible(true);}});		
		btnScience.setIcon(new ImageIcon(CalculatorGUI.class.getResource("/Resources/Icons/atom.png")));
		btnScience.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnScience.setHorizontalTextPosition(SwingConstants.CENTER);
		btnScience.setAlignmentX(0.5f);
		btnScience.setBounds(49, 378, 160, 80);
		pnlMain.add(btnScience);
		
		btnCalculator = new JButton("The Calculator\n");
		btnCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pnlMain.setVisible(false); pnlCalculator.setVisible(true);}
		});
		btnCalculator.setFont(new Font("Monospaced", Font.PLAIN, 15));
		btnCalculator.setIcon(new ImageIcon(CalculatorGUI.class.getResource("/Resources/Icons/calculator.png")));
		btnCalculator.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCalculator.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCalculator.setAlignmentX(0.5f);
		btnCalculator.setBounds(340, 378, 160, 80);
		pnlMain.add(btnCalculator);
	}
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*--------------------------------------------------------------SCIENCE PANEL PROPERTIES----------------------------------------------------------------------------------------
*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

	void SciencePanel(){
		
		/*Science Panel Properties*/
		pnlScience = new JPanel();
		pnlScience.setBounds(0, 0, 550, 556);
		getContentPane().add(pnlScience);
		pnlScience.setLayout(null);
		pnlScience.setVisible(false);
		
		/*Label Properties*/
		lblTitle4 = new JLabel("THE");
		lblTitle4.setBounds(244, 6, 61, 25);
		lblTitle4.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle4.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		pnlScience.add(lblTitle4);
		
		lblTitle5 = new JLabel("SCIENCE");
		lblTitle5.setBounds(200, 34, 150, 30);
		lblTitle5.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle5.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblTitle5.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		pnlScience.add(lblTitle5);
		
		textArea();
		
		/*Button Properties*/
		btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pnlScience.setVisible(false); pnlMain.setVisible(true);}});
		btnMainMenu.setIcon(new ImageIcon(CalculatorGUI.class.getResource("/Resources/Icons/home.png")));
		btnMainMenu.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnMainMenu.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMainMenu.setFont(new Font("Monospaced", Font.PLAIN, 15));
		btnMainMenu.setAlignmentX(0.5f);
		btnMainMenu.setBounds(6, 465, 160, 80);
		pnlScience.add(btnMainMenu);
		
		btnCalculator2 = new JButton("The Calculator\n");
		btnCalculator2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pnlScience.setVisible(false); pnlCalculator.setVisible(true);}});
		btnCalculator2.setIcon(new ImageIcon(CalculatorGUI.class.getResource("/Resources/Icons/calculator.png")));
		btnCalculator2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnCalculator2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCalculator2.setFont(new Font("Monospaced", Font.PLAIN, 15));
		btnCalculator2.setAlignmentX(0.5f);
		btnCalculator2.setBounds(384, 465, 160, 80);
		pnlScience.add(btnCalculator2);
		
		//pnlScience.setVisible(false); pnlCalculator.setVisible(true);
	}

/*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*--------------------------------------------------------------TEXT AREA PROPERTIES-------------------------------------------------------------------------------------------
*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	void textArea(){
		
		txtArea = new JTextArea();
		txtArea.setLineWrap(true);
		txtArea.setEditable(false);
		txtArea.setText("dsa\nad\nDS\nDSA\nDAS\nd\nda\ndsa\nads\nda\nd\ndas\nd\ndad\nads\nd\ndas\nd\nD\nDA\nAD\nADSda\ndas\ndas\nda\nda\nad\nda\nad\nad");
		
		scrollPane = new JScrollPane(txtArea);
		scrollPane.setBounds(6, 76, 538, 377);
		pnlScience.add(scrollPane);
	}
/*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*--------------------------------------------------------------CALCULATOR PANEL PROPERTIES-------------------------------------------------------------------------------------
*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

	void CalculatorPanel(){
		
		/*Calculator Panel Properties*/
		pnlCalculator = new JPanel();
		pnlCalculator.setBounds(0, 0, 550, 556);
		getContentPane().add(pnlCalculator);
		pnlCalculator.setLayout(null);
		pnlCalculator.setVisible(false);
		
		/*Label Properties*/
		lblTitle6 = new JLabel("THE");
		lblTitle6.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle6.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblTitle6.setBounds(244, 6, 61, 25);
		pnlCalculator.add(lblTitle6);
		
		lblTitle7 = new JLabel("CALCULATOR");
		lblTitle7.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle7.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		lblTitle7.setAlignmentX(0.5f);
		lblTitle7.setBounds(160, 30, 230, 30);
		pnlCalculator.add(lblTitle7);
	}
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*--------------------------------------------------------------------------MAIN------------------------------------------------------------------------------------------------
*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

	public static void main(String[] args) {
		CalculatorGUI frame = new CalculatorGUI();
		frame.setVisible(true);
	}
}//Final Closing Bracket

/****Disclamer****
 * I will be declaring all of the resources I use in the section of the code:
 * 
 * -The Image used for the imgBanner label was from http://getwallpapers.com/collection/space-wallpapers-1920x1080
 * 
 * -The Icon used for the mntmMinimize was made by Gregor Cresnar from http://www.flaticons.com
 * -The Icon used for the mntmClose was made by Smashicons from http://www.flaticons.com
 * -The Icon used for btnScience and btnScience2 button was made by Freepik from http://www.flaticons.com 
 * -The Icon used for btnCalculator and btnCalculator2 button was made by Smashicons from http://www.flaticons.com
 * -The Icon used for btnMainMenu and btnMainMenu2 was made by Freepik from http://www.flaticons.com  
 * 
 * 
 * */
