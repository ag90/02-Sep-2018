package OOP;

public class InterfaceClassB implements InterfaceA  {//6. by implemets keyword you can access abstract method in child class 
	                                                 //We have to use following keywords because 
	                                                 //class to class => extends and interface to class=> implements
	
	
	public void I1(){//7.Provide the implementations is nothing but override the methods in child classes. 
	                 //8. If you inherited the abstract methods then that interface 
		             //of all abstract method must declared in child class.
	
		System.out.println("Interface I1");
	}
	
	public void I2(){
		
		System.out.println("Interface I2");
		
	}
	
	public void I3(){
		
		System.out.println("Interface I3");
	}
	
	public void I4(){
		
		System.out.println("Interface I4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
