package FlowControlStatements;
/**
 * 
 */

/**
 * @author guptaav
 *
 */
public class Ifelse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int a=100;
		int b=200;
		
		if (true) 
		{
			System.out.println("True body");
		}
		else
		{
			System.out.println("False body");
		}
		
		System.out.println("*******************************");
		
		
		
		if (a<b) {
			
			System.out.println("B is greater than A");
			
		}
		
		
		System.out.println("*******************************");
		
		int x=10;
		int y=20;
		
		if(x==y)
		{
			
			System.out.println("X is Equlant to Y");
		}
         
		else
		{
			System.out.println("X is NotEqulant to Y");
		}
		
		System.out.println("*******************************");
		
		int m =300;
		int n=300;
		
		
		if (m>n) 
		{
		
			System.out.println("M is NotGreater N");
			
		}
		
		else if(m<n)
		
		{
			
			System.out.println("M is NotLess to N");

		}
		
		
		else if(m==n)
		
		{
			
			System.out.println("M is Equalnt to N");

		}
		else
		{
			
			System.out.println("Both above condiion are failed");
			
		
		}
		
	}

}
