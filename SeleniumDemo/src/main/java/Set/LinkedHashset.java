package Set;

import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {


		LinkedHashSet lhs1=new LinkedHashSet();
		
		lhs1.add("Test");
		lhs1.add("Selenium");
		lhs1.add("POM");
		lhs1.add("Data driven");
		lhs1.add("Test");
		lhs1.add("Java");
		lhs1.add(null);



		
		
		for (Object obj1 : lhs1) {
			System.out.println(obj1);
		}
		
		System.out.println("*****************");
		
		LinkedHashSet lhs2=new LinkedHashSet();
		
		lhs2.add("Test");
		lhs2.add("Selenium");
		lhs2.add("POM");
		lhs2.add("Data driven");
		lhs2.add("Test");
		lhs2.add("Java");
		lhs1.add(null);
		
		
		System.out.println(lhs1);
		System.out.println(lhs2.size());
		
		System.out.println("*****************");
		
		
		LinkedHashSet lhs3=new LinkedHashSet();
		
		lhs3.add("Test");
		lhs3.add("Selenium");
		lhs3.add("POM");
		lhs3.add("Data driven");
		lhs3.add("Test");
		lhs3.add("Java");
		
		lhs3.remove("Java");
		
		for (Object obj2 : lhs3) {
			System.out.println(obj2);
		}
		
		
		System.out.println("*****************");
		
		LinkedHashSet lhs4=new LinkedHashSet();
			
		lhs4.add("Test");
		lhs4.add("Selenium");
		lhs4.add("POM");
		lhs4.add("Data driven");
		lhs4.add("Test");
		lhs4.add("Java");
		lhs4.add("Node-JS");
		
			System.out.println(lhs4.contains("POMS"));
			
			System.out.println("*****************");
			
			LinkedHashSet lhs5=new LinkedHashSet();
			
			lhs5.add("Test");
			lhs5.add("Selenium");
			lhs5.add("POM");
			lhs5.add("Data driven");
			lhs5.add("Test");
			lhs5.add("Java");
			
			
			lhs5.addAll(lhs4);
			
			for (Object obj3 : lhs5) {
				System.out.println(obj3);
			}
			
			System.out.println("********************");
			
			LinkedHashSet lhs6=new LinkedHashSet();
			
			lhs6.add("Test");
			lhs6.add("Selenium");
			lhs6.add("POM");
			lhs6.add("Data driven");
			lhs6.add("Test");
			lhs6.add("Java");
			
			System.out.println(lhs6.isEmpty());
			
			System.out.println("********************");
			

			LinkedHashSet lhs7=new LinkedHashSet();
			
			lhs7.add("Test");
			lhs7.add("Selenium");
			lhs7.add("Test1");
			lhs7.add("Selenium2");
			
			System.out.println(lhs7.retainAll(lhs6));
			
			for (Object obj5 : lhs7) {
				
				System.out.println(obj5);
			
			
		}
			
			System.out.println("********************");
			
			
		
	



		
	}

}
