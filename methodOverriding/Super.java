package methodOverriding;

class X1
{
	double roi=2.0;
}
class Y1 extends X1
{
	double x=super.roi;
	
	static double roi=3.0;//method override
	void rate()
	{
		System.out.println(roi);
		System.out.println(super.roi);
	}
}
public class Super extends Y1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// super cannot be used in static context
		
		//static instance can be called only by class name/not by super keyword 
		double roi=4.0;
Y1 y=new Y1();
y.rate();
	}

}
