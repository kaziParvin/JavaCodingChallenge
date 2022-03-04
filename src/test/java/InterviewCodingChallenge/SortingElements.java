package InterviewCodingChallenge;

import java.util.Arrays;

public class SortingElements {

	public static void main(String[] args) {
		
		int [] a = {30,40,35,67,87,12};
		System.out.println("Array elements before sorting:" + Arrays.toString(a));
		
		Arrays.parallelSort(a);
		System.out.println("Array elements after sorting: "+ Arrays.toString(a));

	}

}
