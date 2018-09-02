package DemoSet;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetConcept {

	public static void main(String[] args) {



		TreeSet lsh=new TreeSet();
		
		lsh.add("J&K");
		lsh.add("UP");
		//lsh.add(null);
		lsh.add("AVI");
		
		
		for (Object object : lsh) {
			System.out.println(object);
		}
		
		System.out.println("**********************************");
		
		TreeSet lsh1=new TreeSet();
		
		lsh1.add("1");
		lsh1.add("2");
		lsh1.add("MP");
		//lsh1.add("UK");
		lsh1.add("AVI");
		
		TreeSet lsh2=new TreeSet();
        lsh2.add("MP");
		lsh2.add("UK");
		lsh2.add("AVI");
		
		
		
		
		System.out.println(lsh1.retainAll(lsh2));
		lsh1.retainAll(lsh2);
		
		for (Object object1 : lsh1) {
			System.out.println(object1);
		}
		

	}

}
