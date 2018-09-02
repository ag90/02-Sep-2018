package OOP;

public class StringConcept {

	public static void main(String[] args) {


		String Test=new String("QA");//Create string using by new keyword
		System.out.println(Test);
		

		String Java=new String("QA"+",Collection");// Create string by new keyword and we can declare multiple strings.
		System.out.println(Java);
		
		String Mall="DLF MALL"+",Sector-29"+30+60;//Create string without using new keyword and we can declare multiple strings.
		System.out.println(Mall);
		
		StringBuffer sb=new StringBuffer("String Array");//Create string by using new keyword
		System.out.println(sb);
		
		


		String GIP="SECTOR18";//Create string without using new keyword
		System.out.println(GIP);
		String GIP1="SECTOR18";//Here both object content same then JVM will not create new object its gives reference of existing object because in without using new keyword JVM always check prevois object.
		System.out.println(GIP1);
		
		String AttaMkt=new String("Sector-18");//Create string using by new keyword
		System.out.println(AttaMkt);
		String BrhamputraMkt=new String("Sector-18");//Here both object content same or different then JVM will create object because by using new keyword JVM never check prevois object.
		System.out.println(BrhamputraMkt);
		
		StringBuffer sk=new StringBuffer("String Array");//Here both object content same or different then JVM will create object because by using new keyword JVM never check prevois object.
		System.out.println(sk);
		StringBuffer pk=new StringBuffer("String Array");//Here both object content same or different then JVM will create object because by using new keyword JVM never check prevois object.
		System.out.println(pk);
		
		String str1="ratan";
		String str2="ratan";
		System.out.println(str1==str2); //true : because both object content are same without using new keyword so JVM give the reference to second object.
		
		String s1 = new String("anu");
		String s2 = new String("anu");
		System.out.println(s1==s2); //false : because JVM will create always new object using new keyword its never check prevoius object.
		
		StringBuffer sb1 = new StringBuffer("sravya");
		StringBuffer sb2 = new StringBuffer("sravya");
		System.out.println(sb1==sb2); //false : because JVM will create always new object using new keyword its never check prevoius object.
		
		
		
		String strio="ratan1";
		strio="Naveen";
		System.out.println(strio);//Naveen

		String str="ratan";
		str.concat("Soft");
		System.out.println(str);//ratan :String class object is immutable because modification is not allowed because string class doesnot have any method to modification
		System.out.println(str.concat("Gupta"));
		
		
		String s=new String("Alpha");
	    s.concat("beta");
        System.out.println(s);//Alpha :String class object is immutable because modification is not allowed because string class doesnot have any method to modification.
        
		String s11=new String("Alpha");
	    String fork= s11.concat("beta");
        System.out.println(fork);//alphabeta

        
        
        StringBuffer strbuf=new StringBuffer("AVI");
        System.out.println(strbuf.append("GUPTA"));
        
        StringBuffer stringbuffer=new StringBuffer("HCL");
        System.out.println(stringbuffer.append("TECH."));
        
        
        
        String Gale="Gale Tech";
        String Inox="Gale Tech";
        System.out.println(Gale.equals(Inox));//true
        System.out.println(Gale==Inox);//true

        String hindu="India";
        String hind="Canada";
        System.out.println(hindu.equals(hind));//false
        System.out.println(hindu==hind);//false
        
        String array=new String("Time");
        String classes=new String("Time");
        System.out.println(array.equals(classes));//true
        System.out.println(array==classes);//false
        
        String array1=new String("Time");
        String classes1=new String("10PM");
        System.out.println(array1.equals(classes1));//false
        System.out.println(array1==classes1);//false
        
        StringBuffer buffer=new StringBuffer("AVI");
        StringBuffer String=new StringBuffer("AVI");
        System.out.println(buffer.equals(String));//false
        System.out.println(buffer==String);//false
        
        StringBuffer buffer1=new StringBuffer("AVI");
        StringBuffer String1=new StringBuffer("GUPTA");
        System.out.println(buffer1.equals(String1));//false
        System.out.println(buffer1==String1);//false
        
        
        System.out.println("****************************************");
        
        String test="JK";
        String sele="Birla";
        
        System.out.println(test.concat(sele));
        String jk=test.concat("Test");
        System.out.println(jk);
        
        String UI="  FrondEnd       ";
        System.out.println(UI.trim());
        
        
        
     
       
		
		
		
		
		
	}

}
