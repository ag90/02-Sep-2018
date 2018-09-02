package OOP;

public class InterfaceTest2 implements InterfaceA,InterfaceD {

	public static void main(String[] args) {


		InterfaceTest2 in=new InterfaceTest2();
		in.I1();
		
		InterfaceA a=new InterfaceTest2();
		a.I1();
		
		InterfaceD d=new InterfaceTest2();
		d.I1();
		

	}

	public void I1() {
		System.out.println("I1");
		
	}

	public void I2() {
		// TODO Auto-generated method stub
		
	}

	public void I3() {
		// TODO Auto-generated method stub
		
	}

	public void I4() {
		// TODO Auto-generated method stub
		
	}

}
