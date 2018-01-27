package javaBasicprgrms;

public class Reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121,rev=0;
		int num1=num;
		while(num>0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
System.out.println(rev);
if(num1==rev)
{
	System.out.println(num1+" is palindrome number");
}

	}

}
