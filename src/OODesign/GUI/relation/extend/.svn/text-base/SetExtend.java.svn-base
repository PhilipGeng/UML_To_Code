package OODesign.GUI.relation.extend;

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

public class SetExtend extends JFrame {

	/**
	 * @param args
	 */
	JavaClass superClass;
	JavaClass subClass;
	String extendResult;
	
	JPanel promptPanel;
	JLabel promptLabel;
	
	JPanel subClassPanel;
	JTextField setSubClassTextField;
	JButton subClassConfirmButton;
	
	JPanel superClassPanel;
	JTextField setSuperClassTextField;
	JButton superClassConfirmButton;
	
	JPanel resultPanel;
	JLabel resultLabel;
	
	JPanel confirmPanel;
	JButton confirmButton;
	JButton disposeButton;
	public SetExtend(){
		super("set extend");
		this.setSize(400, 300);
		this.setVisible(true);
		this.setLocation(100, 100);
		this.setLayout(new GridLayout(5, 1));
		
		promptPanel = new JPanel();
		promptLabel = new JLabel("set subclass extends superclass");
		promptPanel.add(promptLabel);
		this.add(promptPanel);
		
		subClassPanel = new JPanel();
		setSubClassTextField = new JTextField("please input sub-class name here");
		subClassConfirmButton = new JButton("subclass confirm");
		subClassPanel.add(setSubClassTextField);
		subClassPanel.add(subClassConfirmButton);
		this.add(subClassPanel);
		subClassConfirmButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String subClassName = setSubClassTextField.getText();			
				setSubClassTextField.setEditable(false);
				boolean findInClassList = false;
				JavaClass[] classArray = ClassList.getClassListArray();
				for(int i = 0;i< classArray.length;i++){
					if(subClassName.equalsIgnoreCase(classArray[i].getName())){
						subClass = classArray[i];
						findInClassList = true;
						break;
					}
				}
				
				if(findInClassList == false){
					setSubClassTextField.setEditable(true);
					new ClassNotFoundWindow();
				}
			}
		});
	

		superClassPanel = new JPanel();
		setSuperClassTextField = new JTextField("please input super-class name here");
		superClassConfirmButton = new JButton("superclass confirm");
		superClassPanel.add(setSuperClassTextField);
		superClassPanel.add(superClassConfirmButton);
		this.add(superClassPanel);
		superClassConfirmButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String superClassName = setSuperClassTextField.getText();			
				setSuperClassTextField.setEditable(false);
				boolean findInClassList = false;
				JavaClass[] classArray = ClassList.getClassListArray();
				for(int i = 0;i< classArray.length;i++){
					if(superClassName.equalsIgnoreCase(classArray[i].getName())){
						superClass = classArray[i];
						findInClassList = true;
						break;
					}
				}
				
				if(findInClassList == false){
					setSuperClassTextField.setEditable(true);
					new ClassNotFoundWindow();
				}
				extendResult = subClass.getName()+" extends "+superClass.getName();
				resultLabel.setText(extendResult);
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
				subClass.setInheritance(superClass);
				subClass.getClassTextArea().getTextArea().setText(subClass.generate());
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
