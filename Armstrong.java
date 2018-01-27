package javaBasicprgrms;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int num=153;
		System.out.println("enter the number to check armstrong");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int num2 = num; 
int arm=0;
while(num>0)
{
	int rem=num%10;
	int res=rem*rem*rem;
	arm=arm+res;
	num=num/10;
}
System.out.println(arm);
if(num2==arm)
{
	System.out.println(num2+" is armstrong number");
}
else
	System.out.println(num2+" is not a armstrong number");
	}

}
