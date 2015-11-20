package OODesign.GUI.windows;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import OODesign.logic.ClassList;
import OODesign.logic.JavaClass;

public class DeleteWindow extends JFrame {

	JPanel upperPanel;
	JTextField deleteClass;
	JButton confirmButton;
	
	JPanel middlePanel;
	JLabel resultPrompt;
	JLabel theClassresult;
	JLabel compositionResult;
	
	JPanel lowerPanel;
	JButton OKButton;
	JButton closeButton;
	
	JavaClass theClass;
	
	public DeleteWindow(){
		super("delete a class");
		this.setSize(400, 300);
		this.setVisible(true);
		this.setLocation(100, 100);
		this.setLayout(new GridLayout(3, 1));
//set upper panel
		upperPanel = new JPanel();
		deleteClass = new JTextField("please input the name of the class");
		deleteClass.setEditable(true);
		upperPanel.add(deleteClass);
		confirmButton = new JButton("confirm");
		confirmButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String theClassName = deleteClass.getText();			
				deleteClass.setEditable(false);
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
					deleteClass.setEditable(true);
					new ClassNotFoundWindow();
				}
				theClassresult.setText(theClass.getName());
				String deleteCom = theClass.getDeleteCompositionSting();
				compositionResult.setText("its composite class: "+deleteCom);
			}			
		});
		
		upperPanel.add(confirmButton);
		this.add(upperPanel);
		
		middlePanel = new JPanel();
		middlePanel.setLayout(new GridLayout(3,1));
		resultPrompt = new JLabel("the class to be deleted:");
		theClassresult = new JLabel();
		compositionResult = new JLabel();
		middlePanel.add(resultPrompt);
		middlePanel.add(theClassresult);
		middlePanel.add(compositionResult);
		this.add(middlePanel);
		
		lowerPanel = new JPanel();
		OKButton = new JButton("delete!");
		OKButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {				
				theClass.delete();
				dispose();
			}
		});
		closeButton = new JButton("cancel");
		closeButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
			}
		});
		lowerPanel.add(OKButton);
		lowerPanel.add(closeButton);
		this.add(lowerPanel);
		
		
	}

}
