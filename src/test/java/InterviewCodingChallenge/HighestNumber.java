package InterviewCodingChallenge;

public class HighestNumber {

	public static void main(String[] args) {
		
		int [] numbers = {30, 12, 56, 89, 200};
		int value = numbers[0];
		
		for(int i = 0; numbers.length-1 >= i; i++) {
			int newValue = numbers[i];
			
			if(newValue> value) {
				value = newValue;
			}
		}
		System.out.println("Highest Number: " + value);
		

	}

}
