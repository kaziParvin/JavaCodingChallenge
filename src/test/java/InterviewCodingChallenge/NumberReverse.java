package InterviewCodingChallenge;

public class NumberReverse {

	public static void main(String[] args) {
		
		int num =12345, r=0;
		
		while(num != 0) {
			int remainder = num % 10;
			r = r*10 + remainder;
			num = num  / 10;
		}
			System.out.println(r);
			
			
			//using StringBuilder 
			int num1 = 1234;
			StringBuilder sb = new StringBuilder(String.valueOf(num1));
			sb.reverse();
			System.out.println(sb);
			
			//using StringBuffer
			int num2 = 1234567;
			StringBuffer sb1 = new StringBuffer(String.valueOf(num2));
			sb1.reverse();
			System.out.println(sb1);
	}

}
