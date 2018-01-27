package javaBasicprgrms;

import java.util.Scanner;

public class MethodOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading1 casio=new MethodOverloading1();
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(casio.add(a,b));
		System.out.println(casio.add());
	}
	private int add(int j, int k) {
		// TODO Auto-generated method stub
		int c=j+k;
		return c;
	}
	private int add()
	{
		//int d=casio.add(a,b);
		int a=4;
		int b=2;
				int c=a+b;
				return c;
	}

}
