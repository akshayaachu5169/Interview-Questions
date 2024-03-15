package stringQuestions;

public class B2_FindTheOccurenceChar {

	public static void main(String[] args) {
		//with iteration
		
//String input = "Indiancity";
//char tofind ='i';
//int occurance = 0;
//
//input=input.toLowerCase();
//
//for(int i=0;i<input.length();i++) {
//	if(input.charAt(i)==tofind) {
//		occurance++;
//		
//	}
//}
//System.out.println(occurance);
		
		//without iteration
		
		String input= "Indiancity";
	char tofind ='i';
	
	
		
		input =input.toUpperCase();
		String charTofind =Character.toString(tofind).toUpperCase();
	
		int actualLength =	input.length();
		System.out.println(actualLength);
		input = input.replace(charTofind, "");
		System.err.println(input);
		
		int afterreplaceLength=input.length();
		System.out.println(afterreplaceLength);
		
		System.out.println(actualLength - afterreplaceLength);
	
	
	
	
	
		
	}

}
		
	
	
	

	
	
