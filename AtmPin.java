package javaBasicprgrms;

import java.util.Scanner;

public class AtmPin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter ur pin ");
		Scanner s= new Scanner(System.in);
	    int n=s.nextInt();
	    int pin[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    pin[i]=	s.nextInt();
	    }
	    System.out.println("enter ur pin to withdraw money ");
	    int pin1[]=new int[n];
	    int count=0;
	    if(count<3)
	    {
	      for(int i=0;i<n;i++)
	       {
	        pin1[i]=s.nextInt();
	       }
	    }
	    else {
	    	System.out.println("sorry...try tommorrow");
	    }
	    for(int i=0;i<n;i++)
	    {
	    if(pin[i]!=pin1[i])
	    {
	    count++;	
	    }
	    else if(pin[i]==pin1[i]){
	    	System.out.println("enter the amount ");
	    }
	    }
	    System.out.println(count);
	}
}
