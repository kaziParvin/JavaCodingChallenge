package InterviewCodingChallenge;

import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {
		
		System.out.println("Please Enter Alphabet only: ");
		
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
		
		
		if('a'<= input && input <= 'z' || 'A' <= input && input <= 'Z') {
			
			if(input == 'a' || input == 'e' || input == 'o' || input == 'i' || input == 'u') {
				System.out.println(input + " is a Vowel");
			}else {
				System.out.println(input + " is a Consonent");
			}

			
		}
	}

}
