package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {


		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(1,"Naveen");
		hm.put(2,"Tom");
		hm.put(3,"Avi");
		hm.put(4,"Vibha");
		
		System.out.println(hm.size());

		System.out.println("**********1************");
		
        HashMap<Integer, String> hm1=new HashMap<Integer, String>();
		
		hm1.put(1,"Naveen");
		hm1.put(2,"Tom");
		hm1.put(3,"Avi");
		hm1.put(4,"Vibha");
		
		System.out.println(hm1.get(3));
		
		System.out.println("***********2***********");
		
        HashMap<String, String> hm2=new HashMap<String, String>();
		
		hm2.put("Selenium","Naveen");
		hm2.put("Java","Tom");
		hm2.put("Framework","Avi");
		hm2.put("Extends","Vibha");
		hm2.put("Methods","Aan");
		hm2.put("Collection","Nan");
		hm2.put("Array","JK");
		hm2.put("Sorting","MRF");
		hm2.put("Extends","Jordan");
		
		for (Entry ent : hm2.entrySet()) {
			
			System.out.println(ent.getKey()+" "+ent.getValue());
			
		}
		
        System.out.println("**********3************");
		
        HashMap<Integer, String> hm3=new HashMap<Integer, String>();
		
		hm3.put(1,"Mad");
		hm3.put(2,"Hot");
		hm3.put(3,"Avi");
		hm3.put(4,"Vibha");
		hm3.put(5,"Babu");
		hm3.put(10,"Sexy");
		
		hm3.remove(3);
		
             for (Entry ent1 : hm3.entrySet()) {
			
			System.out.println(ent1.getKey()+" "+ent1.getValue());
			
             }
			
			
			   System.out.println("*********4*************");
				
		        HashMap<Integer, String> hm4=new HashMap<Integer, String>();
				
		        hm4.put(7,"Otwani");
				hm4.put(1,"Akshay");
				hm4.put(2,"Tom");
				hm4.put(3,"Avi");
				hm4.put(4,"Vibha");
				hm4.put(8,"Naveen");
				
				hm4.putAll(hm3);
				
		             for (Entry ent11 : hm4.entrySet()) {
					
					System.out.println(ent11.getKey()+" : "+ent11.getValue());
			
		}
	}

	}

