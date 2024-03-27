package stringQuestions;

public class B5_ExractNoAndAddThem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "India32";

		int total = 0;

		for (int i = 0; i < input.length(); i++) {

			char character = input.charAt(i);
			if (Character.isDigit(character)) {
				total = total + Character.getNumericValue(character);
			}
		}
		System.out.println(total);
	}

}
