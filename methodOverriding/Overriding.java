package methodOverriding;
class Override{
private void add1()
{
	int a=4;
	int b=6;
	int c=a+b;
	System.out.println(c);
}
}
class Over extends Override{
protected void add() // PRIVATE IS NOT INHERITED...
{
	int a=24;
	int b=16;
	int c=a+b;
	System.out.println(c);	
}
}
public class Overriding extends Over {
	
	public void add()
	{
		int a=14;
		int b=16;
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding obj=new Overriding();
		//obj.add2();
		obj.add();
		//obj.add1();
		//obj.add();
		Over a=new Over();
		a.add();
		//a.add1(); The method add1() from the type Override is "not visible"
	}
	

}


//METHOD OVERRIDING USING ALL THE ACCESS SPECIFIERS