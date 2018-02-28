package methodOverriding;

class A2{
	void fun()
	{
		System.out.println("hi");
	}
}

class B2 extends A2{
	/* class A2 method fun() inherits in class B2 
	 void fun()
	{
		System.out.println("hi");
	}
	now class B2 contains fun() & fun1()
	*/
	void fun1()
	{
		System.out.println("hello");	
	}
}


public class C1 extends B2 {
	/* class B2 method fun() & fun1() inherits in class C1
	 multilevel inheritance takes placed 
	 void fun()
	{
		System.out.println("hi");
	}
	void fun1()
	{
		System.out.println("hello");	
	}
//	now class c1 contains fun() , fun1() & fun2() 
	*/
	
	void fun2()
	{
		System.out.println("hey");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a=new A2();
		a.fun();
		B2 b=new B2();
		b.fun();
		C1 c=new C1();
		c.fun();
	}

}
