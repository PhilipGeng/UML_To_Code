package OODesign.GUI.component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.event.MouseInputListener;

import OODesign.GUI.relation.aggregation.AggregationArrowPanel;
import OODesign.GUI.relation.composition.CompositionArrowPanel;
import OODesign.GUI.relation.extend.ExtendArrowPanel;
import OODesign.GUI.relation.implement.ImplementArrowPanel;
import OODesign.GUI.windows.SetRelationEnquiry;
/**
 * this is a class defines the dragged graphic panel on the middle panel
 * @see GraphPanel
 * @see MiddlePanel
 * @author ZHANG Beibei
 *
 */
public class MiddlePanel{
	JPanel panel0;
	GraphPanel panel;
	JFrame frame;
	TextArea textArea1;
	String type;
	/**
	 * initial the parameter
	 * @param textArea1
	 * @param panel0
	 * @param frame
	 * @param s1
	 */

	public MiddlePanel(TextArea textArea1,JPanel panel0, JFrame frame,String s1) {
		this.textArea1=textArea1;
		type = s1;
		if(s1.equals("class"))
			panel=new RecPanel(textArea1.getTextArea().getText());
		else
			if(s1.equals("implementarrow"))
				panel=new ImplementArrowPanel();
			else
				if(s1.equals("extendarrow"))
					panel = new ExtendArrowPanel();
				else
					if(s1.equals("compositionarrow"))
						panel = new CompositionArrowPanel();
					else
						if(s1.equals("aggregationarrow"))
							panel = new AggregationArrowPanel();
		
		this.panel0=panel0;
		panel0.setSize(900, 600);
		panel0.setLayout(null);
		panel0.add(panel);
		

		panel.setBounds((int) (Math.random()*400), (int) (Math.random()*400), 100, 100);
		panel0.setVisible(true);

		Drag drag = new Drag();
		panel0.addMouseListener(drag);
		panel0.addMouseMotionListener(drag);
		
		this.frame=frame;

	}
	/**
	 * set the location of moving panel
	 * @author ZHANG Beibei
	 *
	 */

	class Drag implements MouseInputListener {
		int moving = 0; // Display whether the panel is moving or not. If pressed call the press method
		int xinit = 0; // the X coordinate of mouse
		int yinit = 0; // the Y coordinate of mouse
		int x0 = 0; // the coordinate of mouse when dragging
		int y0 = 0;
		Timer timer;

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		//the initial thread when mouse is pressed 
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			xinit = e.getX();
			yinit = e.getY();
			timer = new Timer(10, new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				}
			});
		}

		// when the drag is over terminate the thread
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			if (moving == 1) {
				int x1 = e.getX();
				int y1 = e.getY();
				panel.setBounds(x1 - xinit + panel.getX(), y1 - yinit
						+ panel.getY(), 100, 100);
				moving = 0;
				panel.setVisible(true);
				timer.stop();
				if(!type.equals("class"))
					new SetRelationEnquiry();
			}
		}

		// when dragging, change the panel location continuously
		@Override
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			x0 = arg0.getX();
			y0 = arg0.getY();
			if (x0 > panel.getX() && x0 < (panel.getX() + panel.getWidth())
					&& y0 > panel.getY()
					&& y0 < (panel.getY() + panel.getHeight())) {
				moving = 1;
				panel.setVisible(false);
				timer.start();
			}

		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

	}
	public void delete(){
		this.panel.setVisible(false);
	}

}

