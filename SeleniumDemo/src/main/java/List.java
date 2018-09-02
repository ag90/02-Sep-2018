import java.util.ArrayList;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {


		ArrayList al=new ArrayList();
		al.add("Selenium");
		al.add("Java");
		al.add("Java Script");
		al.add("Selenium");
		
		System.out.println(al);//1
		
		for (Object obj : al) {
			System.out.println(obj);
		}
		
	      System.out.println(al.size());//2
	      
	      
	      System.out.println(al.get(2));
	      
	      al.remove(3);
	      
	      for (Object obj1 : al) {
			
	    	  System.out.println(obj1);
		}
	      
	      al.remove("Selenium");
	      
	      for (Object obj2 : al) {
			
	    	  System.out.println(obj2);
		}
	      
	      
		 System.out.println(al.isEmpty());
		 
		 
		 System.out.println(al.contains("Dr.Gupta"));
		
		 
		 
			ArrayList al1=new ArrayList();
			al1.add("Selenium");
			al1.add("Java");
			al1.add("Java Script");
			al1.add("Selenium");
			
			ArrayList al2=new ArrayList();
			al2.add("Selenium");
			al2.add("Java");
			
			System.out.println(al2.containsAll(al1));//al2 list will check the contains of al1
			
			
			al2.add(1, "Node JS");
			
			for (Object obj2 : al2) {
				System.out.println(obj2);
			}
			
			System.out.println(al2.retainAll(al1));
			
			for (Object obj3 : al2) {
				System.out.println(obj3);
			}
			
			al2.set(1, "Cross side scripting");
			
			for (Object obj4 : al2) {
				System.out.println(obj4);
			}
		
			LinkedList li=new LinkedList();
			
			li.add("Delhi");
			li.add("Agra");
			li.add("Noida");
			li.add("Pune");
			
			System.out.println(li.get(3));
			System.out.println(li.remove(2));
			System.out.println(li);
	}
	
	

}
