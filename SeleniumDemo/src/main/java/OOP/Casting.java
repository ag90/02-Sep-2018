package OOP;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
byte i = 0;//8 bits		
int k=i;//int=32 bits this is up-casting and it is possible because we can put smallest size of data type into higher size of data type 


short d = 0;//16 bits
float h=d;//32 bits this is up-casting and it is possible because we can put in higher size of data type into smallest size of data type


int l = 0;//32 bits
byte j=(byte) l;//8 bits this is down casting here we have to down casting or by user not by compiler because we cannot put larger data type into smallest data type

float o=0;//32 bits
short v=(short)o;//16 bits this is down casting here we have to down casting or by user not by compiler because we cannot put larger data type into smallest data type



	}

}
