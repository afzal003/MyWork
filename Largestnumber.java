package javaBasicprgrms;

import java.util.Scanner;

public class Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//int n=3;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int max=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
for(int i=0;i<n;i++)
{
	if(max==a[i])
	{
		System.out.println(i);
	}
}

	}

}
