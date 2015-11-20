package OODesign.GUI.windows;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import OODesign.GUI.component.MiddlePanel;
import OODesign.GUI.component.TextArea;
import OODesign.logic.ClassList;
import OODesign.logic.JavaAttribute;
import OODesign.logic.JavaClass;
import OODesign.logic.JavaFile;
import OODesign.logic.JavaMethod;

/**
 * this program defines the pop up Text field
 * 
 * @author ZHANG Beibei
 * @version 8.0
 */
public class SubWindow extends JFrame{
	public static final long serialVersionUID = 138938131;
	private TextArea textArea1;
	private TextArea textArea2;
	private TextArea textArea3;
	private JScrollPane scrollPanel1;
	private JScrollPane scrollPanel2;
	private JScrollPane scrollPanel3;
	private JPanel panel2;
	private JPanel panel0;
	private JFrame frame;
	private String str1="";
	private String str2="";
	private String type;
	private String cmf;
	private String cnm;
	private JavaAttribute classAttribute;
	private JavaMethod classMethod;

	/**
	 * this constructor receive the panels and frame
	 * @param panel2
	 * @param panel0
	 * @param frame
	 * @param type
	 */

	public SubWindow(JPanel panel2, JPanel panel0, JFrame frame,String type) {
		this.panel2 = panel2;
		this.frame = frame;
		this.panel0=panel0;
		this.type=type;
	}

	/**
	 * this method setup the TextFrame
	 */

	public void setTextFrame() {
		MainWindow m1 = new MainWindow(500, 400, 10, 10, type);
		m1.setVisible(true);
		m1.setLayout(new GridLayout(5, 1));

		JRadioButton jrb1 = new JRadioButton("public");
		jrb1.setForeground(Color.RED);
		jrb1.setBackground(Color.WHITE);
		JRadioButton jrb2 = new JRadioButton("default");
		jrb2.setForeground(Color.RED);
		jrb2.setBackground(Color.WHITE);
		ButtonGroup group1 = new ButtonGroup();
		group1.add(jrb1);
		group1.add(jrb2);
		
		jrb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				str1="public ";
			}
		});
		
		jrb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				str1=" ";
			}
		});

		JRadioButton jrb3 = new JRadioButton("abstract");
		jrb3.setForeground(Color.RED);
		jrb3.setBackground(Color.WHITE);
		JRadioButton jrb4 = new JRadioButton("final");
		jrb4.setForeground(Color.RED);
		jrb4.setBackground(Color.WHITE);
		ButtonGroup group2=new ButtonGroup();
		group2.add(jrb3);
		group2.add(jrb4);
		
		jrb3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				str2="abstract ";
			}
		});
		
		jrb4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				str2="final ";
			}
		});

		JLabel lb = new JLabel("Modifiers");

		JPanel jp = new JPanel(new GridLayout(1, 5));
		jp.add(lb);
		jp.add(jrb1);
		jp.add(jrb2);
		jp.add(jrb3);
		jp.add(jrb4);
		m1.add(jp);
		
	

		textArea1 = new TextArea("ENTER YOUR "+type+" NAME HERE", 20,
				20);
		scrollPanel1 = textArea1.myPanelText();
		m1.add(scrollPanel1);

		textArea2 = new TextArea("ENTER YOUR ARTRIBUTES NAME HERE", 20, 20);
		scrollPanel2 = textArea2.myPanelText();
		m1.add(scrollPanel2);

		textArea3 = new TextArea("ENTER YOUR INTERFACE METHOD HERE", 20, 20);
		scrollPanel3 = textArea3.myPanelText();
		m1.add(scrollPanel3);

		JButton b = new JButton("Enter");
		m1.add(b);
		b.setVisible(true);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextArea classText = new TextArea();
				JScrollPane sp = classText.myPanelText();
				panel2.add(sp);
				
				MiddlePanel drag=new MiddlePanel(textArea1,panel0,frame,"class");//changed without modified
				frame.setVisible(true);				
				JavaClass jc=new JavaClass(str1,str2,"class",textArea1.getTextArea().getText());
				ClassList.createClass(jc);
				String jcAttribute = textArea2.getTextArea().getText();
				String [] attributeArray = jcAttribute.split( "\n");
				String jcMethod = textArea3.getTextArea().getText();
				String [] methodArray = jcMethod.split( "\n");			
				for(int i = 0 ;i<attributeArray.length;i++)
				jc.createAttribute(attributeArray[i]);
				for(int j = 0;j<methodArray.length;j++)
				jc.createMethod(methodArray[j]);
				jc.setPanel(drag);
				jc.setTextAreaAndSP(classText, sp);
				
				JavaFile jf=new JavaFile(jc);
				jc.setJavaFile(jf);
				jf.write();
				
				classText.getTextArea().setText(jc.generate());
				jc.setClassTextArea(classText);
			}
		});
		
	}
	/**
	 * this method returns the textArea1 which contains the class name
	 * @return textArea1
	 */

	public TextArea gettextArea1() {
		return textArea1;
	}
	/**
	 * this method returns the textArea2 which contains the class attributes
	 * @return textArea2
	 */
	public TextArea gettextArea2() {
		return textArea2;
	}
	/**
	 * this method returns the textArea3 which contains the class methods
	 * @return textArea3
	 */
	public TextArea gettextArea3() {
		return textArea3;
	}
	public SubWindow returnThis(){
		return this;
	}
}
