package OOP;

		class Test1 extends Test 
		{ 
			void m1(){
				System.out.println("m1 method");
			} 
			
			
			
		  void m2(){
			System.out.println("m2 method");
			} 
		void m3(){
			System.out.println("m3 method");
			} 
		void m5(){
			System.out.println("m5 method");
		}
		public static void main(String[] args) 
		{ 
			Test1 t = new Test1(); 
		t.m1(); t.m2(); t.m3(); t.m4(); t.m5();
		Test t1 = new Test1(); //abstract class reference variable Child class object 
		t1.m1(); //compile : Test runtime : Test1 
		t1.m2(); //compile : Test runtime : Test1 
		t1.m3() ; //compile : Test runtime : Test1 
		t1.m4() ; //compile : Test runtime : Test1 
		
		
		
		} 
		}
		
