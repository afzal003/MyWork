package javaBasicprgrms;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string");
		Scanner s= new Scanner(System.in);
	    String input=s.nextLine();
	    char[] ch=input.toCharArray();
	   int n=ch.length;
	   System.out.println(n);
	   for(int i=0;i<n;i++) {
		   if(ch[i]!=' ')
		   {
		   System.out.println(ch[i]);
		   }
	   }
	  char ch1[]= {'a','e','i','o','u'};
	  for(int i=0;i<ch1.length;i++) {
		   System.out.println(ch1[i]);
		   }
	  int count=0;
	  for(int i=0;i<n;i++) {
		  for(int j=0;j<ch1.length;j++) {
			  if(ch[i]==ch1[j])
			  {
				count++;
			  }
		  }  
	  }
	  System.out.println("the count of vowels is: "+count);
	   }
	}


