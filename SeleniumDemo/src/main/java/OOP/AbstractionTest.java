package OOP;

public class AbstractionTest extends Abstraction {
	
	
	
	public  void Loan(int i){//5. Provide the implementations is nothing but override the methods in child classes.
		                //6. The abstract class contains declarations but for that declarations implementation is present in child classes. 
		System.out.println("***ICICI LOAN SYSTEM***");
	}
	


	
	public void InternetBanking(){
		System.out.println("***INTERNET BANKING***");//7. If you inherited the abstract methods then that class 
		//of all abstract method must declared in child class.
	}
	
	public void Funds(){
		System.out.println("***Funds Method***");
	}
	
	public void MobileBanking(){
		System.out.println("***MOBILE BANKING SYSTEM***");
	}
	

	public static void main(String[] args) {

		AbstractionTest at=new AbstractionTest();
		at.Loan(90);
		at.Funds();
		at.MobileBanking();
		at.Debit();
		at.Credit();
		at.InternetBanking();
		
		Abstraction abs=new AbstractionTest();
		abs.Credit();
		abs.Debit();
		abs.Loan(80);
		abs.InternetBanking();
		
		
		
	
		
		//Abstraction ab=new Abstraction();
		//AbstractionTest t=new Abstraction();
		//The abstract class contains declaration of methods 
		//it says abstract class partially implement class hence for partially implemented classes 
		//object creation is not possible. If we are trying to create object of abstract class 
		//compiler generate error message “class is abstract can not be instantiated”
			
	
		
		
	
	
		
		
		

		
		
		
	}


}
