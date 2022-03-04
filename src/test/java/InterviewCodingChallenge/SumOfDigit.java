package InterviewCodingChallenge;

public class SumOfDigit {

	public static void main(String[] args) {
		int num=123406, sum=0; 
		
		while(num!=0) {
			sum=sum+num%10;
	
			num=num/10;
		}
		System.out.println("Sum of all digit : "+sum);	

	}

}
