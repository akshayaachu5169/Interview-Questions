package javaInterviewQuestions;

public class A1_ReverseNumber {

	public static void main(String[] args) {
		int no = 1234;
		int rem = 0;
		while (no > 0) {
			rem = (rem * 10) + no % 10;
			no = no / 10;
		}
		System.out.println(rem);
	}

}
