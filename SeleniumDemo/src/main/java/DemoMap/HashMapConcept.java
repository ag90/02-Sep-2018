package DemoMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {


		HashMap<Object, Object> hm=new HashMap<Object, Object>();
		
		hm.put(1, "SANTOSH");
		hm.put(2, "DEEPIKA");
		hm.put(3, "AMAN");
		hm.put(4, "AVI");
		hm.put(5, "RAHUL");
		hm.put(6, "ABHISHEK");
		hm.put(null, "MANU");
		hm.put(null, "VIVEK");
		hm.put(7, null);
		hm.put(8, null);
		hm.put(9, "THAKUR");
		
		
		for (Entry ent : hm.entrySet()){
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		
		
		System.out.println("*************************************************");
		
		
		HashMap hm1=new HashMap();
		
		hm1.put(1, "SANTOSH");
		hm1.put(2, "AMIT");
		hm1.put(3, "PRIYANKIT");
		hm1.put(4, "PUNEET");
		hm1.put(5, "MANOJ");
		
		System.out.println(hm1.get(5));
		
		
		System.out.println("*************************************************");
		
         HashMap hm2=new HashMap();
	    
	     hm2.put("E.A", "GAURAV");
	     hm2.put("S.A", "DEVIPAD");
	     hm2.put("G.PM", "RAJIV");
	     hm2.put("PM", "KRISHAN");
	     hm2.put("P.M", "MRIDUL");
	     hm2.put("E.A", "AMIT");
	     hm2.put(null, "MANISH");
	     
	     System.out.println(hm2.size());
	     
		 System.out.println("*************************************************");
		 
		 
		 HashMap hm3=new HashMap();
		 hm3.put("QA", "SUDHA");
		 hm3.put("B.DEV", "NITESH");
		 hm3.put("QA.L", "RAMAN");
		 hm3.put("T.M", "AMIT");
		 hm3.put("S.L", "MANOJ");
		 
		 System.out.println(hm3.containsKey("QA.L"));
		 
		 System.out.println("*************************************************");

		 HashMap<Object,Object> hm4=new HashMap<Object,Object> ();
		 hm4.put("QA", "SUDHA");
		 hm4.put("B.DEV", "NITESH");
		 hm4.put("QA.L", "RAMAN");
		 hm4.put("T.M", "AMIT");
		 hm4.put("S.L", "MANOJ");
		 
		 hm4.values();
		 
		 
		 for (Entry ent1 : hm4.entrySet()) {
			System.out.println(ent1.getKey()+" - "+ent1.getValue());
		}
		 
		 System.out.println("*************************************************");

		 
		 HashMap<Object,Object> hm5=new HashMap<Object,Object> ();
		 hm5.put("QA", "SUDHA");
		 hm5.put("B.DEV", "NITESH");
		 hm5.put("QA.L", "RAMAN");
		 hm5.put("T.M", "AMIT");
		 hm5.put("S.L", "MANOJ");
		 
		
		 hm5.remove("T.M");
		 
		 for (Entry ent2 : hm5.entrySet()) {
			 
			System.out.println(ent2.getKey()+" - "+ent2.getValue());
		}
		 
		 System.out.println("*************************************************");
		 
		 HashMap<Object,Object> hm6=new HashMap<Object,Object> ();
		 hm6.put("QA", 15);
		 hm6.put("B.DEV", 22);
		 hm6.put("F.DEV",8 );
		 hm6.put("DEV.OOPS", 1);
		 hm6.put("TOOL.M", 2);
		 
		 System.out.println(hm6.isEmpty());
		 
		 System.out.println("*************************************************");
		 
		 
		 HashMap<Object,Object> hm7=new HashMap<Object,Object> ();
		 hm7.put("QA", 15);
		 hm7.put("B.DEV", 22);
		 hm7.put("F.DEV",8 );
		 hm7.put("DEV.OOPS", 1);
		 hm7.put("TOOL.M", 2);
		 
		 System.out.println( hm7.equals(hm6));
		 hm7.replace("F.DEV", 12);
		
		 
		 
		 for (Entry ent5 : hm7.entrySet()) {
			 
			 System.out.println(ent5.getKey()+" - "+ent5.getValue());
			
		}
		 
		 
		 

	     
	     
	     
		
	}
	
	
	    

}
