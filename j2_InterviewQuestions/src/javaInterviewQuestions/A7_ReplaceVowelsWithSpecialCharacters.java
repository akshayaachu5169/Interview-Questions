package javaInterviewQuestions;

public class A7_ReplaceVowelsWithSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "I love India";
		input = input.toLowerCase();

		String[] letters = input.split("");
		for (int i = 0; i < letters.length; i++) {
			// if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) ==
			// 'i' || input.charAt(i) == 'o'
			// || input.charAt(i) == 'u') {

			if (letters[i].equals("a") || letters[i].equals("e") || letters[i].equals("i") || letters[i].equals("o")
					|| letters[i].equals("u")) {
				letters[i] = "*";
			}
		}
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i]);
		}

//	String result=	input.replaceAll("[aeiou]", "\\$");//cannot give $ without \\
//	System.out.println(result);
	}
}
