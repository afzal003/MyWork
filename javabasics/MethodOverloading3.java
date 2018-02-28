package javabasics;

class Adder3{  
	
	  static void sum(int a,int b)
	  {
		  System.out.println("b method invoked");
		  
	  }  
	  
	  static  void sum(long a,int b)
		{
			System.out.println("a method invoked");
		}  
}
public class MethodOverloading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adder3.sum(10, 10);
		Adder3.sum(10l, 20);
	}

}

// though it is showing error in compile time...
// then how it is giving me the result during runtime...


//BECAUSE OF UPDATED EDITION 1.8