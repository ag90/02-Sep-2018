package DemoSet;

import java.util.LinkedHashSet;

public class LinkedHashSetConcept {

	public static void main(String[] args) {


		LinkedHashSet lsh=new LinkedHashSet();
		
		lsh.add("J&K");
		lsh.add("UP");
		lsh.add(3);
		lsh.add(null);
		lsh.add("AVI");
		
		
		for (Object object : lsh) {
			System.out.println(object);
		}
		
		System.out.println("**********************************");
		
		
        LinkedHashSet lsh1=new LinkedHashSet();
		
        lsh1.add("RJ");
		//lsh1.add(3);
		lsh1.add("UK");
		lsh1.add("KA");
		lsh1.add("AVI");
		
		 LinkedHashSet lsh2=new LinkedHashSet();
			
	        lsh2.add("MP");
			//lsh2.add(3);
			lsh2.add(null);
			lsh2.add("AVI");
		
			
		lsh1.retainAll(lsh2);
		
		
		
		
		for (Object object1 : lsh1) {
			System.out.println(object1);
		}
		
		System.out.println(lsh2.retainAll(lsh1));

		
		
	}

}
