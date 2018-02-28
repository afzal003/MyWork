package formulas;

public class HourAngle {

	static void calculateAngle(int h,int m)
	{
		int a=(int) (0.5*((60*h)-(11*m)));
		a=Math.abs(a);//to make it as positive value
		System.out.println(a);
		if(a>180)
		{
			a=360-a;
		}
		System.out.println(a);
	}
	
	static void tempConversion(double f)
	{
		double c=(f-32)*5/9;
		System.out.println(c+"c");
	}
	
	static long factorial(long n)
	{
		long a=1;//its a local variable,so initialization is required
		for(int i=1;i<=n;i++)
		{
			a=a*i;
			
		}
		System.out.println(a);
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateAngle(6,30);
		tempConversion(100);
		factorial(5);
	}

}
