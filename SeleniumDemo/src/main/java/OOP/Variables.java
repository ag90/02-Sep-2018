package OOP;

public class Variables {
	
	
	//Instance to instance : direct, object creation
	//static to static : direct and by class name, create object of class
	//instance v. to static method : we have to create object of class
	//static v. to instance method : we have to create object of class, by class name and direct
	
	public void M1(){//instance method
		int a =10; //Local variable: if variable are declared inside the method that is local variables.
		String str="AVIG";
		System.out.println(a);
		System.out.println(str);
	
		
	}
	
	
	
	int bc=20;//instance variable
	String Hyper="HYPERCITY";
	
         public void M2(){//instance method
        	 
        	 System.out.println(bc);
        	 System.out.println(Hyper);
        	  
        	 Variables vn=new Variables();
        	 System.out.println(vn.bc);
        	 System.out.println(vn.Hyper);
        	 
        	 
        	 System.out.println(c);
        	 System.out.println(Bigbazar);
        	 
        	 Variables t2=new Variables();
        	 System.out.println(t2.c);
        	 System.out.println(t2.Bigbazar);
        	 
        	 
        	 System.out.println(Variables.c);
        	 System.out.println(Variables.Bigbazar);
        	  
		
	     }
         
         static int c=30;
         static String Bigbazar="MoreOffers";
         
         
         public static void M3(){
        	 System.out.println(c);
        	 System.out.println(Bigbazar);
        	 
        	 System.out.println(Variables.c);
        	 System.out.println(Variables.Bigbazar);
        	 
        	 Variables t3=new Variables();
        	 t3.M2();
        	 
        	 
        	 Variables t=new Variables();
        	 System.out.println("I "+t.bc);
        	 System.out.println("I "+t.Hyper);
        	 
        	 
        	 
        	 
        	 
         }
         
         
         static String v;//same for instance: null
         static int u;//same for instance: 0
	
	
	
         int k=10; //instance variable
     	static int j=20; //static variable
     	
	public static void main(String[] args) {
		
		Variables var=new Variables();
		System.out.println(var.bc);
		System.out.println(var.Hyper);
		
		System.out.println(c);
		System.out.println(Bigbazar);
		System.out.println(Variables.c);
		System.out.println(Variables.Bigbazar);
		
		System.out.println(v);
		System.out.println(u);
		
		
		
		
		System.out.println("*****************************************");
		
		
		Variables t1 = new Variables();
		System.out.println(t1.k); //10
		System.out.println(t1.j); //20
		
		t1.k=111; t1.j=222;
	
		System.out.println(t1.k); //111
		System.out.println(t1.j); //222
		
		Variables t11 = new Variables();
		System.out.println(t11.k); //10
		System.out.println(t11.j); //222
		
		t11.j=444;
		Variables t2 = new Variables();
		t2.k=5555;
		System.out.println(t2.k);//10
		System.out.println(t2.j); //444
		
		t11.k=555;
		Variables t3 = new Variables();
		System.out.println(t3.k);//10
		
	    
		
		

		
	}

}
