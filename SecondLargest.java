package javaBasicprgrms;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//int n=3;
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int largest = arr[0];
		int secondLargest = arr[0];
		//System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} 
			else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
 
	}

}
