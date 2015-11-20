package OODesign.logic;

import java.util.LinkedList;

import javax.swing.JScrollPane;

import OODesign.GUI.component.MainPanel;
import OODesign.GUI.component.MiddlePanel;
import OODesign.GUI.component.TextArea;

public class JavaClass extends Components {
	private final JavaClass belongToClass = null;
	
	private MiddlePanel panelInGUI;

	private TextArea classTextInGUI;
	private JScrollPane classJSInGUI;
	
	private JavaFile fileOfClass;
	private LinkedList<JavaAttribute> attributeList = new LinkedList<JavaAttribute>();
	private int attributeListPointer = 0;
	private JavaAttribute[] attributeListArray = null;
	private LinkedList<JavaMethod> methodList = new LinkedList<JavaMethod>();
	private int methodListPointer = 0;
	private JavaMethod[] methodListArray = null;

	private JavaClass superClass;
	private String nextModifier;
	private TextArea classTextArea;

	private LinkedList<JavaClass> interfaceList = new LinkedList<JavaClass>();
	private JavaClass[] interfaceListArray;
	private int interfaceListPointer = 0;

	private LinkedList<JavaClass> aggList = new LinkedList<JavaClass>();
	private JavaClass[] aggListArray;
	private int aggListPointer = 0;

	private LinkedList<JavaClass> compList = new LinkedList<JavaClass>();
	private JavaClass[] compListArray;
	private int compListPointer = 0;

	public JavaClass(String modifier, String nextModifier, String type,
			String name) {
		this.modifier = modifier;
		this.nextModifier = nextModifier;
		this.name = name;
		this.type = type;
	}

	public void setInheritance(JavaClass superClass) {
		this.superClass = superClass;
	}

	public void setImplementation(JavaClass interfaceClass) {
		interfaceList.add(interfaceClass);
		interfaceListPointer++;
	}

	public void setAggregation(JavaClass aggClass) {
		aggList.add(aggClass);
		aggListPointer++;
	}

	public void setComposition(JavaClass congClass) {
		compList.add(congClass);
		compListPointer++;
	}

	public void createMethod(String signiture) {
		methodListPointer++;
		methodList.add(new JavaMethod(signiture, this));
	}

	public void createAttribute(String signiture) {
		attributeListPointer++;
		attributeList.add(new JavaAttribute(signiture, this));
	}

	@Override
	public String generate() {
		generatelistToArray();
		String content;
		content = modifier+" "+nextModifier + " " + type + " " + name;
		if (superClass != null)
			content = content + " extends " + superClass.getName();
		if (interfaceListArray.length != 0) {
			content = content + " implements ";
			for (int j = 0; j < interfaceListArray.length; j++) {
				content = content + interfaceListArray[j].getName();
				if (j != interfaceListArray.length - 1)
					content = content + ",";
			}
		}
		content = content + "{\r\n";
		for (int i = 0; i < attributeListArray.length; i++) {
			content += attributeListArray[i].generate() + "\r\n";
		}
		for (int k = 0; k < methodListArray.length; k++) {
			content += methodListArray[k].generate() + "\r\n";
		}
		content += "}";
		return content;
	}

	public void generatelistToArray() {
		interfaceListArray = interfaceList.toArray(new JavaClass[0]);
		attributeListArray = attributeList.toArray(new JavaAttribute[0]);
		methodListArray = methodList.toArray(new JavaMethod[0]);
	}
	public void setClassTextArea(TextArea t1){
		this.classTextArea = t1;
	}
	public TextArea getClassTextArea(){
		return classTextArea;
	}
	
	public void delete(){
		compListArray = compList.toArray(new JavaClass[0]);
		for(int i = 0;i<compListArray.length;i++){
			compListArray[i].delete();
		}
		ClassList.delete(this);
		panelInGUI.delete();
		MainPanel.getP2().remove(classJSInGUI);
	}
	public String getDeleteCompositionSting(){
		compListArray = compList.toArray(new JavaClass[0]);
		String result = "";
		for(int i = 0;i<compListArray.length;i++){
			result = result + compListArray[i].getName()+"¡¢ ";
			result = result + compListArray[i].getDeleteCompositionSting();
		}
		return result;
	}
	public void setPanel(MiddlePanel dragPanelInGUI){
		this.panelInGUI = dragPanelInGUI;
	}
	public void setJavaFile(JavaFile fileOfClass){
		this.fileOfClass = fileOfClass;
	}
	public void setTextAreaAndSP(TextArea ta,JScrollPane js){
		this.classTextArea = ta;
		this.classJSInGUI = js;
	}
}
