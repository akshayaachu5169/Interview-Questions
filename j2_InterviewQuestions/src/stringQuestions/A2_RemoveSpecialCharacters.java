package stringQuestions;

public class A2_RemoveSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a ="$ja%v&aS*t#ar";
String result =a.replaceAll("[^a-z A-Z 0-9]", "");

System.out.println(result);
 

	}

}
