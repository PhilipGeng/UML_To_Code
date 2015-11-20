package OODesign.GUI.relation.implement;

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

public class SetImplement extends JFrame{


		/**
		 * @param args
		 */
		JavaClass theClass;
		JavaClass theInterface;
		String implementResult;
		
		JPanel promptPanel;
		JLabel promptLabel;
		
		JPanel theClassPanel;
		JTextField settheClassTextField;
		JButton theClassConfirmButton;
		
		JPanel theInterfacePanel;
		JTextField settheInterfaceTextField;
		JButton theInterfaceConfirmButton;
		
		JPanel resultPanel;
		JLabel resultLabel;
		
		JPanel confirmPanel;
		JButton confirmButton;
		JButton disposeButton;
		
		public SetImplement(){
			super("set implement");
			this.setSize(400, 300);
			this.setVisible(true);
			this.setLocation(100, 100);
			this.setLayout(new GridLayout(5, 1));
			
			promptPanel = new JPanel();
			promptLabel = new JLabel("set the class implements interface");
			promptPanel.add(promptLabel);
			this.add(promptPanel);
			
			theClassPanel = new JPanel();
			settheClassTextField = new JTextField("please input class name here");
			theClassConfirmButton = new JButton("class confirm");
			theClassPanel.add(settheClassTextField);
			theClassPanel.add(theClassConfirmButton);
			this.add(theClassPanel);
		    theClassConfirmButton.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String theClassName = settheClassTextField.getText();			
					settheClassTextField.setEditable(false);
					boolean findInClassList = false;
					JavaClass[] classArray = ClassList.getClassListArray();
					for(int i = 0;i< classArray.length;i++){
						if(theClassName.equalsIgnoreCase(classArray[i].getName())){
							theClass = classArray[i];
							findInClassList = true;
							break;
						}
					}
					
					if(findInClassList == false){
						settheClassTextField.setEditable(true);
						new ClassNotFoundWindow();
					}
				}
			});
		

			theInterfacePanel = new JPanel();
			settheInterfaceTextField = new JTextField("please input interface name here");
			theInterfaceConfirmButton = new JButton("interfacce confirm");
			theInterfacePanel.add(settheInterfaceTextField);
			theInterfacePanel.add(theInterfaceConfirmButton);
			this.add(theInterfacePanel);
			theInterfaceConfirmButton.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String theInterfaceName = settheInterfaceTextField.getText();			
					settheInterfaceTextField.setEditable(false);
					boolean findInClassList = false;
					JavaClass[] classArray = ClassList.getClassListArray();
					for(int i = 0;i< classArray.length;i++){
						if(theInterfaceName.equalsIgnoreCase(classArray[i].getName())){
							theInterface = classArray[i];
							findInClassList = true;
							break;
						}
					}
					
					if(findInClassList == false){
						settheInterfaceTextField.setEditable(true);
						new ClassNotFoundWindow();
					}
					implementResult = theClass.getName()+" implements "+theInterface.getName();
					resultLabel.setText(implementResult);
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
					theClass.setImplementation(theInterface);
					theClass.getClassTextArea().getTextArea().setText(theClass.generate());
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


