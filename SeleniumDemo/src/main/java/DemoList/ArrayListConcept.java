package DemoList;

import java.util.ArrayList;

public class ArrayListConcept {
	
	

	public static void main(String[] args) {


		ArrayList list=new ArrayList();//Object of arraylist class.
		list.add("Java");//add method to add the element or object.
		list.add("Selenium beginner");
		list.add("Selenium expert");
		list.add("Xpath");
		list.add("Selenium expert");
		list.add(2000);
		
		
		System.out.println(list);//Directly we can print all the object in one shot.
		
		System.out.println("****************************************");
		
		for (Object ele : list) { //for-each-loop or advance loop to print the element one by one:here object is data-type and ele is a data-type of variable: All element will be store in the ele list
		   //Data-type variable : array or collection	
			System.out.println(ele);
		}
		
		System.out.println("****************************************");
		
		ArrayList list1=new ArrayList();
		list1.add("Dr. Lal Path");
		list1.add("SRL Digno.");
		list1.add("Narayan Path");
		list1.add("Parak Path");
		list1.add("Dr. Lal Path");
		list1.add("SRL Digno.");
		
		System.out.println(list1.size());//Size method to calculate the size of list1 element.
		
		
		System.out.println("****************************************");
		
		ArrayList list2=new ArrayList();
		list2.add("Hcl");
		list2.add("Infosys");
		list2.add("TCS");
		list2.add("CDEC");
		list2.add("DR.KK GUPTA");
		
		
		System.out.println(list2.get(2));//get(int index) method to fecth the particular element.
		
		System.out.println("****************************************");
		
		ArrayList list3=new ArrayList();
		list3.add("DR.KK GUPTA");
		list3.add("DR.VIVEK GUPTA");
		list3.add("DR.NEHA GUPTA");
		list3.add("DR.SHASHANK GUPTA");
		
		System.out.println(list3.contains("DR.RUCHI GUPTA"));//contains("element of list") method will check the element is present or not.
		
		
		System.out.println("****************************************");
		
		ArrayList list4=new ArrayList();
		list4.add("DR.KK GUPTA");
		list4.add("DR.VIVEK GUPTA");
		list4.add("DR.SHASHANK GUPTA");
		list4.add("DR.NEHA GUPTA");
		
		ArrayList list5=new ArrayList();
		list5.add("DR.KK GUPTA");
		list5.add("DR.VIVEK GUPTA");
		list5.add("DR.NEHA GUPTA");
		
		
		
		System.out.println(list5.containsAll(list4));//containsAll(list) method will check two list of element, if both of list element is same then true otherwise false.
		
		
		System.out.println("****************************************");
		
		
		ArrayList list6=new ArrayList();
		
		list6.add("Nursury");
		list6.add("LKG");
		list6.add("UKG");
		list6.add("1st");
		
		System.out.println(list6.isEmpty());
		
		System.out.println("****************************************");
		
        ArrayList list7=new ArrayList();
		
		list7.add("Nursury");
		list7.add("LKG");
		list7.add("UKG");
		list7.add("1st");
		
		list7.addAll(list5);
		
		for (Object object : list7) {
			System.out.println(object);
		}
		
		System.out.println("****************************************");
		
		
		 
		ArrayList list8=new ArrayList();
		
		list8.add("Nursury");
		list8.add("LKG");
		list8.add("UKG");
		list8.add("1st");
		
		list8.add(0, "Playgroup");
				
		for (Object object1 : list8) {
			
			System.out.println(object1);
		}
		
		System.out.println("****************************************");
		
		
        ArrayList list9=new ArrayList();
		
		list9.add("2nd");
		list9.add("3rd");
		list9.add("4th");
		list9.add("5th");
		
		list9.remove("5th");
		//System.out.println(list9.remove("9nd"));
		
          for (Object object2 : list9) {
			
			System.out.println(object2);
		}
          
          
  		System.out.println("****************************************");

  		
          ArrayList list10=new ArrayList();
  		
  		list10.add("5th");
  		list10.add("RK");
  		list10.add("NK");
  		list10.add("3rd");
  		
  		ArrayList list11=new ArrayList();
  		list11.add("5th");
  		list11.add("RK");
  		list11.add("NK");
  		list11.add("2nd");
  		
  		System.out.println( list10.retainAll(list11));
  	    list10.retainAll(list11);
  	   
         
  	  for (Object object3 : list10) {
			
			System.out.println(object3);
		}

  	  
  	System.out.println("****************************************");
  	
  	
      ArrayList list12=new ArrayList();
		
 		list12.add("1");
 		list12.add("2");
 		list12.add("3");
 		list12.add("4");
 		
 		
 	    list12.set(3, "Gupta JI");
 	   
        
 	  for (Object object3 : list12) {
			
			System.out.println(object3);
		}
  	  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
