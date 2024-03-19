package stringQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class B3_FindMissingPangramNo {

	public static void main(String[] args) {
	
String input ="abcf";
input =input.toLowerCase();
input =input.replaceAll(" ", "");

String [] userArray=input.split("");

String alphabets = "abcdefghijklmnopqrstuvwxyz";
String[] splitAlphabets=alphabets.split("");

HashSet<String> set1 = new HashSet<String>();
for (String s : userArray) {
	set1.add(s);
}

HashSet<String> set2 = new HashSet<String>(Arrays.asList(splitAlphabets));

set2.removeAll(set1);
System.out.println(set2);
	}

}
