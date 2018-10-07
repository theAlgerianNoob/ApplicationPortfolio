package LuminosityCalculatorApp;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Toolkit;
import java.awt.Component;

public class Help extends JFrame {
	
	/*Panel variables*/
	private JTabbedPane tabbedPane;
	private JPanel pnlMenuGuide, pnlScienceGuide, pnlCalculatorGuide;
	
	/*Text Area variables*/
	private JTextArea txtMenuGuide, txtScienceGuide, txtCalculatorGuide;
	private JScrollPane scrollPane, scrollPane2, scrollPane3;
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*--------------------------------------------------------------FRAME PROPERTIES------------------------------------------------------------------------------------------------
*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	
	public Help(){
		setResizable(false);
		setTitle("Help");
		setBounds(600, 250, 551, 257);
		getContentPane().setLayout(null);
		
		TabbedPanels();
		TextAreas();
		
	}
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*--------------------------------------------------------------PANEL PROPERTIES------------------------------------------------------------------------------------------------
*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
	
	void TabbedPanels(){
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 551, 235);
		getContentPane().add(tabbedPane);
		
		pnlMenuGuide = new JPanel();
		tabbedPane.addTab("Main Menu", null, pnlMenuGuide, null);
		pnlMenuGuide.setLayout(null);
		
		pnlScienceGuide = new JPanel();
		tabbedPane.addTab("The Science", null, pnlScienceGuide, null);
		pnlScienceGuide.setLayout(null);
		
		pnlCalculatorGuide = new JPanel();
		tabbedPane.addTab("The Calculator", null, pnlCalculatorGuide, null);
		pnlCalculatorGuide.setLayout(null);
	}

/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*--------------------------------------------------------------TEXT AREA PROPERTIES--------------------------------------------------------------------------------------------
*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

	void TextAreas(){
		/*Text Area for Main Menu Guide*/
		txtMenuGuide = new JTextArea();
		txtMenuGuide.setLineWrap(true);
		txtMenuGuide.setEditable(false);
		txtMenuGuide.setText("dsa\nad\nDS\nDSA\nDAS\nd\nda\ndsa\nads\nda\nd\ndas\nd\ndad\nads\nd\ndas\nd\nD\nDA\nAD\nADSda\ndas\ndas\nda\nda\nad\nda\nad\nad");
		
		scrollPane = new JScrollPane(txtMenuGuide);
		scrollPane.setBounds(6, 6, 518, 177);
		pnlMenuGuide.add(scrollPane);
		
		/*Text Area for Science Guide*/
		txtScienceGuide = new JTextArea();
		txtScienceGuide.setLineWrap(true);
		txtScienceGuide.setEditable(false);
		txtScienceGuide.setText("dsa\nad\nDS\nDSA\nDAS\nd\nda\ndsa\nads\nda\nd\ndas\nd\ndad\nads\nd\ndas\nd\nD\nDA\nAD\nADSda\ndas\ndas\nda\nda\nad\nda\nad\nad");
		
		scrollPane2 = new JScrollPane(txtScienceGuide);
		scrollPane2.setBounds(6, 6, 518, 177);
		pnlScienceGuide.add(scrollPane2);
		
		/*Text Area for Calculator Guide*/
		txtCalculatorGuide = new JTextArea();
		txtCalculatorGuide.setLineWrap(true);
		txtCalculatorGuide.setEditable(false);
		txtCalculatorGuide.setText("dsa\nad\nDS\nDSA\nDAS\nd\nda\ndsa\nads\nda\nd\ndas\nd\ndad\nads\nd\ndas\nd\nD\nDA\nAD\nADSda\ndas\ndas\nda\nda\nad\nda\nad\nad");
		
		scrollPane3 = new JScrollPane(txtCalculatorGuide);
		scrollPane3.setBounds(6, 6, 518, 177);
		pnlCalculatorGuide.add(scrollPane3);	
	}
	
/*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*--------------------------------------------------------------------------MAIN------------------------------------------------------------------------------------------------
*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

	public static void main(String[] args) {
		Help helpFrame = new Help();
		helpFrame.setVisible(true);

	}
}//Final Closing Bracket
