package OOP;

public class MethodOverLoading {
	
	public void QA(int a){
		System.out.println( "int a");
	}
	
	public void QA(long t){
		System.out.println(" long a");
	}
	
	public void QA(long l,int w){
		System.out.println("long a And int b");
	}
	
	public void QA(float f,char b){
		System.out.println("float a And byte b");
	}
	
	public void QA(float x,char v,char p){
		System.out.println("float a, byte b And float c");
	}
	
	public void QA(String Test,int j,long u){
	    System.out.println("String Test,int a And long b");	
	}
	
    public void QA(int d,String java,long b){
		System.out.println("int a,String Test And long b");
	}
    
    public void QA(long s,int n,String Window){
    	System.out.println("long b,int a,String Test");

	}

	public static void main(String[] args) {
		MethodOverLoading mol=new MethodOverLoading();
		mol.QA(20);
		mol.QA(922337807L);
		mol.QA(120, 122);
		mol.QA(0.2f, 'C');
		mol.QA(10f, 'G', 'Q');
		mol.QA(120, "Selenium", 1000000L);
		mol.QA(102, "OOPS", 2000L);
		mol.QA(129000L, 2098, "Window Handling in Selenium");

	}

}
