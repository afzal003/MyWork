package javabasics;

public class DataVariables {
int a=1;
static int b=2;
final static int c=3;
public final static int d=4;
int add(int e,final int f)
{
	int g=7;
	//c=30;
	//f=40;
	final int h=8;
	int i=a+b+c+d+e+f+g+h;
	System.out.println(i);
	return i;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataVariables dv=new DataVariables();
		dv.a=5;
		dv.add(5,6);
		dv.add(5,5);
		//System.out.println(dv.f);
		//dv.c=4;
		//dv.e=5;
	}

}


//note: static data variable can be used in non-static function....
//non-static data variable can't be used in static function....