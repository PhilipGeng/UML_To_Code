package OODesign.GUI.relation.composition;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import OODesign.GUI.windows.ClassNotFoundWindow;
import OODesign.logic.ClassList;
import OODesign.logic.JavaClass;

public class SetComposition extends JFrame {
	JavaClass classA;
	JavaClass classB;
	String comResult;
	
	JPanel promptPanel;
	JLabel promptLabel;
	
	JPanel classAPanel;
	JTextField setclassATextField;
	JButton classAConfirmButton;
	
	JPanel classBPanel;
	JTextField setclassBTextField;
	JButton classBConfirmButton;
	
	JPanel resultPanel;
	JLabel resultLabel;
	
	JPanel confirmPanel;
	JButton confirmButton;
	JButton disposeButton;
	public SetComposition(){
		super("set Composition");
		this.setSize(400, 300);
		this.setVisible(true);
		this.setLocation(100, 100);
		this.setLayout(new GridLayout(5, 1));
		
		promptPanel = new JPanel();
		promptLabel = new JLabel("set Class A has a Class B (composition)");
		promptPanel.add(promptLabel);
		this.add(promptPanel);
		
		classAPanel = new JPanel();
		setclassATextField = new JTextField("please input class A name here");
		classAConfirmButton = new JButton("class A confirm");
		classAPanel.add(setclassATextField);
		classAPanel.add(classAConfirmButton);
		this.add(classAPanel);
		classAConfirmButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String classAName = setclassATextField.getText();			
				setclassATextField.setEditable(false);
				boolean findInClassList = false;
				JavaClass[] classArray = ClassList.getClassListArray();
				for(int i = 0;i< classArray.length;i++){
					if(classAName.equalsIgnoreCase(classArray[i].getName())){
						classA = classArray[i];
						findInClassList = true;
						break;
					}
				}
				
				if(findInClassList == false){
					setclassATextField.setEditable(true);
					new ClassNotFoundWindow();
				}
			}
		});
	

		classBPanel = new JPanel();
		setclassBTextField = new JTextField("please input Class B name here");
		classBConfirmButton = new JButton("superclass confirm");
		classBPanel.add(setclassBTextField);
		classBPanel.add(classBConfirmButton);
		this.add(classBPanel);
		classBConfirmButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String classBName = setclassBTextField.getText();			
				setclassBTextField.setEditable(false);
				boolean findInClassList = false;
				JavaClass[] classArray = ClassList.getClassListArray();
				for(int i = 0;i< classArray.length;i++){
					if(classBName.equalsIgnoreCase(classArray[i].getName())){
						classB = classArray[i];
						findInClassList = true;
						break;
					}
				}
				
				if(findInClassList == false){
					setclassBTextField.setEditable(true);
					new ClassNotFoundWindow();
				}
				comResult = classA.getName()+" has a "+classB.getName();
				resultLabel.setText(comResult);
			}		
		});
	
		
		resultPanel = new JPanel();
		resultLabel = new JLabel();
		resultPanel.add(resultLabel);
		this.add(resultPanel);
		
		confirmPanel = new JPanel();
		confirmButton = new JButton("confirm");
		disposeButton = new JButton("close");
		confirmPanel.add(confirmButton);
		confirmPanel.add(disposeButton);
		this.add(confirmPanel);
		confirmButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				classA.setComposition(classB);
				dispose();
			}
			
		});
		disposeButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
			
		});
	}

}
