package InterviewCodingChallenge;

public class StringReverse {

	public static void main(String[] args) {
		// How to reverse a string using with and without reverse method
		
		//without using reverse method
		String str = "samia", reverse ="";
		
		for(int i = str.length()-1; i>=0; i--) {
			reverse = reverse+str.charAt(i);
		}
		System.out.println(reverse);
		
		
		// using StringBuffer
		StringBuffer sb = new StringBuffer("samia");
		sb.append("parvin");
		sb.reverse();
		System.out.println(sb);
		
		//using StringBuilder
		StringBuilder sb1 = new StringBuilder("Tasnim");
		sb1.reverse();
		System.out.println(sb1);

	}

}
