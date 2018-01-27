package javaBasicprgrms;

import java.util.Scanner;

public class Buscharge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no of bus charge");
		Scanner s= new Scanner(System.in);
	    int n=s.nextInt();
	    int[] Obus=new int[n];
	    int[] Nbus=new int[n];
	    int[] diff=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	Obus[i]=s.nextInt();
	    	Nbus[i]=s.nextInt();
	    	if(Obus[i]<Nbus[i])
	    	{
	    		diff[i]=Nbus[i]-Obus[i];
	    	}
	    }
	    for(int i=0;i<n;i++) {
	    System.out.println(Nbus[i]+"-"+Obus[i]+":"+diff[i]);
	    }
	}
}
