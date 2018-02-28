package methodOverriding;
//parent class
class A{
	int var1() {
	int a=5;
	return a;
}
}
//intermediate class
class B extends A{
	int var2() {
		int b=8;
		return b;
	}
}
//child class
public class MultilevelInheritence extends  B {
	int var3()
	{
		int c=12;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method
		MultilevelInheritence mi=new MultilevelInheritence();
		System.out.println(mi.var1());
		System.out.println(mi.var3());
		System.out.println(mi.var2());
		
	}

}
