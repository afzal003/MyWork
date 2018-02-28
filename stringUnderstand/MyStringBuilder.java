package stringUnderstand;

import java.util.Scanner;

public class MyStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		StringBuilder sb=new StringBuilder(s1);
		sb.delete(1, 2);// DELETE 2-1 = 1 
		System.out.println(sb);
		sb.append(" afzal");
		System.out.println(sb);
	}

}
