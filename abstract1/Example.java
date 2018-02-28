package abstract1;

 abstract class Example1 {
abstract double calculateRate();// ENFORCEMENT = METHOD GETS TERMINATED

static void add()
{
	int a=4;
	int b=a*a;
	System.out.println(b);
}
}

public class Example extends Example1{
	
	double calculateRate()// SHOWS ERROR UNTILL THE METHOD IS GET ECLARED
	{
		System.out.println(0.0);
		return 0.0;
	}
	
	public static void main(String[] args) {
	Example a=new Example();
	a.calculateRate();
	a.add();
}
}
