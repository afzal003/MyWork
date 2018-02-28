package encapsulation;

public class Understand {
	private int a;//not visible to any other class
	
	public int getA() {
		System.out.println(a);
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	int add()
	{
	int c=getA()+5;
	System.out.println(c);
	return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Understand prv=new Understand();
prv.setA(10);
prv.getA();
prv.add();
	}

}
