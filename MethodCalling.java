package javaBasicprgrms;

import java.util.Scanner;

public class MethodCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodCalling casio=new MethodCalling();
		//int a=casio.add();
		//casio.add();
		System.out.println(casio.add());
	}

	public int add() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a+b;
		//System.out.println(c);
		return c;
	}

}
