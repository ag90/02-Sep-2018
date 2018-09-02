package Set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {


		HashSet set1=new HashSet();
		
		set1.add("Test");
		set1.add("Selenium");
		set1.add("POM");
		set1.add("Data driven");
		set1.add("Test");
		set1.add("Java");
		
		
		for (Object obj1 : set1) {
			System.out.println(obj1);
		}
		
		System.out.println("*****************");
		
         HashSet set2=new HashSet();
		
		set2.add("Test");
		set2.add("Selenium");
		set2.add("POM");
		set2.add("Data driven");
		set2.add("Test");
		set2.add("Java");
		
		System.out.println(set2.size());
		
		System.out.println("*****************");
		
		
        HashSet set3=new HashSet();
		
		set3.add("Test");
		set3.add("Selenium");
		set3.add("POM");
		set3.add("Data driven");
		set3.add("Test");
		set3.add("Java");
		
		set3.remove("Java");
		
		for (Object obj2 : set3) {
			System.out.println(obj2);
		}
		
		
		System.out.println("*****************");
		
		  HashSet set4=new HashSet();
			
			set4.add("Test");
			set4.add("Selenium");
			set4.add("POM");
			set4.add("Data driven");
			set4.add("Test");
			set4.add("Java");
			set4.add("Node-JS");
		
			System.out.println(set4.contains("POMS"));
			
			System.out.println("*****************");
			
            HashSet set5=new HashSet();
			
			set5.add("Test");
			set5.add("Selenium");
			set5.add("POM");
			set5.add("Data driven");
			set5.add("Test");
			set5.add("Java");
			
			
			set5.addAll(set4);
			
			for (Object obj3 : set5) {
				System.out.println(obj3);
			}
			
			System.out.println("********************");
			
            HashSet set6=new HashSet();
			
			set6.add("Test");
			set6.add("Selenium");
			set6.add("POM");
			set6.add("Data driven");
			set6.add("Test");
			set6.add("Java");
			
			System.out.println(set6.isEmpty());
			
			System.out.println("********************");
			

            HashSet set7=new HashSet();
			
			set7.add("Test");
			set7.add("Selenium");
			set7.add("Test1");
			set7.add("Selenium2");
			
			System.out.println(set7.retainAll(set6));
			
			for (Object obj5 : set7) {
				
				System.out.println(obj5);
			
			
		}
			
			System.out.println("********************");
			
			
		
	}
	}


