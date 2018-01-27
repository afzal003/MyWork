package javaBasicprgrms;

import java.util.Scanner;

class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading casio=new MethodOverloading();
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(casio.add(a,b));
	}
	//int add(int i, int j)
	//{
	//int c=i+j;
	//return c;
	//}

	private int add(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		return c;
	}

}
