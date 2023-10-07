package javaInterviewQuestions;

public class A5_ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String given="I love India";
	
	//String reverse ="";
	
String []temp	=given.split("\s");
for(int i=2;i>=0;i--) {//(int i=temp.length-1)
	//reverse = reverse + temp[i];
String reverse = temp[i] + " ";
System.out.print(reverse);
}
//System.out.println(reverse);


	
	
	
	
		
		
		
	}

}
