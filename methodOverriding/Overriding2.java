package methodOverriding;

class TocheckOverride
{
	int a=4;
	void add(int a,int c)
	{
		//int a=4;
		int b=a+2;
		System.out.println(b);
	}
}
public class Overriding2 extends TocheckOverride {
	int a1=8;
	void add(int a,int c)
	{
		int b=a+2;
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding2 obj=new Overriding2();
		System.out.println(obj.a);
		obj.add();
		obj.add(8);
	}
	
	
	// SAME METHOD NAME WITH SAME NO. OF PARAMETERS OR 

}
