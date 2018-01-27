package javaBasicprgrms;

public class Fibonacci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0,b=1,count=10;
System.out.print(a+" "+b);
for(int i=2;i<count;i++)
{
	a=a+b;
	System.out.print(" "+a);
	//count--;
	b=a+b;
	System.out.print(" "+b);
	count--;
}
	}

}
