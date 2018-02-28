package methodOverriding;

import java.util.Scanner;

public class CurrencyConvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the amount");
		Scanner scan=new Scanner(System.in);
		double inr=scan.nextDouble();
		double usd=inr/68;
		System.out.println("us dollar is "+usd+" usd");

	}

}
