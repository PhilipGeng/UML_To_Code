package OODesign.logic;


public class JavaAttribute extends Components {

	public JavaAttribute(String signiture,JavaClass belongToClass){
		this.signiture = signiture;
		this.belongToClass = belongToClass;
	}
	public String generate() {
		int cutPoint = signiture.length()-1;
		for(int i = 0;i<signiture.length();i++){
			if(signiture.charAt(i)==';'){
				cutPoint = i;
				signiture = signiture.substring(0, cutPoint);
				break;
			}
		}
		signiture = signiture+";";
		return (signiture);

	}

}
