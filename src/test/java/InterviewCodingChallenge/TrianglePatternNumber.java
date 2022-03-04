package InterviewCodingChallenge;

import java.util.Scanner;

public class TrianglePatternNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			for(int j = input; j>i; j--) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++) {
				System.out.print(k+ " ");
			}
			System.out.println("");
		}

	}

}
