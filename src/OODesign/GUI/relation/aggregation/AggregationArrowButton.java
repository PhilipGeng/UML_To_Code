package OODesign.GUI.relation.aggregation;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import OODesign.GUI.component.ButtonInterface;
import OODesign.GUI.component.MiddlePanel;
import OODesign.GUI.component.TextArea;
/**
 * this is a class that generate an arrow button which inplements ButtonInterface
 * @see ButtonInterface
 * @author ZHANG Beibei
 *
 */

public class AggregationArrowButton implements ButtonInterface{
	private JButton button;
	private JPanel panel0;
	private JFrame frame;
	private TextArea textArea1;
	/**
	 * this is the constructor of class ArrowButton
	 * which defines the setting location of arrow button
	 * @param panel0
	 * @param frame
	 */
	
	public AggregationArrowButton(JPanel panel0,JFrame frame){
		this.panel0=panel0;
		this.frame=frame;
	}
	/**
	 * this method set up the arrow Button
	 */
	
	public void setButton(){
		button=new JButton("Aggregation arrow");
		button.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JButton b=(JButton)e.getSource();
						MiddlePanel drag=new MiddlePanel(textArea1,panel0,frame,"aggregationarrow"); 
						frame.setVisible(true);
					}
				});
	}
	/**
	 * this method return the button
	 * @return button
	 */
	
	public JButton getButton(){
		return button;
	}
	

}
