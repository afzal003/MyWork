package abstract1;

abstract class Excrse1{
	static int a=4;
	static void add()
	{
		int a=4;
		int b=a+2;
System.out.println(b);// METHOD TERMINATE
	}
	static void sub()
	{
		int a=4;
				int b=a-2;
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exc1 obj=new Exc1();
		System.out.println(a);
		//System.out.println(obj.b);
	add();
	sub();
}
}

/*public class Excrse1 extends Exc1{

	int b=8;
	
	void sub()
	{
		int a=4;
		int b=a-1;
	System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excrse1 obj=new Excrse1();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.add();
		obj.sub();

	}

}*/
