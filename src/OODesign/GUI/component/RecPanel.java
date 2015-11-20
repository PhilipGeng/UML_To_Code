package OODesign.GUI.component;

import java.awt.Graphics;

/**
 * 
 * @author ZHANG Beibei
 *
 */
public class RecPanel extends GraphPanel{
	private String str;
	/**
	 * this constructor set the string in the rectangle panel
	 * @param str
	 */
	protected RecPanel(String str){
		this.str=str;
	}
	/**
	 * this method draw the class graph
	 */
	protected void paintComponent(Graphics g){
		super.paintComponents(g);
		g.drawRect(0, 0, 70, 50);
		g.drawLine(0,20, 70, 20);
		g.drawString(str,15,15);
	}

}
