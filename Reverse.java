package javaBasicprgrms;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=301,rev=0,count=0;
		while(num>0)
		{
			count++;
			int rem=num%10;
			int res=rem%2;
			if((count==1)&&(res==1))
			{
				num=num/10;	
			}
			else
			{
				num=num/10;
				rev=(rev*10)+rem;
			}
		}
System.out.println(rev);
	}

}						
