package javabasics1;

import java.util.Scanner;

public class ForEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter the begining number");
int x=scan.nextInt();
System.out.println("enter the ending number");
int y=scan.nextInt();
for(int i=x;i<=y;i++)
{
	int z=i%2;
	if(z==0)
	{
		System.out.println(i);
	}
}
	}

}
