package methodOverriding;

class X{
	int sum()
	{
		int a=6;
		int b=4;
		int c=a+b;
		System.out.println(c);
		return c;
	}
}

class Y extends X{
	int add()
	{
		int a=3;
		int b=3;
		int c=a+b;
		System.out.println(c);
		return c;
		//values that we return are goes to compiler....
		//compiler is in JVM... we can't see the value in compiler....
		//so only we printing the value to see in our console(output display screen)
	}
	
}
public class StaticDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
X a=new X();
a.sum();
Y b=new Y();
b.sum();
b.add();
X a1=new Y();
a1.sum();
((Y) a1).add();
//Y b1=new X(); its not possible,
// in the above case,by default it supports only parent class...
//only after type casting it supports derived class...


	}

}
