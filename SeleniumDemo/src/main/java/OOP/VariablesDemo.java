package OOP;

public class VariablesDemo {
	
	int k=90;
	String HyperCity="HYPERCITY";//both are non static variables
	

	
	public void M1(){
		
		int i=10;
		String str="String";//both are local variables
		System.out.println(str+i);
		System.out.println(k);
		
		System.out.println(HyperCity);
		VariablesDemo vdd=new VariablesDemo();
		System.out.println(vdd.k);
		
		System.out.println(y);
		System.out.println(VariablesDemo.BigBazar);
		VariablesDemo vd=new VariablesDemo();
		System.out.println(vd.BigBazar);
		
		
	}
	
	static int y=60;
	static String BigBazar="BIGBAZAR";//both are static variables
	
	public static void M2(){
		System.out.println(y);
		System.out.println(VariablesDemo.BigBazar);
		VariablesDemo vd=new VariablesDemo();
		System.out.println(vd.BigBazar);
		
		VariablesDemo vdc=new VariablesDemo();
		System.out.println(vdc.HyperCity+vdc.k);
		
		
		
	}
	
	static String JK;//null
	static int X;//0
	
	
	public static void main(String[] args) {
		
		VariablesDemo vd=new VariablesDemo();
		vd.M1();
		vd.M2();
		System.out.println(JK);
		System.out.println(X);


		
		
}
	
}
