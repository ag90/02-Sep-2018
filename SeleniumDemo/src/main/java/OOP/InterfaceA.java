package OOP;

public interface InterfaceA {//1.Interface (class) is by default abstract.
	
	 void I1();//2.In interface which having only method decalaration no method body or implementation.
	
	 void I2();//3.In interface can have only abstract method or cannot declared non abstract method and by dafault public 
	          //abstract no need to write public abstract.
	
	 void I3();
	
	 void I4();

}

 // InterfaceA ia=new InterfaceA();//4. The interface contains declaration of methods 
//it says interface is by default abstract then partially implement interface hence for partially implemented interface 
//object creation is not possible. If we are trying to create object of abstract class 
//compiler generate error message “Cannot instantiate the type 'Interface name'”

//5.we can achieve 100% abstraction by interface. 

