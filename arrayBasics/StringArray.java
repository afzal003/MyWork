package arrayBasics;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String[] a=new String[3];
for(int i=0;i<3;i++)
{
	a[i]=s.next();
}
//System.out.println(a[0].charAt(0));

for(int i=0;i<3;i++)
{
	for(int j=i+1;j<3;j++)
	{
	if(a[i].charAt(0)>a[j].charAt(0))
	{
		String temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
	
}
	System.out.println(a[i]);
	}


}
}

