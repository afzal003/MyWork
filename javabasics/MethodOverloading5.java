package javabasics;

public class MethodOverloading5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading5.add(5,10,15);
		MethodOverloading5.add(1,2l,3);
	}
	
	static void add(int i, int j, int k)
	{
		System.out.println("hi..");
	}
	static void add(int a,long b,int c)
	{
		System.out.println("bye...");
	}

}
