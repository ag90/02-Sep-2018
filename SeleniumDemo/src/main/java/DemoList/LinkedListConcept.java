package DemoList;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {


		LinkedList ll=new LinkedList();
		ll.add("DR.KK GUPTA");
		ll.add("DR.VIVEK GUPTA");
		ll.add("DR.SHASHANK GUPTA");
		ll.add("DR.NEHA GUPTA");
		ll.add("DR.SHASHANK GUPTA");
		
		for (Object ele : ll) {
			System.out.println(ele);
		}
		
		System.out.println("**********************************************");
		
		LinkedList ll2=new LinkedList();
		ll2.add("Nursury");
		ll2.add("LKG");
		ll2.add("UKG");
		ll2.add("1st");
		
		System.out.println(ll2.get(3));
		
		
		System.out.println("***********************************************");
		
		LinkedList ll3=new LinkedList();
		ll3.add("Dr. Lal Path");
		ll3.add("SRL Digno.");
		ll3.add("Narayan Path");
		ll3.add("Parak Path");
		ll3.add("Dr. Lal Path");
		ll3.add("SRL Digno.");
		
		System.out.println(ll3.size());
		

		System.out.println("***********************************************");
		
		LinkedList ll4=new LinkedList();
		ll4.add("Hcl");
		ll4.add("Infosys");
		ll4.add("TCS");
		ll4.add("CDEC");
		
		System.out.println(ll4.isEmpty());
		
        System.out.println("***********************************************");
		
		LinkedList ll5=new LinkedList();
		ll5.add("TCS");
		ll5.add("Selenium beginner");
		ll5.add("TCS");
		ll5.add("Selenium expert");
		
		ll5.addAll(ll4);
		
		for (Object ele2 : ll5) {
			System.out.println(ele2);
		}
		
        System.out.println("***********************************************");

    	LinkedList ll6=new LinkedList();
		ll6.add("IRON");
		ll6.add("COPPER");
		ll6.add("STEEL");
		ll6.add("ALUMINIUM");
		
		System.out.println(ll6.contains("STEE"));
		
		System.out.println("***********************************************");

    	LinkedList ll7=new LinkedList();
		ll7.add("IRON");
		ll7.add("COPPER");
		ll7.add("STEEL");
		ll7.add("ALUMINIUM");
		
		ll7.removeFirst();
		
		for (Object ele3 : ll7) {
			System.out.println(ele3);
		}
		
		System.out.println("***********************************************");

		
		LinkedList ll8=new LinkedList();
		ll8.add("JK");
		ll8.add("MP");
		ll8.add("UP");
		ll8.add("RJ");
		
		
		System.out.println(ll8.removeFirstOccurrence("RK"));
		
        System.out.println("***********************************************");

		
		LinkedList ll9=new LinkedList();
		ll9.add("INDIA");
		ll9.add("USA");
		ll9.add("UK");
		ll9.add("CHINA");
		
		ll9.set(3, "RUSSIA");
        
		for (Object ele4 : ll9) {
			System.out.println(ele4);
		}
		
		
		
	}
	
	
	


}