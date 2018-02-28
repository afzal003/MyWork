package methodOverriding;

public class This1 {

	int a;
	int b;
	int c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		This1 obj=new This1();
		obj.add(5,6,7);
	}	



	private void add(int i, int j, int k) {
		// TODO Auto-generated method stub
		this.a=i;
		this.b=j;
		this.c=k;
		int d=a+b+c;
		System.out.println(d);
	}

}

