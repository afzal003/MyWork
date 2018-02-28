package javabasics;

public class MethodOverloading7 {
	static void add(int a,int b,int c)
		{
			System.out.println("x");
		}
		static void add(long a,long b,long c)
		{
			System.out.println("xyz");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading7.add(1, 2, 3);
		MethodOverloading7.add(1, 2l, 3l);
		MethodOverloading7.add(1, 2, 3l);
	}

}
