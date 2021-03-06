package OODesign.GUI.component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import OODesign.GUI.windows.SubWindow;
/**
 * this program set the button
 * the button have the function of pop up the subWindow
 * @see SubWindow
 * @author ZHANG Beibei
 * @version 8.0
 */
public class ClassButton implements ButtonInterface{
	private SubWindow text1;
	private JPanel panel0;
	private JPanel panel2;
	public JButton button;
	private JFrame frame;
	private TextArea textArea;
	private String type;
	/**
	 *  this constructor receive and set the panel 
	 * these panels are used to deposit the graph panel and text area
	 * @param panel2
	 * @param panel0
	 * @param frame
	 * @param type
	 */

	public ClassButton(JPanel panel2, JPanel panel0,JFrame frame,String type){
		this.panel2=panel2;
		this.panel0=panel0;
		this.frame=frame;
		this.type=type;
	}
	/**
	 * this method set the button
	 */
	
	public void setButton(){
			button=new JButton(type);
			button.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JButton b=(JButton)e.getSource();
							text1=new SubWindow(panel2,panel0,frame,type);
							text1.setTextFrame();
					}
				});
	}
	/**
	 * this class return the button
	 * @return button
	 */
	
	public JButton getButton(){
		return button;
	}
	
}