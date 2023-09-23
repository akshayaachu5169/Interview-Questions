package javaInterviewQuestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class A4_DifferentMethodsFindingSmallestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A4_DifferentMethodsFindingSmallestNo a = new A4_DifferentMethodsFindingSmallestNo();
		//a.givenArray();
		//a.usingArray();
		a.usingCollection();
		
	}

	Integer[] Array = { 3, 5, 2, 4, 1, };

	public void givenArray() {
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] < smallest) {
				smallest = Array[i];
			}
		}
		System.out.println(smallest);
	}


public void usingArray() {
Arrays.sort(Array);
	System.out.println(Array[0]);
}

public void usingCollection() {
List<Integer> numbers=	Arrays.asList(Array);
Collections.sort(numbers);
System.out.println(Array[0]);

}
}