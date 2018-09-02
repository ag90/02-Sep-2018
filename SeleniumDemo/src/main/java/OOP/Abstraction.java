package OOP;

public  abstract  class Abstraction {//1. If any abstract method inside the class, that class must be abstract.
	                               //2. Abstract class can have abs. method or non abs. method, 
	                               //means Abstract class have abs. method is not mandatory.
	
	
	public abstract void  Loan(int i);//3. Abs. method: The method, which is having only method declaration, 
	//but not method implementations means method is declared but not define or no body such type of methods are called abstract Methods.
	//In java every abstract method must end with “ ; ”. 

	public abstract void InternetBanking();
	
	public void Credit(){//Non abstract method
		System.out.println("***Bank Credit***");
	}
	
	public void Debit(){//Non abstract method
		System.out.println("***Bank Debit***");
	}
	
	

	public static void main(String[] args) {
		
		//Abstraction abs=new Abstraction();===>4. The abstract class contains declaration of methods 
		//it says abstract class partially implement class hence for partially implemented classes 
		//object creation is not possible. If we are trying to create object of abstract class 
		//compiler generate error message “class is abstract can not be instantiated”



		
	}

}
