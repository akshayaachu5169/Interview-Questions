package stringQuestions;

public class A3_Removespace{
public static void main(String[] args) {
	String a = " ja va s t ar ";
//String trimmedString=	a.trim();
//System.out.println(trimmedString); trims only front and back space
	
	//method 1
	String trimmedString=	a.replaceAll("\\s", "");
	System.out.println(trimmedString);
	
	//method 2 
	
//	String []b = a.split("\\s");
//	System.out.println(b[0]+b[1]+b[2]);
//	for(int i=0;i<b.length;i++) {
//		System.out.print(b[i]);
//	}
}
	
	
}
