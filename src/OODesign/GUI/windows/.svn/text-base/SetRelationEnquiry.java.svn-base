package OODesign.GUI.windows;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import OODesign.GUI.relation.aggregation.SetAggregation;
import OODesign.GUI.relation.composition.SetComposition;
import OODesign.GUI.relation.extend.SetExtend;
import OODesign.GUI.relation.implement.SetImplement;

public class SetRelationEnquiry extends JFrame {
	JPanel promptPanel;
	JPanel setPanel1;
	JPanel setPanel2;
	JPanel disposePanel;
	JButton disposeButton;
	JLabel prompt;
	JButton extendButton;
	JButton implementButton;
	JButton aggregationButton;
	JButton congressionButton;
	public SetRelationEnquiry(){
		super("set relationship?");
		this.setSize(400, 300);
		this.setVisible(true);
		this.setLocation(100, 100);
		this.setLayout(new GridLayout(4, 1));
		
		promptPanel = new JPanel();
		prompt = new JLabel("Please select a relationship to set or dispose");
		promptPanel.add(prompt);
		this.add(promptPanel);
		
		setPanel1 = new JPanel();
		extendButton = new JButton("extend");
		implementButton = new JButton("implement");
		setPanel1.add(extendButton);
		setPanel1.add(implementButton);
		extendButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new SetExtend();
			}
			
		});
		implementButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new SetImplement();
			}
			
		});
		this.add(setPanel1);
		
		setPanel2 = new JPanel();
		aggregationButton = new JButton("aggregation");
		congressionButton = new JButton("composition");
		aggregationButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new SetAggregation();
			}
			
		});
		congressionButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new SetComposition();
			}
			
		});
		setPanel2.add(aggregationButton);
		setPanel2.add(congressionButton);
		this.add(setPanel2);
		
		disposePanel = new JPanel();
		disposeButton = new JButton("I don't want to set");
		disposePanel.add(disposeButton);
		this.add(disposePanel);
		disposeButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
			
		});
	}
}
