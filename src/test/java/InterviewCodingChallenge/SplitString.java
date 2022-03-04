package InterviewCodingChallenge;

public class SplitString {

	public static void main(String[] args) {
		String str = "Samia";
		Object afterSplit = str.charAt(0);
		for(int i =1; i<=str.length()-1; i++) {
			afterSplit = afterSplit + " "+ str.charAt(i);
		}
			System.out.println(afterSplit);
	}

}
