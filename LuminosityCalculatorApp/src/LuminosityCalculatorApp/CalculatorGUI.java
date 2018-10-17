package LuminosityCalculatorApp;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

public class CalculatorGUI extends JFrame {
	
	/*Menu bar items variables*/
	private JMenu mnMenu;
	private JMenuItem mntmMinimize, mntmClose;
	private JMenuBar menuBar;
	
	/*Panel variables*/
	private JPanel pnlMain, pnlScience, pnlCalculator, pnlLuminosity, pnlArea;
	
	/*Label variables*/
	private JLabel lblImgBanner, lblImgBanner2, lblImgBanner3, lblImgTabWallpaper1, lblTitle1, lblTitle2, lblTitle3, lblHelp, lblTitle4, lblTitle5, lblTitle6, lblTitle7;
	private JLabel lblNameofStarGalaxy, lblRadius, lblPower1, lblUnits1, lblTemperature, lblPower2, lblUnits2, lblLuminosity, lblGw, lblSave;
	
	/*Button variables*/
	private JButton btnMainMenu, btnMainMenu2, btnScience, btnScience2, btnCalculator, btnCalculator2;
	
	/*Text area and Scroll pane variables*/
	private JTextArea txtArea;
	private JScrollPane scrollPane;
	
	/*Tab pane variable*/
	private JTabbedPane tabbedPane;
	
	/*Text Field variables*/
	private JTextField txtFldName;
	private JTextField txtFldRadius;
	private JTextField txtFldTemperature;
	private JTextField txtFldLuminosity;
	
	/*JSpinner variables*/
	private JSpinner spinner1;
	private JSpinner spinner2;
	
	private JButton btnCalculate;

	/*private JTextField textField;
	private JTextField textField_1;
	private JPanel panel_1;*/
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*--------------------------------------------------------------FRAME PROPERTIES------------------------------------------------------------------------------------------------
*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	
	public CalculatorGUI() {	
		setResizable(false);
		setTitle("The Luminosity Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 250, 550, 600);
		getContentPane().setLayout(new CardLayout(0, 0));
		
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
		getContentPane().add(pnlMain, "name_153744123597777");
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
		
		/*Help Button*/
		lblHelp = new JLabel("");
		lblHelp.addMouseListener(new MouseAdapter() {@Override
			public void mouseClicked(MouseEvent arg0) {
			Help helpFrame = new Help(); helpFrame.setVisible(true);}});
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
				pnlMain.setVisible(false); pnlCalculator.setVisible(true);}});
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
		getContentPane().add(pnlScience, "name_153744133471458");
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
		
		/*Text Area Method*/
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
		
		/*Image Banner Properties*/
		lblImgBanner2 = new JLabel("");
		lblImgBanner2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblImgBanner2.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgBanner2.setIcon(new ImageIcon(CalculatorGUI.class.getResource("/Resources/Images/SpaceImage.jpg")));
		lblImgBanner2.setBounds(0, 454, 550, 102);
		pnlScience.add(lblImgBanner2);
		
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
		getContentPane().add(pnlCalculator, "name_153744141772919");
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
		
		/*Button Properties*/
		btnMainMenu2 = new JButton("Main Menu");
		btnMainMenu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlCalculator.setVisible(false); pnlMain.setVisible(true);}});
		btnMainMenu2.setIcon(new ImageIcon(CalculatorGUI.class.getResource("/Resources/Icons/home.png")));
		btnMainMenu2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnMainMenu2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnMainMenu2.setFont(new Font("Monospaced", Font.PLAIN, 15));
		btnMainMenu2.setAlignmentX(0.5f);
		btnMainMenu2.setBounds(6, 465, 160, 80);
		pnlCalculator.add(btnMainMenu2);
		
		btnScience2 = new JButton("The Science\n");
		btnScience2.setIcon(new ImageIcon(CalculatorGUI.class.getResource("/Resources/Icons/atom.png")));
		btnScience2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){ 
			pnlCalculator.setVisible(false); pnlScience.setVisible(true);}});
		btnScience2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnScience2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnScience2.setFont(new Font("Monospaced", Font.PLAIN, 15));
		btnScience2.setAlignmentX(0.5f);
		btnScience2.setBounds(384, 465, 160, 80);
		pnlCalculator.add(btnScience2);
		
		/*Image Banner Properties*/
		lblImgBanner3 = new JLabel("");
		lblImgBanner3.setIcon(new ImageIcon(CalculatorGUI.class.getResource("/Resources/Images/SpaceImage.jpg")));
		lblImgBanner3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblImgBanner3.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgBanner3.setBounds(0, 454, 550, 102);
		pnlCalculator.add(lblImgBanner3);
		
		/*Tab Panel Properties*/
		tabbedPanels();
		
		
		
		
		
	}
/*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*--------------------------------------------------------------TABBED PANEL PROPERTIES----------------------------------------------------------------------------------------
*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	
	void tabbedPanels(){
		
		/*Tab Panels*/
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Monospaced", Font.PLAIN, 13));
		tabbedPane.setBounds(6, 72, 538, 381);
		pnlCalculator.add(tabbedPane);
		
		/*Luminosity Calculation Panel*/
		pnlLuminosity = new JPanel();
		pnlLuminosity.setAutoscrolls(true);
		tabbedPane.addTab("Luminosity", null, pnlLuminosity, null);
		pnlLuminosity.setLayout(null);
		
		/*Labels and TextFields for Calculation*/
		lblNameofStarGalaxy = new JLabel("Name of Star/Galaxy:");
		lblNameofStarGalaxy.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblNameofStarGalaxy.setForeground(Color.WHITE);
		lblNameofStarGalaxy.setBounds(178, 6, 160, 16);
		pnlLuminosity.add(lblNameofStarGalaxy);
	
		txtFldName = new JTextField();
		txtFldName.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtFldName.setBounds(1, 25, 510, 26);
		pnlLuminosity.add(txtFldName);
		txtFldName.setColumns(10);

		lblRadius = new JLabel("Star/Galaxy Radius:");
		lblRadius.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblRadius.setForeground(Color.WHITE);
		lblRadius.setBounds(6, 65, 152, 16);
		pnlLuminosity.add(lblRadius);
		
		txtFldRadius = new JTextField();
		txtFldRadius.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtFldRadius.setBounds(1, 80, 375, 26);
		pnlLuminosity.add(txtFldRadius);
		txtFldRadius.setColumns(10);
		
		lblPower1 = new JLabel("x10^");
		lblPower1.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblPower1.setForeground(Color.WHITE);
		lblPower1.setBounds(375, 85, 35, 16);
		pnlLuminosity.add(lblPower1);
		
		spinner1 = new JSpinner();
		spinner1.setFont(new Font("Monospaced", Font.PLAIN, 13));
		spinner1.setBounds(409, 80, 50, 26);
		pnlLuminosity.add(spinner1);
		
		lblUnits1 = new JLabel("Km");
		lblUnits1.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblUnits1.setForeground(Color.WHITE);
		lblUnits1.setBounds(461, 85, 35, 16);
		pnlLuminosity.add(lblUnits1);
		
		lblTemperature = new JLabel("Star/Galaxy Surface Temperature:");
		lblTemperature.setVerticalAlignment(SwingConstants.TOP);
		lblTemperature.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblTemperature.setForeground(Color.WHITE);
		lblTemperature.setBounds(6, 117, 256, 16);
		pnlLuminosity.add(lblTemperature);
		
		txtFldTemperature = new JTextField();
		txtFldTemperature.setFont(new Font("Monospaced", Font.PLAIN, 13));
		txtFldTemperature.setBounds(1, 134, 375, 26);
		pnlLuminosity.add(txtFldTemperature);
		txtFldTemperature.setColumns(10);
		
		lblPower2 = new JLabel("x10^");
		lblPower2.setForeground(Color.WHITE);
		lblPower2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblPower2.setBounds(375, 139, 35, 16);
		pnlLuminosity.add(lblPower2);
		
		spinner2 = new JSpinner();
		spinner2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		spinner2.setBounds(409, 134, 50, 26);
		pnlLuminosity.add(spinner2);
		
		lblUnits2 = new JLabel("K");
		lblUnits2.setForeground(Color.WHITE);
		lblUnits2.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblUnits2.setBounds(461, 139, 35, 16);
		pnlLuminosity.add(lblUnits2);
		
		lblLuminosity = new JLabel();
		lblLuminosity.setHorizontalAlignment(SwingConstants.CENTER);
		lblLuminosity.setFont(new Font("Monospaced", Font.PLAIN, 15));
		lblLuminosity.setForeground(Color.WHITE);
		lblLuminosity.setBounds(6, 238, 505, 16);
		pnlLuminosity.add(lblLuminosity);
		
		/*txtFldLuminosity = new JTextField();
		txtFldLuminosity.setEditable(false);
		txtFldLuminosity.setBounds(1, 259, 453, 26);
		pnlLuminosity.add(txtFldLuminosity);
		txtFldLuminosity.setColumns(10);
		
		lblGw = new JLabel("GWatts");
		lblGw.setForeground(Color.WHITE);
		lblGw.setFont(new Font("Monospaced", Font.PLAIN, 13));
		lblGw.setBounds(456, 264, 50, 16);
		pnlLuminosity.add(lblGw);
		
		lblSave = new JLabel("");
		lblSave.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblSave.setIcon(new ImageIcon(CalculatorGUI.class.getResource("/Resources/Icons/SaveBtn.png")));
		lblSave.setBounds(242, 297, 32, 32);
		pnlLuminosity.add(lblSave);
		
		"Star/Galaxy Luminosity is:"*/
		
		btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double radius, r, temperature, t, LuminosityAns;
				int v1, v2;
				String name, ans;
				DecimalFormat decimal = new DecimalFormat("#,##0.0000000000000000");
				
				name= txtFldName.getText();
				r=Double.parseDouble(txtFldRadius.getText());
				v1= (Integer) spinner1.getValue();
				t=Double.parseDouble(txtFldTemperature.getText());
				v2= (Integer) spinner2.getValue();
				
				radius = r * (Math.pow(10, v1));
				temperature = t * (Math.pow(10, v2)); 
				
				LuminosityAns = radius * temperature;
				
				//ans = String.format("%.0f", LuminosityAns);
				ans = decimal.format(LuminosityAns);
				
				
				lblLuminosity.setText(name + "'s Luminosity is: " + ans + " GWatts");
				
				
				
				
			}
		});
		btnCalculate.setBounds(200, 172, 117, 29);
		pnlLuminosity.add(btnCalculate);
		
		
		
		
		
		
		lblImgTabWallpaper1 = new JLabel("");
		lblImgTabWallpaper1.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgTabWallpaper1.setIcon(new ImageIcon(CalculatorGUI.class.getResource("/Resources/Images/SpaceImage2.jpg")));
		lblImgTabWallpaper1.setBounds(0, 0, 517, 335);
		pnlLuminosity.add(lblImgTabWallpaper1);
		/*Luminosity Tab Panel Wallpaper*/

		/*Area Calculation Panel*/
		pnlArea = new JPanel();
		tabbedPane.addTab("Area", null, pnlArea, null);
	}	
	
	/*JSpinner spinner = new JSpinner();
	spinner.setBounds(418, 192, 61, 25);
	pnlCalculator.add(spinner);
	
	textField = new JTextField();
	textField.setBounds(228, 192, 130, 26);
	pnlCalculator.add(textField);
	textField.setColumns(10);
	
	JButton btnNewButton = new JButton("New button");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			double v1, ans;
			Integer v2 = (Integer) spinner.getValue();

			v1 = Double.parseDouble(textField.getText());
			
			ans = v1*v2;
			textField_1.setText(Double.toString(ans));
			
			
		}
	});
	btnNewButton.setBounds(309, 261, 117, 29);
	pnlCalculator.add(btnNewButton);
	
	textField_1 = new JTextField();
	textField_1.setBounds(244, 317, 130, 26);
	pnlCalculator.add(textField_1);
	textField_1.setColumns(10);*/
	
	
	
	
	
	
	
	
	
	
	
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
 * -The Image used for the ImgBanner, ImgBanner2, ImgBanner3 and ImgTabWallpaper1 label was from http://getwallpapers.com/collection/space-wallpapers-1920x1080
 * 
 * -The Icon used for the mntmMinimize was made by Gregor Cresnar from http://www.flaticons.com
 * -The Icon used for the mntmClose was made by Smashicons from http://www.flaticons.com
 * -The Icon used for btnScience and btnScience2 button was made by Freepik from http://www.flaticons.com 
 * -The Icon used for btnCalculator and btnCalculator2 button was made by Smashicons from http://www.flaticons.com
 * -The Icon used for btnMainMenu and btnMainMenu2 was made by Freepik from http://www.flaticons.com  
 * 
 * 
 * */
