package OODesign.GUI.relation.aggregation;

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
public class AggregationArrowPanel extends GraphPanel {
	/**
	 * this method paint the arrow panel.
	 */
	protected void paintComponent(Graphics g){
		super.paintComponents(g);
		int [] x = {10,0,10,20};
		int [] y = {0,10,20,10};
		g.drawPolygon(x, y, 4);
		g.drawLine(20,10,50,10);
		
	}
}
