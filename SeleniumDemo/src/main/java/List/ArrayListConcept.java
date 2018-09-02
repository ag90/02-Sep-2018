package List;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {


		ArrayList ar1=new ArrayList();
		
		//1.to add the element in array list
		ar1.add("Test");//0
		ar1.add("DOM");//1
		ar1.add("Selenium");//2
		ar1.add('R');//3
		ar1.add(100);//4
		ar1.add(99.20);//5
		
		System.out.println(ar1);
		
		System.out.println("********************");
		
		
		ArrayList ar2=new ArrayList();
		
		ar2.add("Data Configuration");
		ar2.add("Page Object Model");
		
		//2.to check the size of array list
		System.out.println(ar2.size());
		
		System.out.println("***********************");
		
         ArrayList ar3=new ArrayList();
		
		ar3.add("Test");//0
		ar3.add("DOM");//1
		ar3.add("Selenium");//2
		ar3.add('R');//3
		ar3.add(100);//4
		ar3.add(99.20);//5
		
		
		//3.to fetch the specific element of array list on the basis of index
		System.out.println(ar3.get(1));
		
		System.out.println("***********************");
		
        ArrayList ar4=new ArrayList();
		
		ar4.add("Test");//0
		ar4.add("DOM");//1
		ar4.add("Selenium");//2
		ar4.add('R');//3
		ar4.add(100);//4
		ar4.add(99.20);//5
		
		//4.to remove the element from array list on the basis of index
		ar4.remove(5);
		
		for(int i=0;i<ar4.size();i++)
		{
			System.out.println(ar4.get(i));
		}
		
		System.out.println("***********************");
		
	    ArrayList ar5=new ArrayList();
		ar5.add("Data Configuration");
		ar5.add("Page Object Model");
		
		//5.to verify whether the array list is empty or not.
		System.out.println(ar5.isEmpty());
		
		
		System.out.println("***********************");
		
	    ArrayList ar6=new ArrayList();
		
			ar6.add("Test");//0
			ar6.add("DOM");//1
			ar6.add("Selenium");//2
			ar6.add('R');//3
			ar6.add(100);//4
			ar6.add(99.20);//5
			
			 ArrayList ar7=new ArrayList();
				ar7.add("Data Configuration");
				ar7.add("Page Object Model");
		
				//6.to combine the one array list into another array list.
				ar6.addAll(ar7);
				
				for (Object obj : ar6) {
					
					System.out.println(obj);
				}
				

				System.out.println("***********************");
				
			    ArrayList ar8=new ArrayList();
				
					ar8.add("Test");//0
					ar8.add("DOM");//1
					ar8.add("Selenium");//2
					ar8.add('R');//3
					ar8.add(100);//4
					ar8.add(99.20);//5
					
					//7.to verify whether the element is exist or not in the array list
					System.out.println(ar8.contains("DO"));
					
					System.out.println("***********************");
					
					ArrayList ar9=new ArrayList();
					
					ar9.add("Test");//0
					ar9.add("DOM");//1
					ar9.add("Selenium");//2
					ar9.add('R');//3
					ar9.add(100);//4
					ar9.add(99.20);//5
					
					 ArrayList ar10=new ArrayList();
						ar10.add("DOM");
						ar10.add("Page Object Model");
						ar10.add('R');
					
					//8.to print the common element between two array list.
					System.out.println(ar9.retainAll(ar10));
					
					for (Object obj : ar9) {
						
						System.out.println(obj);
					}
					
					
					System.out.println("******************");
					
					
				
				
		
	}

}
