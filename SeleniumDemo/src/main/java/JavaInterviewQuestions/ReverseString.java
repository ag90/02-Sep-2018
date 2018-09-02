package JavaInterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {


	String TestAutomation="PageObject";
	int len=TestAutomation.length();
	
	
	for (int i = 0; i<len; i++) {
		
		char rev=TestAutomation.charAt(i);
		System.out.println(rev);
		
	}
	
	
     for (int i = len-1; i<len; i++) {
		
		char rev=TestAutomation.charAt(i);
		System.out.println(rev);
		
	}
	
	
		
		
	}
}
