package stringUnderstand;

import java.util.Scanner;

public class StringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string");
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
//String name="afzal";
char c[]=new char[name.length()];
int count=0;
for(int i=0;i<c.length;i++)
{
	c[i]=name.charAt(i);
	if(c[i]=='a')
		count++;
	
}
/*for(int j=0;j<c.length;j++)
{
	if(c[j]=='a')
{
	count++;
}
}*/
System.out.println(count);
}

	}


