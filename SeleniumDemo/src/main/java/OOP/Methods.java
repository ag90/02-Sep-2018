package OOP;

import org.openqa.selenium.WebDriver;

public class Methods extends Variables  {
	
	WebDriver driver;
	
	public void JKCement()
	{
		
		System.out.println("Super Cement in India");
		
	     //Methods.UltraCement();
		
		
		
		
	}
	
	int hu=010;//this is use for below method of 3rd commented line.
	
	public static void UltraCement()
	{
		System.out.println("Great Cement in India");	
		
		Methods mt=new Methods();
		mt.JKCement();
		//System.out.println(this.c);//we cannot use this and super keyword in static area from current class or anyother class as well.
		//super.M3();
		//System.out.println(this.hu);
		
	}
	
	

  /* public void K3(){
    	
    	public void J3(){
    		System.out.println("J3");//java doesnot support inner method
    	}
    	
    	System.out.println("K3");
    }*/
	
	
	
	public void Methodpara(int a,String Casuals,String Username){//Method signature.
		System.out.println("******************");
		System.out.println(a);
		System.out.println(Casuals+Username);
		System.out.println(Username);
		System.out.println("******************");
		
		//driver.findElement(By.xpath(Username)).click();
		
	}
	
	int y=19;
	String str="Selenium";
	
	public void Thiskeyword(int y, String str){//use this keyword if instance and local variables having same name and call for only current class variables.
		
		System.out.println(y+str);
		System.out.println(this.y);
		System.out.println(this.str);
		
		
	}
	
	int bc=190;
	String Hyper="Selenium";
	
	
	public void Superkeyword(int bc,String Hyper){//use super keyword if instance and local variables having same name in anyother class so to call for only anyother class variables if we are using extends keyword.
		
		System.out.println(bc+Hyper);
		System.out.println(super.bc);
		System.out.println(super.Hyper);
		
		

	}
	int a=10; //instance variable
	static int b=20; //static variable
	
	public static void main(String[] args) {
		
		Methods mu=new Methods();
		mu.JKCement();
		Methods.UltraCement();
		
		/*mu.K3();*/
		
		mu.Methodpara(110, "Shirts", "9866740237");
		
		mu.Thiskeyword(20, "Paasword");
		
		mu.Superkeyword(1000, "WallMart");
		
		
		
		Variables vm=new Variables();
		vm.M1();//by object creation we can call instance variable and methods from any other class.
		vm.M2();
		System.out.println(vm.bc);
		System.out.println(vm.Hyper);
			
		
	    Variables v2=new Variables();
		v2.M3();
		System.out.println(v2.c);
		System.out.println(v2.Bigbazar);
		
		
	    Variables.M3();//by class,object creation we can call static variables and methods from any other class.
		System.out.println(Variables.c);
		System.out.println(Variables.Bigbazar);
		
		
		
		
		
		/*System.out.println(c);
		System.out.println(Bigbazar);*/
		
		
		
		
		
		
		


		
	}

}
