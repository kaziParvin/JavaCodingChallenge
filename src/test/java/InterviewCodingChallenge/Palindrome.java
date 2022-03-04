package InterviewCodingChallenge;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int r =0;
		int ori_num = num;
		
		while(num != 0) {
			int remainder = num % 10;
			r = r * 10 + remainder;
			num = num / 10;
			
		}
		//System.out.println("Reverse number is: " + r);
		
		if (ori_num == r) {
			System.out.println(ori_num + " is palindrome number ");
		}else {
			System.out.println(ori_num + " is Not palindrome number ");
		}

	}

}
