package stringQuestions;

public class B1_FindLengthOfTheString {

	public static void main(String[] args) {
		
		String a ="AkshayaAswin";
		//1st method
		System.out.println(a.length());

	char[] chararray=	a.toCharArray();
	int length=0;
	for (char c : chararray) {
		length++;
	}
	System.out.println(length);
	}

}
