package InterviewCodingChallenge;

public class NumberCounting {

	public static void main(String[] args) {
		int num=1245689, r=0;
		while(num!=0) {
			r++;
			num=num/10;
		}
		System.out.println("There are "+ r +" digit in this number");

	}

}
