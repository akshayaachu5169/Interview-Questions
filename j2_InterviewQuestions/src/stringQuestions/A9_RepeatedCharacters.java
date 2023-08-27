package stringQuestions;

public class A9_RepeatedCharacters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "programming";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);

			int idx = a.indexOf(ch, i + 1);
			if (idx != -1) {
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}
}
