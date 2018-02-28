package javabasics;
//different no. of arguments with same data type & method
class Adder{
	static int add(int a,int b)
	{
		return a+b;
    }  
	static int add(int a,int b,int c) 
	{ 
		return a+b+c;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		//we are created static methods so that we don't need to create instance(object) for calling methods.
		System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(11,11,11));

	}

}
