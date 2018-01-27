package javaBasicprgrms;

public class Reverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3010,rev=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem!=0)
			{
				rev=(rev*10)+rem;
			}
			num=num/10;
		}
System.out.println(rev);
	}

}
