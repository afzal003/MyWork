package javaBasicprgrms;

public class Namepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="afzal";
char[] name1=name.toCharArray();
for(int i=0;i<name.length();i++)
{
	for(int j=0;j<=i;j++)
	{
		System.out.print(name1[j]);
	}
	System.out.println();
}
	}

}
