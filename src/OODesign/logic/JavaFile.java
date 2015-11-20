package OODesign.logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import OODesign.GUI.component.TextArea;
/**
 * this class generarte the java file and store it into the File Module2
 * @author ZHANG Beibei
 * @version 8.0
 */
public class JavaFile {
	private JavaClass theJavaClass;
	/**
	 * this constructor get the content of java file
	 * @param ta
	 * @param cmf
	 * @param cnm
	 * @param cab
	 * @param cmd
	 * @param type
	 */
	public JavaFile(JavaClass theJavaClass) {
		this.theJavaClass = theJavaClass;
	}
	/**
	 * this methods set the java content of java file
	 */
	public void write() {
		String fileName;
		String fileContent;
		
		fileName= theJavaClass.getName()+".java";
		File filename = new File(fileName);
		
		fileContent= theJavaClass.generate();

		String filein = fileContent;
		RandomAccessFile mm = null;
		try {
			mm = new RandomAccessFile(filename, "rw");

			mm.writeBytes(filein);

		} catch (IOException e1) {
			// TODO 自动生成 catch 块
			e1.printStackTrace();
		} finally {
			if (mm != null) {
				try {
					mm.close();
				} catch (IOException e2) {
					// TODO 自动生成 catch 块
					e2.printStackTrace();
				}
			}
		}

	}

}