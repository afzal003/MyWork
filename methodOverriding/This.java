package methodOverriding;
class Abc{
	int a;
	int b;
	int c;
	int add(int a, int b, int c) {
		this.a=a;//in case of instance & local variables are differ
		this.b=b;//then we can make use of 'this' keyword
		this.c=c;
		int d=a+b+c+this.a+this.b+this.c;
		System.out.println(d);
		return d;
			
		}
}
public class This {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abc obj=new Abc();
		obj.add(5,6,7);

	}

	

}
