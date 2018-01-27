package javaBasicprgrms;
import java.util.Scanner;
public class Factorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,fact=1;
System.out.println("enter the number to find factorial");
Scanner s=new Scanner(System.in);
num=s.nextInt();
if(num<0)
	System.out.println("number cannot be negative");
else
	{
	for(int i=1;i<=num;i++)
		fact=fact*i;
	System.out.println("factorial of given number is "+fact);
}
}
	}
