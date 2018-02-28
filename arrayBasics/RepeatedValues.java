package arrayBasics;

import java.util.Scanner;

public class RepeatedValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the length");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
			{
				a[i]=s.nextInt();
			}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=0;
				}
			}
			System.out.println(a[i]);
		}
		//System.out.println();
		System.out.println();
		System.out.println("without repeated numbers:");
		for(int i=0;i<n;i++)
		{
			if(a[i]!=0)
			{
				System.out.println(a[i]);
			}
		}
		


	}

}
