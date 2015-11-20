package OODesign.GUI.component;


import java.awt.Graphics;

import javax.swing.JPanel;

import OODesign.GUI.relation.implement.ImplementArrowPanel;
/**
 * this is an abstract class of graphic panels
 * @see ImplementArrowPanel
 * @see RecPanel
 * @author ZHANG Beibei
 *
 */
abstract public class GraphPanel extends JPanel{
	abstract protected void paintComponent(Graphics g);
}
