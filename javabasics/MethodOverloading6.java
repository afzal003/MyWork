package javabasics;

public class MethodOverloading6 {

	public static void main(String[] args)//single array as argument
	{
		// TODO Auto-generated method stub
System.out.println("a");
main();
main();
//main(1,2);
	}
	public static void main()//no arguments
	{
		// TODO Auto-generated method stub
		System.out.println("b");
	}
	public static void main(String xyz)//string as argument
	{
		// TODO Auto-generated method stub
		System.out.println("c");
	}
	public static void main(String[] args,String[] xyz)//two arrays as argument
	{
		// TODO Auto-generated method stub
System.out.println("hii...");
	}
	
	//MethodOverloading6.main();
}


//method is overloading...
//