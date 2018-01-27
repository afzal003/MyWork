package javaBasicprgrms;
import java.util.Scanner;
public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the year");
		Scanner s=new Scanner(System.in);
		int yr=s.nextInt();
		if((yr%4==0)||(yr%400==0)&&(yr%100!=0))
		{
			System.out.println(yr + " is a leap year.");
		}
		else
		System.out.println(yr + " is not a leap year.");

	}

}
