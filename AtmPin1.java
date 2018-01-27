package javaBasicprgrms;

import java.util.Scanner;

public class AtmPin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter ur pin ");
		Scanner s= new Scanner(System.in);
	    int x=s.nextInt();
	    int count=0;
	    //int y = 0;
	    while(count<3){
	    	System.out.println("enter the pin to withdraw ");
	    	int y=s.nextInt();
	    if(x==y) {
	    	System.out.println("enter the amount");
	    	break;
	    }
	    else {
	    	System.out.println("incorrect pin...");
	    	count++;
	    }
	    }
	    if(count==3){
	    	System.out.println("sorry...try tommorow...");
	    }
	}
}
