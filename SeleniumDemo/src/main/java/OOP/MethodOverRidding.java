package OOP;

public class MethodOverRidding extends MethodOverRidden{
	
	
	
	public void SelfStart(){
		System.out.println("--SelfStart Method--");
		
	
	}

	public void SelfLocking(){
		System.out.println("--SelfLocking Method--");
		
	}
	
	public void Start(){
		System.out.println("SelfStart Method");
		
	}
	
	public int Refuel(int i){
		System.out.println("SelfRefuel Method"+i);
		return i;
	}
	
	
	
	
	public static void main(String[] args) {


		MethodOverRidden mor=new MethodOverRidden();
		mor.Refuel(90);
		mor.Start();
		
		MethodOverRidding more=new MethodOverRidding();
		more.SelfStart();
		more.SelfLocking();
		more.Start();
		more.Refuel(100);
		
		
		
		//Up Casting
		MethodOverRidden mo=new MethodOverRidding();//parent class reference variable able to hold child class object.
		mo.Start();
		mo.Refuel(200);
		
		//mo.SelfStart(); and mo.SelfLocking(); we cannot call child class method becuase we are creating reference variable of parent class and creating object of child class.
		
		
		//MethodOverRidding mr=MethodOverRidden();//Child class reference variable unable to hold Parent class object.
		
		//We have to Down Casting to achive above...^
		MethodOverRidding mr=(MethodOverRidding)mo;
		mr.Start();
		mr.Refuel(500);
		mr.SelfLocking();
		mr.SelfStart();
		
		
		
		
		
		
	}

}
