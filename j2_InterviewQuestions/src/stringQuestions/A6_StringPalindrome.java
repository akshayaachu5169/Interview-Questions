package stringQuestions;

public class A6_StringPalindrome {

	public static void main(String[] args) {
		String a= "noon";
		
		String b="";
		for(int i=a.length()-1;i>=0;i--) { 
		b= b+a.charAt(i)	;
		
		}
System.out.println(b);

if(b.equals(a)) {
	System.out.println("It is a panlindrome");
}else {
	System.out.println("It is not a palindrome");
}
	}

}
