package DemoSet;

import java.util.HashSet;

public class HashSetConcept {

	public static void main(String[] args) {


		HashSet set=new HashSet();
		
		set.add("AVI");
		set.add("GUPTA");
		set.add("QA");
		set.add("HCL");
		set.add("NOIDA");
		set.add("QA");
		set.add(null);
		
		
		
		for (Object object : set) {
			System.out.println(object);
		}
		
		System.out.println("************************************");
		
	    HashSet set1=new HashSet();
		
		set1.add("AVI");
		set1.add("GUPTA");
		set1.add("QA");
		set1.add("HCL");
		set1.add("NOIDA");
		set1.add("QA");
		set1.add(null);
		
		System.out.println(set1.size());
		
        System.out.println("************************************");
		
	    HashSet set2=new HashSet();
		
		
		set2.add("GUPTA");
		set2.add("QA");
		set2.add("HCL");
		set2.add("NOIDA");
		set2.add("QA");
		set2.add(null);
		
		System.out.println(set2.contains("null"));
		
		
		System.out.println("************************************");
		
        HashSet set3=new HashSet();
		
		
		set3.add("GUPTA");
		set3.add("QA");
		set3.add("HCL");
		set3.add("NOIDA");
		set3.add(null);
		
		System.out.println(set3.size());
		System.out.println(set3.remove("GUPTA"));
		System.out.println(set3.size());
		
		for (Object object1 : set3) {
			System.out.println(object1);
		}
		
		System.out.println("************************************");

		HashSet set4=new HashSet();
		
		set4.add("GUPTA");
		set4.add("QA");
		set4.add("HCL");
		set4.add("NOIDA");
		set4.add(null);
		
		System.out.println(set4.isEmpty());
		
		System.out.println("************************************");
		
		
		
		
		
		
	
		
		
		
		
		
		
	}

}
