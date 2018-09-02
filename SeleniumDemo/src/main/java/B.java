
public class B extends A{
	
	
	
	public B(){
		
    System.out.println("Child class constructor");
   
		
	}
	
	public B(int y){
		
		System.out.println(y);
	}
	
	
	

	public static void main(String[] args) {

  
		B b=new B();
		A a=new A(120);
		
	}

}
