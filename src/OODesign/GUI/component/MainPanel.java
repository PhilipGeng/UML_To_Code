package OODesign.GUI.component;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import OODesign.GUI.relation.aggregation.AggregationArrowButton;
import OODesign.GUI.relation.composition.CompositionArrowButton;
import OODesign.GUI.relation.extend.ExtendArrowButton;
import OODesign.GUI.relation.implement.ImplementArrowButton;
import OODesign.GUI.windows.DeleteWindow;
/**
 * this program is used for set up panels that is deposited on the main MyFrame
 * {@link Main}
 * @author ZHANG Beibei
 * @version 8.0
 */

public class MainPanel extends JPanel{
	public static final long serialVersionUID=138938121; 
	private JPanel panel0;
	private JPanel panel1;
	private static JPanel panel2;
	private JPanel panel3;
	private JFrame frame;
	
	/**
	 * this constructor is used for initialize 4 panels that is deposited
	 * on the main MyFrame
	 * @param frame
	 */
	
	public MainPanel(JFrame frame){
		panel0=new JPanel();
		panel1=new JPanel(new GridLayout(7,1));
		panel2=new JPanel(new GridLayout(4,1));
		panel3=new JPanel(new BorderLayout());
		this.frame=frame;
		
	}
	
	/**
	 * this method put the button on the panel1
	 * @see ButtonInterface
	 */
	
	public void setLeftPanel(){
		ClassButton cb1=new ClassButton(panel2,panel0,frame,"class");
		cb1.setButton();
		ClassButton cb2=new ClassButton(panel2,panel0,frame,"interface");
		cb2.setButton();
		ImplementArrowButton iab =new ImplementArrowButton(panel0,frame);
		iab.setButton();
		ExtendArrowButton eab = new ExtendArrowButton(panel0,frame);
		eab.setButton();
		AggregationArrowButton aab = new AggregationArrowButton(panel0,frame);
		aab.setButton();
		CompositionArrowButton cab = new CompositionArrowButton(panel0,frame);
		cab.setButton();
		JButton deleteButton = new JButton("delete");
		deleteButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new DeleteWindow();
			}
			
		});
		panel1.add(cb1.getButton());
		panel1.add(iab.getButton());
		panel1.add(eab.getButton());
		panel1.add(aab.getButton());
		panel1.add(cab.getButton());
		panel1.add(cb2.getButton());
		panel1.add(deleteButton);
		panel1.setVisible(true);
	}
	
	/**
	 * this method put three panel that contains the GUI onto
	 * one big panel
	 */
	
	public void setPanel(){
		putMyPanel(panel0, "CENTER");
		putMyPanel(panel1, "WEST");
		putMyPanel(panel2,"EAST");
	}
	
	/**
	 * this method determine the location to put the panel
	 */
	
	public void putMyPanel(JPanel panel, String location){		
		if(location.equals("WEST"))
			panel3.add(panel,BorderLayout.WEST);
		else if(location.equals("CENTER"))
			panel3.add(panel,BorderLayout.CENTER);
		else if(location.equals("EAST"))
			panel3.add(panel,BorderLayout.EAST);
	}
	/**
	 * this accessor return the panel0
	 * panel0 is used to deposit the graphic panel
	 * @see GraphPanel
	 * @return panel0
	 */
	public JPanel getP0(){
		return panel0;
	}
	/**
	 * this accessor return the panel1
	 * panel1 is used to deposit the button
	 * @see ButtonInterface
	 * @return panel1
	 */
	
	public JPanel getP1(){
		return panel1;
	}
	/**
	 * this accessor return the panel2
	 * panel2 is used to deposit the text area
	 * @see TextArea
	 * @return panel2
	 */
	
	public static JPanel getP2(){
		return panel2;
	}
	/**
	 * this accessor return the panel3
	 * panel3 is used to deposit the all other three panels
	 * @return panel3
	 */
		
	public JPanel getP3(){
		return panel3;
	}
		
}

