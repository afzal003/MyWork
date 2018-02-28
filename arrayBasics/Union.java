package arrayBasics;

import java.util.Scanner;

public class Union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of elements for A");
		
		int m=s.nextInt();
		System.out.println("enter the no of elements for B");
		int n=s.nextInt();
		int a[]=new int[m];
		int b[]=new int[n];
System.out.println("enter the elements to A array");
for(int i=0;i<m;i++)
{
	System.out.println("enter"+i+"index of A element");
	a[i]=s.nextInt();
}
System.out.println("enter the elements to B array");
for(int i=0;i<n;i++)
{
	System.out.println("enter"+i+"index of B element");
	b[i]=s.nextInt();
}

int c[]=new int[a.length+b.length];
for(int i=0;i<a.length;i++)
{
	c[i]=a[i];
}
int k=0;
for(int j=a.length;j<a.length+b.length;j++)
{
	c[j]=b[k];
	k++;
}

for(int i:c)
{
	System.out.print(i+ " ");
}
System.out.println(" ");
int d[]=new int[c.length];
for(int i=0;i<c.length;i++)
{
	d[i]=c[i];
}

for (int i = 0; i < c.length; i++)
{
	for (int j = i + 1; j < c.length; j++)
	{
		if (c[i] == d[j]) 
		{
			System.out.println(i+"th index is"+c[i]);
			d[i] = 0;
		}
	}

}


int temp;
for (int i = 0; i < d.length; i++)
{
	for (int j = 0; j < d.length; j++)
	{
		if (d[i] < d[j]) 
		{
			temp=d[i];
			d[i]=d[j];
			d[j]=temp;
		}
	}

}
System.out.println();

for(int i=0;i<d.length;i++)
{
	if(d[i]!=0)
	System.out.print(d[i]+ " ");
}
System.out.println("");
System.out.println(d.length);

	}

}
