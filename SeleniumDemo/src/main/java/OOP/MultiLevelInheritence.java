package OOP;

public class MultiLevelInheritence extends SingleLevelInheritence {
	
	
	public void refuel(){
		System.out.println("Refuel Method");
		Antilock();//Aquaring the properties of parent class in child class by extends keywords
		Staringfree();//Aquaring the properties of parent class in child class by extends keywords
		
	}
	
	public void TheftSafety(){
		System.out.println("TheftSafety Method");
		Startkey();//Aquaring the properties of parent class of parent class(Grand parent class), in Grand-child class by extends keywords
		Excelator();//-Means multilevelinhertence class indirectly using the properties of singlelevelinheri. and inheritencebase class as well.
		Break();
		Gear();
	}
	
	

	public static void main(String[] args) {
		MultiLevelInheritence mli=new MultiLevelInheritence();
		mli.refuel();
		mli.TheftSafety();
		mli.Antilock();
		mli.Staringfree();
		mli.Break();
		mli.Excelator();
		mli.Startkey();
		mli.Gear();
		
		
		
		
		SingleLevelInheritence  sli=new SingleLevelInheritence();
		sli.Antilock();
		sli.Staringfree();
		sli.Break();
		sli.Gear();
		sli.Excelator();
		sli.Startkey();
		
		InheritenceBase ib=new InheritenceBase();
		ib.Break();
		ib.Excelator();
		ib.Gear();
		ib.Startkey();
		
		
		
		  
		


		
		
	}

}
