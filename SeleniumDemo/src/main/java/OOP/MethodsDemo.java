package OOP;

public class MethodsDemo extends Methods{
	
	public void Hcl(){//non static mehod
		System.out.println("HCL TECHNOLOGY");
		
		TCS();
		MethodsDemo.TCS();
		MethodsDemo mde=new MethodsDemo();
		mde.TCS();
	}
	
	public static void TCS(){//static method
		System.out.println("TATA COUNSULTANCY SERVICE");
		
		MethodsDemo mdf=new MethodsDemo();
		//mdf.Hcl();
		
	}

	public static void main(String[] args) {
		
	/*	Method mdh=new MethodsDemo();
		
		MethodsDemo dm=new Methods();*/
		
		
		MethodsDemo md=new MethodsDemo();
		md.Hcl();//we can call non static method by Only object creation.
		
		TCS();//we can call static method by direct, class name and object creation.
		MethodsDemo.TCS();
		MethodsDemo mdd=new MethodsDemo();
		mdd.TCS();
		
		
		Variables var=new Variables();//We can call non static variables and methods by Only object creation from any other class
		System.out.println(var.bc);
		System.out.println(var.Hyper);
		var.M1();
		var.M2();
		
		Variables vara=new Variables();
		System.out.println(vara.c);
		System.out.println(vara.Bigbazar);
		System.out.println(vara.j);
		System.out.println(vara.u);
		System.out.println(vara.v);
		vara.M3();
		
		System.out.println(Variables.c);
		System.out.println(Variables.Bigbazar);
		System.out.println(Variables.j);
		System.out.println(Variables.u);
		System.out.println(Variables.v);
		Variables.M3();
		
		
		


		
	}

}
