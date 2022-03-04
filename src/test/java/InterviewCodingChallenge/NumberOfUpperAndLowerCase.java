package InterviewCodingChallenge;

public class NumberOfUpperAndLowerCase {

	public static void main(String[] args) {
	
		String str = "I Love My Mom";
		int upperCaseCount = 0, lowerCaseCount =0;
		
		char[] ch=str.toCharArray();
		for(char cha:ch) {
			
			if(cha>='A' && cha<='Z') {
				
				upperCaseCount++;
			}
			else if(cha>='a' && cha<='z') {
				
				lowerCaseCount++;
			}
			else {
				continue;
			}
		}
		System.out.println("Number of Upper case character: "+ upperCaseCount);
		System.out.println("Number of Lower case character: "+ lowerCaseCount);	

	}

}
