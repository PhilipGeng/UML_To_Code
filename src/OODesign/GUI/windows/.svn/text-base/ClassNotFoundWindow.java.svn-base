package OODesign.GUI.windows;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClassNotFoundWindow extends JFrame {

	/**
	 * @param args
	 */
	JPanel panel1;
	JButton confirm;
	JLabel Label;
	JPanel panel2;

	public ClassNotFoundWindow(){
		super("Class Not Found");
		this.setSize(400, 100);
		this.setVisible(true);
		this.setLocation(100, 100);
		this.setLayout(new GridLayout(2,1));
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		Label = new JLabel("Class not found, please input carefully");
		confirm = new JButton("OK,input it again");
		panel1.add(Label);
		panel2.add(confirm);
		this.add(panel1);
		this.add(panel2);
		confirm.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
			
		});
		
	}

}
