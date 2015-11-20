package OODesign.GUI.relation.extend;

import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import OODesign.GUI.component.GraphPanel;
import OODesign.GUI.component.MiddlePanel;
/**
 * this is an arrow panel which can be dragged in the middle panel
 * @see MiddlePanel
 * this panel extends the abstract class GraphPanel
 * @see GraphPanel
 * @author ZHANG Beibei
 *
 */
public class ExtendArrowPanel extends GraphPanel {
	/**
	 * this method paint the arrow panel.
	 */
	protected void paintComponent(Graphics g){
		super.paintComponents(g);
		g.drawLine(10,0,0,10);
		g.drawLine(0,10,20,10);
		g.drawLine(20,10,10,0);
		g.drawLine(10,10,10,50);
		
	}
}
