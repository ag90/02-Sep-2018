package OOP;

public class InterfaceTest {

	public static void main(String[] args) {


		InterfaceClassB b=new InterfaceClassB();
		
		b.I1();
		b.I2();
		b.I3();
		b.I4();
		
		InterfaceA a=new InterfaceClassB();
		a.I1();
		a.I2();
		a.I3();
		a.I4();
		
	//InterfaceClassB ifcb=new InterfaceA();
	//InterfaceA ia=new InterfaceA();
	
		//4. The interface contains declaration of methods 
		//it says interface is by default abstract then partially implement interface hence for partially implemented interface 
		//object creation is not possible. If we are trying to create object of abstract class 
		//compiler generate error message “Cannot instantiate the type 'Interface name'”
		
		
			
		
	}

}
