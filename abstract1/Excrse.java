package abstract1;

abstract class Exc{
	int a=4;
	abstract void add();// METHOD TERMINATE
	void sub()
	{
		int a=4;
				int b=a-2;
		System.out.println(b);
	}
}

public class Excrse extends Exc{
	
	int b=8;
	
void sub()
{
	int a=4;
	int b=a-1;
System.out.println(b);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excrse obj=new Excrse();
		Exc ob=new Excrse();
		ob.add();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.add();
		obj.sub();
		
	}
	@Override
	void add() {
		// TODO Auto-generated method stub
		int a=4;
		int b=a*a*a;
		System.out.println(b);
	}

}
