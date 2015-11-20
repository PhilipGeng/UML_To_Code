package OODesign.logic;

import java.util.LinkedList;

public class ClassList {
	public static LinkedList<JavaClass> classList = new LinkedList<JavaClass>();
	public static int classListPointer = 0;
	public static void createClass(String modifier,String nextModifier, String type, String name){
		classListPointer++;;
		classList.add(new JavaClass(modifier,nextModifier,type,name));
	}
	public static void createClass(JavaClass classCreated){
		classListPointer++;
		classList.add(classCreated);
	}
	public static JavaClass [] getClassListArray(){
		return classList.toArray(new JavaClass[0]);
	}
	public static void delete(JavaClass classToDelete){
		classList.remove(classToDelete);
	}
}