package javaBasicprgrms;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number to check odd or even");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		//int num=20;
int res=num%2;
System.out.println("result is "+res);
if(res!=0)
	System.out.println("its the odd number");
else
	System.out.println("its the even number");
	}

}
