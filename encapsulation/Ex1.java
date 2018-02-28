package encapsulation;

public class Ex1 {

	private int a;
	
	int add(int a)
	{
	this.a=a;//SET VALUE
	System.out.println("a is "+this.a);//GET VALUE
	return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Ex1 a=new Ex1();
a.add(10);
System.out.println(a.a);
	}

}
