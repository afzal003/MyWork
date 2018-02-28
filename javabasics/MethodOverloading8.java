package javabasics;

public class MethodOverloading8 {
	 int add(int a,int b,int c)
	{
		 int d=a+b+c;
		System.out.println(d);
		 
		return d;
	}
	 int add(int a,long b,long c)
	{
		System.out.println("xyz");
		return 0;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading8 n=new MethodOverloading8();
		System.out.println(n.add(1, 2, 3));
		n.add(1, 2l, 3l);
		n.add(1, 2, 3l);

	}

}
