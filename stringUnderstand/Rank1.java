package stringUnderstand;

import java.util.Scanner;

public class Rank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=4;
		double d=4.0;
		String s="Hacker Rank";
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the int");
		int j=scan.nextInt();
		System.out.println("enter the double");
	    double e=scan.nextDouble();
	    System.out.println("enter the String");
	    String n=scan.nextLine();
	    n =n+scan.nextLine();
	i=i+j;
	d=d+e;
	s=s+n;
	System.out.println(i);
	System.out.println(d);
	System.out.println(s);
	//System.out.println(arg0);
	}

}
