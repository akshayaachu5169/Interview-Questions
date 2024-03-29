package javaInterviewQuestions;

public class A8_LowerAndUpperCaseAsciiValue {

	public static void main(String[] args) {
		// lower case - 65 to 90
		// upper case - 97 to 122
		//add or sub each number by 32

		//String input = "I lOVE INDIA";
		String input = "i love india";
	char[]	chararray =input.toCharArray();
	/*for(int i=0;i<chararray.length;i++) {
		if(chararray[i]>=65 && chararray[i]<=90) {
		chararray[i]=	(char) (chararray[i] + 32);
		}
	}
	for(int i=0;i<chararray.length;i++) {
		System.out.print(chararray[i]);
	}*/
	
	for(int i=0;i<chararray.length;i++) {
		if(chararray[i]>=97 && chararray[i]<=122) {
			chararray[i]=	(char) (chararray[i] - 32);
		}
	}
	for(int i=0;i<chararray.length;i++) {
		System.out.print(chararray[i]);
	}
		}

}
