package OODesign.GUI.component;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import OODesign.GUI.windows.SubWindow;

/**
 * this program is used to set text area on the panel and text field frame
 * {@link MainPanel}
 * {@link SubWindow}
 * @author ZHANG Beibei
 * @version 1.0
 */
public class TextArea {
	private JTextArea area1;
	
	/**
	 * this constructor is used to initialize the length 
	 * and width of the text area
	 */
	
	public TextArea(){
		area1=new JTextArea(20,20);
		area1.setVisible(true);
		area1.setEditable(false);
	}
	
	/**
	 * this constructor is used to set a specific text area
	 * @param title
	 * @param length
	 * @param width
	 */
	
	public TextArea(String title, int length, int width){
		area1=new JTextArea(title,length,width);
		area1.setVisible(true);
	}
	
	/**
	 * this method add the scroll pane to a text area
	 * @return scroll
	 */
	
	public JScrollPane myPanelText(){
		JScrollPane scroll = new JScrollPane(area1);
		scroll.setHorizontalScrollBarPolicy( 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
				scroll.setVerticalScrollBarPolicy( 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setVisible(true);
		return scroll;
	}
	
	/**
	 * this method get the text area
	 * @return area1
	 */
	
	public JTextArea getTextArea(){
		return area1;
	}

}
