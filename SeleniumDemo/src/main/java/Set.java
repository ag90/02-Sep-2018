import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {


	         HashSet set=new HashSet();
	         set.add("INDIA");
	         set.add("USA");
	         set.add("UK");
	         set.add("RUSSIA");
	         set.add("CHINA");
	         set.add("INDIA");
	         set.add(null);
	        
	         
	         System.out.println(set);
	         
	         for (Object object : set) {
				System.out.println(object);
			}
	         System.out.println("**************");
	         
	         LinkedHashSet lhs=new LinkedHashSet();
	         lhs.add("INDIA");
	         lhs.add("USA");
	         lhs.add("UK");
	         lhs.add("RUSSIA");
	         lhs.add("CHINA");
	         lhs.add(null);
	         
	         for (Object lefthandside : lhs) {
				System.out.println(lefthandside);
			}
	         
	         System.out.println("**************");
	         
	         TreeSet tset=new TreeSet();
	         tset.add("INDIA");
	         tset.add("USA");
	         tset.add("UK");
	         tset.add("RUSSIA");
	         tset.add("CHINA");
	         tset.add(null);
	         
	         for (Object righthandside : tset) {
				
	        	 System.out.println(righthandside);
			}
	}

}
