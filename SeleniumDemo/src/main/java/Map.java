import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.SortedMap;

public class Map {

	public static void main(String[] args) {


		HashMap<Object,Object> hm=new HashMap<Object,Object>();
		hm.put(2, "JavaScript");
		hm.put(1, "Selenium");
		hm.put("FrontEnd", "CSS");
		hm.put("OOP", "Java");
		hm.put("FrontEnd", "HTML");
		hm.put(null, null);
		hm.put(null, null);		
		hm.put(4, null);
		hm.put(5, null);
		
		
		System.out.println(hm);
		

		for (Entry entry : hm.entrySet()) {
			
			System.out.println(entry.getKey()+" "+entry.getValue());
			
			
		}
		
		HashMap<Object, Object> hmo=new HashMap<Object, Object>();
		hmo.put(1, "Avi");
		hmo.put(3, "Santosh");
		hmo.put(4, "Aman");
		hmo.put(2, "Kunal");
		
		
		System.out.println(hmo.get(7));
		
		for (Entry<Object, Object> ent : hmo.entrySet()) {
			
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		
		System.out.println(hmo.values());
		
		
		System.out.println(hmo.containsKey(2));
		
		
		System.out.println(hmo.isEmpty());
		
		System.out.println(hmo.remove(2));
		System.out.println(hmo);
		
		
		hmo.replace(3, "Rahul");
		System.out.println(hmo);
		
		
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(7, "UK");
		ht.put(4, "RJ");
		ht.put(1, "MP");
		ht.put(2, "AP");
		ht.put(5, "WB");
		//ht.put(null, null);
		
		
		
		for (Entry<Integer, String> enty : ht.entrySet()){
			
			System.out.println(enty.getKey()+" "+enty.getValue());
			
		}
		
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<Integer, String>();
		lhm.put(7, "UK");
		lhm.put(4, "RJ");
		lhm.put(1, "MP");
		lhm.put(2, "AP");
		lhm.put(5, "WB");
		
		System.out.println(lhm);
		
		
		
		
		
		
		  
		
		

	}

}
