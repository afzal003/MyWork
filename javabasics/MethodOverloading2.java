package javabasics;
//same method & no. of arguments... but different data type... 
class Adder2{  
static int add(int a, int b)
{
	return a+b;
}  
static double add(int a, double b)
{
	return (a+b);
}  
} 
public class MethodOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Adder2.add(11,11));  
		System.out.println(Adder2.add(12,12.3));  
	}

}
