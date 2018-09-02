package List;

public class LinkedList {

	public static void main(String[] args) {
		
		java.util.LinkedList ll=new java.util.LinkedList();
		
		//1.to add the element in linked-list
		ll.add("Jenkins");
		ll.add("Selenium");
		ll.add("Maven");
		ll.add("Test");
		ll.add("Jenkins");
		ll.add("GitHub");
		
		for (Object link : ll) {
			System.out.println(link);
		}
		
		System.out.println("*******************");
		
        java.util.LinkedList ll2=new java.util.LinkedList();
		
		//2.to check the size of linked-list
		ll2.add("Test");
		ll2.add("Selenium");
		ll2.add("Maven");
		ll2.add("Test");
		
		System.out.println(ll2.size());
		
		System.out.println("*******************");
		
         java.util.LinkedList ll3=new java.util.LinkedList();
		
		//3.to fetch the specific element of linked-list on the basis of index
		ll3.add("Test");
		ll3.add("Selenium");
		ll3.add("Maven");
		ll3.add("Test");
		
		System.out.println(ll3.get(3));
		
		System.out.println("*******************");
		
		//4.to remove the element from linked-list on the basis of index
		 java.util.LinkedList ll4=new java.util.LinkedList();
		 
		    ll4.add("Selenium");
			ll4.add("Maven");
			ll4.add("Test");
			ll4.add("Jenkins");
			ll4.add("GitHub"); 
		 
		 ll4.remove(2);
		 
		 for (Object linked : ll4) {
			System.out.println(linked);
		}

		 System.out.println("*******************");
		 
		 //5.to add the element on the first index of linked-list
		 
		 java.util.LinkedList ll5=new java.util.LinkedList();
		 
		    ll5.add("Selenium");
			ll5.add("Maven");
			ll5.add("Test");
			ll5.add("Jenkins");
			ll5.add("GitHub"); 
			
			ll5.addFirst("Page Object Model");
			
			for (Object LOL : ll5) {
				System.out.println(LOL);
			}
			
			System.out.println("*******************");
			
			//6.to add the element on the last index of linked-list
			
			 java.util.LinkedList ll6=new java.util.LinkedList();
			 
			    ll6.add("Selenium");
				ll6.add("Maven");
				ll6.add("Test");
				ll6.add("Jenkins");
				ll6.add("GitHub"); 
				
				ll6.addLast("Data Driven");
				
				for (Object LIK : ll6) {
					System.out.println(LIK);
				}
				
				System.out.println("*******************");
				
				//7.to remove the element on the first index of linked-list
				 java.util.LinkedList ll7=new java.util.LinkedList();
				 
				    ll7.add("Selenium");
					ll7.add("Maven");
					ll7.add("Test");
					ll7.add("Jenkins");
					ll7.add("GitHub"); 
					
					ll7.removeFirst();
					
					for (Object LIKe : ll7) {
						System.out.println(LIKe);
					}
				
					System.out.println("*******************");
					
					//8.to remove the element on the last index of linked-list
					 java.util.LinkedList ll8=new java.util.LinkedList();
					 
					    ll8.add("Selenium");
						ll8.add("Maven");
						ll8.add("Test");
						ll8.add("Jenkins");
						ll8.add("GitHub"); 
						
						ll8.removeLast();
						
						for (Object LOI : ll8) {
							System.out.println(LOI);
						}
						
						
						System.out.println("*******************");
						
						//9.to replace the element to another element on the basis of index
						 java.util.LinkedList ll9=new java.util.LinkedList();
						 
						    ll9.add("Selenium");
							ll9.add("Maven");
							ll9.add("Test");
							ll9.add("Jenkins");
							ll9.add("GitHub"); 
							
							ll9.set(0, "QTP");
							
							for (Object LO : ll9) {
								System.out.println(LO);
							}
							
							
							System.out.println("*******************");
		 
		

		
		
	}

}
