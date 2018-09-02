package DemoMap;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableConcept {

	public static void main(String[] args) {


		Hashtable<Object,Object> ht=new Hashtable<Object,Object>();
		ht.put(4, "DEEPIKA");
		ht.put(1, "AVI");
		ht.put(2, "RAHUL");
		ht.put(5, "AMAN");
		ht.put(3, "SANTOSH");
		ht.put(7, "DEEPAK");
		ht.keySet();
		
		for (Entry ent : ht.entrySet()) {
			System.out.println(ent.getKey()+" "+ent.getValue());
			
		}
		
		System.out.println("***************************************");
		
		Hashtable<Object,Object> ht1=new Hashtable<Object,Object>();
		ht1.put(4, "DEEPIKA");
		ht1.put(1, "AVI");
		ht1.put(2, "RAHUL");
		ht1.put(5, "AMAN");
		ht1.put(3, "SANTOSH");
		ht1.put(7, "DEEPAK");
		
		System.out.println(ht1.get(5));
	
		System.out.println("***************************************");
	
		Hashtable<Object,Object> ht2=new Hashtable<Object,Object>();
		ht2.put(4, "DEEPIKA");
		ht2.put(1, "AVI");
		ht2.put(2, "RAHUL");
		ht2.put(5, "AMAN");
		ht2.put(3, "SANTOSH");
		ht2.put(7, "DEEPAK");
	
		System.out.println(ht2.containsKey(2));
		
		System.out.println("***************************************");
		
		Hashtable<Object,Object> ht3=new Hashtable<Object,Object>();
		ht3.put(4, "DEEPIKA");
		ht3.put(1, "AVI");
		ht3.put(2, "RAHUL");
		ht3.put(5, "AMAN");
		ht3.put(3, "SANTOSH");
		ht3.put(7, "DEEPAK");
		
		System.out.println(ht3.size());
		
		
		System.out.println("***************************************");

		Hashtable<Object,Object> ht4=new Hashtable<Object,Object>();
		ht4.put(4, "DEEPIKA");
		ht4.put(1, "AVI");
		ht4.put(2, "RAHUL");
		ht4.put(5, "AMAN");
		ht4.put(3, "SANTOSH");
		ht4.put(7, "DEEPAK");

		ht4.remove(2);
		
		for (Entry<Object,Object> ent2 : ht4.entrySet()) {
			
			System.out.println(ent2.getKey()+" "+ent2.getValue());
		}
		
		System.out.println("***************************************");

		Hashtable<Object,Object> ht5=new Hashtable<Object,Object>();
		ht5.put(4, "DEEPIKA");
		ht5.put(1, "AVI");
		ht5.put(2, "RAHUL");
		ht5.put(5, "AMAN");
		ht5.put(3, "SANTOSH");
		ht5.put(7, "DEEPAK");
		
		System.out.println(ht5.isEmpty());
		
		
		System.out.println("***************************************");

		Hashtable<Object,Object> ht6=new Hashtable<Object,Object>();
		ht6.put(4, "DEEPIKA");
		ht6.put(1, "AVI");
		ht6.put(2, "RAHUL");
		ht6.put(5, "AMAN");
		ht6.put(3, "SANTOSH");
		ht6.put(7, "DEEPAK");
		
		ht6.replace(7, "ANJALI");
		
		for (Entry<Object, Object> ent2 : ht6.entrySet()) {
			
			System.out.println(ent2.getKey()+" "+ent2.getValue());
			
		}
		
		
		System.out.println("***************************************");
		
		
		Hashtable<Object,Object> ht7=new Hashtable<Object,Object>();
		ht7.put(4, "DEEPIKA");
		ht7.put(1, "AVI");
		ht7.put(2, "RAHUL");
		ht7.put(5, "AMAN");
		ht7.put(3, "SANTOSH");
		ht7.put(7, "DEEPAK");
		
		System.out.println(ht7.equals(ht6));
		
		
		

		
		
		
		
	}
}
