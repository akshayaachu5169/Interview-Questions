package javaInterviewQuestions;

public class A6_PresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A6_PresentOrNot a = new A6_PresentOrNot();
		a.presentornot();
		
		
}
	
	boolean found=false;
	int []array = {1,2,3,4,5,3,2,3};
	int numbertofind=31;
public  void presentornot() {
	
	for (int number: array) {
		if(number==numbertofind) {
			 found=true;
			
			break;
		}
	}
	if(found) {
		System.out.println("number is present");
	}else {
		System.err.println("number not present");
	}
	
}
}
