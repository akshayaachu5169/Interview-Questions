package stringQuestions;

public class A8_NumberOfCharsString {

	public static void main(String[] args) {

		String string = "java";
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("number of character: " + count);
	}

}
