package methodOverriding;

class X2{
	int a=2,b=3,c=4;
	int funA()
	{
		System.out.println("hi");
		return 6;
	}
}
class Y2 extends X2{
	int x=4,y=5,z=7;
	int funB()
	{
		int x=8,y=9,z=10;
		int add=x+y+z+this.x+this.y+this.z+super.a+super.b+super.c;
		System.out.println("hello");
		System.out.println(add);
		super.funA();
		return add;
	}
}
class Z2 extends Y2{
	void funC()
	{
		System.out.println("bye..");
		super.funB();
	}
}
public class SuperMultilevelInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Z2 z=new Z2();
z.funC();
	}

}
