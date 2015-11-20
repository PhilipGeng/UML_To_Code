
import javax.swing.JFrame;

import OODesign.GUI.component.MainPanel;
import OODesign.GUI.windows.MainWindow;
/**
 * This program is used to generate a GUI to present is-a relation
 * This program demonstrate the interface
 * This is the main program part 
 * @see MainWindow
 * @author ZHANG Beibei
 * @version 8.0
 */
public class Main{
	public static final long serialVersionUID=138938123;
	/**
	 * this is a main program which set up and collect the GUI part and logic part together
	 * @param args
	 */
	public static void main(String[] args){
		MainWindow f=new MainWindow(900,600,100,100,"Test");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ùرհ�ť
		MainPanel p=new MainPanel(f);
		p.setLeftPanel();
		p.setPanel();
		f.add(p.getP3());
		f.setVisible(true);
	}

}
