package methodOverriding;

class A1{
	void fun()
	{
		System.out.println("hi");
	}
}

class B1 extends A1{
	// class A1 method fun() inherits in class B1 
	// method overriding occurs because both the class has the same function & same parameter 
	//method overloading does not occurs because both the class has the same function & same parameter
	void fun()
	{
		System.out.println("hello");	
	}
}

public class C extends B1 {
	void fun()
	{
		System.out.println("hey");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A1 a=new A1();
a.fun();
B1 b=new B1();
b.fun();
C c=new C();
c.fun();
	}

}
