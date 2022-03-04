package InterviewCodingChallenge;

public class EvenAndOddNumberCount {

	public static void main(String[] args) {
		
		int num =123445464, even = 0, odd = 0;
		
		while(num != 0) {
			int remainder = num %10;
			if(remainder % 2 ==0) {
				even++;
			}else {
				odd++;
			}
			num = num /10;
		}
		System.out.println("Even Number: " + even);
		System.out.println("Odd Number: " + odd);
	}

}
