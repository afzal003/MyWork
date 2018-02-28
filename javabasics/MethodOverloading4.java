package javabasics;

public class MethodOverloading4 {
	  public int add(int a,int b)
	{
		System.out.println("x");
		return b;
	}
 private static float add(int a,int b,int c)
	{
		System.out.println("xyz");
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MethodOverloading4.add(10,11,12));	

	}

}

//why it is showing the error....
	// i had declared one add method as non-static and another as static....
	// just skip the non-static one & choose the static one to perform the function and give me the result

//because of advance edition....
//its running/executing the program though it shows a compile time error....