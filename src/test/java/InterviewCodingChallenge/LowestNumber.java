package InterviewCodingChallenge;

public class LowestNumber {

	public static void main(String[] args) {
		
		int [] numbers = {10, 45, 78, 11, 6, 90};
		int value = numbers[0];
		
		for(int i = 0; numbers.length-1 >= i; i++) {
			int newValue = numbers[i];
			
			if(newValue< value) {
				value =newValue;
			}
		}
		System.out.println("Lowest Number: " + value);

	}

}
