package stringQuestions;

import java.util.Spliterator;

public class A7_ReverseStringWithoutSpace {

	public static void main(String[] args) {

		String a = "j a va St ar";
		String result = a.replaceAll("\\s", "");
		System.out.println(result);
		for (int i = result.length() - 1; i >= 0; i--) {
			System.out.print(result.charAt(i));
		}

	}

}
