package javabasics;
//same  no. of arguments & method,but with different data type.
class Adder1{
	static void add(int a,long b)
	{
		System.out.println("a,b is executed");	
    }  
	static void add(int i,double j) 
	{ 
		System.out.println("i.j is executed");
		//return i+j;
	}
	static int add(int k) 
	{ 
		return k;
	}
}

public class MethodOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adder1.add(11,11);
		Adder1.add(11,11.02);
		System.out.println(Adder1.add(11));

	}

}


