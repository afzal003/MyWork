package javabasics;

public class MyStatic {
	final double y=3.14;
int a=1;
static int x=2;
int add() {
	int b=a+x;
	return b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyStatic s=new MyStatic();
System.out.println(s.add());
x=100;
System.out.println(s.add());
x=1000;
System.out.println(s.add());
//a=6;
System.out.println(s.a);
s.a=8;
System.out.println(s.a);
System.out.println(s.add());
MyStatic s1=new MyStatic();
s1.a=12;
System.out.println(s.add());
System.out.println(s1.add());
System.out.println(s.y);
System.out.println(s1.y);
//s1.y=3.141;
System.out.println(s1.y);
	}

}
