package javaInterviewQuestions;

public class A2_PalindromeNumber {

	public static void main(String[] args) {
		int no=1221;
		int rem =0;
		while(no>0) {
		rem= (rem*10)+no%10;
		no=no/10;

	}
		System.out.println(rem);
		if(rem==1221) {
			System.out.println("it is an palindrome");
		}else {
			System.out.println("it is not an palindrome");
		}
	}
}
