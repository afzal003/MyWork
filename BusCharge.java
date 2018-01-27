package javaBasicprgrms;

import java.util.Scanner;

public class BusCharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the old bus charge");
		Scanner s= new Scanner(System.in);
	    int n=s.nextInt();
	    int[] Obus=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	Obus[i]=s.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println(Obus[i]);
	    }
	    System.out.println("enter the new bus charge");
	    int[] Nbus=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	Nbus[i]=s.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println(Nbus[i]);
	    }
	    //int diff;
	    int[] diff=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	if(Obus[i]<Nbus[i])
	    	{
	    		diff[i]=Nbus[i]-Obus[i];
	    	}
	    }
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println(Nbus[i]+"-"+Obus[i]+":"+diff[i]);
	    }   
	}

}
