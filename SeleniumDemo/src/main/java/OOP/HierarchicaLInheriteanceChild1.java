package OOP;

public class HierarchicaLInheriteanceChild1 extends HierarchicaLInheriteanceparent {
	
	
	public void ChildMethod1(){
		System.out.println("ChildMethod1");
		parentMethod();
	}

	public static void main(String[] args) {


		HierarchicaLInheriteanceparent hip1=new HierarchicaLInheriteanceparent();
		hip1.parentMethod();
		
		HierarchicaLInheriteanceChild1 hic1=new HierarchicaLInheriteanceChild1();
		hic1.ChildMethod1();
		hic1.parentMethod();
		
	}

}
