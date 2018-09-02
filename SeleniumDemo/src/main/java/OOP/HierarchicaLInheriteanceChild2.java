package OOP;

public class HierarchicaLInheriteanceChild2 extends HierarchicaLInheriteanceparent {
	
	public void ChildMethod2(){
		System.out.println("ChildMethod2");
		parentMethod();
	}

	public static void main(String[] args) {

		HierarchicaLInheriteanceparent hip1=new HierarchicaLInheriteanceparent();
		hip1.parentMethod();
		
		HierarchicaLInheriteanceChild2 hic2=new HierarchicaLInheriteanceChild2();
		hic2.ChildMethod2();
		hic2.parentMethod();
		
	}

}
