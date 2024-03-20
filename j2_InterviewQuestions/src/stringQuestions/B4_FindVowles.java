package stringQuestions;

public class B4_FindVowles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "IloveIndia";

		input = input.toLowerCase();

		int vowelscount = 0;
		String[] words = input.split("");
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("a")||words[i].equals("e")||words[i].equals("i")||words[i].equals("o")
					||words[i].equals("u")) {
				vowelscount++;
				
			}
		}
		System.out.println(vowelscount);
	}
}