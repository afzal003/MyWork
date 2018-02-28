package arrayBasics;

public class HasA {
	static Demo d1=new Demo(); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Demo d=new Demo();
d.t.display();
Demo.t.display();
HasA.d1.screen();
	}

}
class Testing
{
	void display()
	{
		System.out.println("test class");
	}
}
class Demo
{
    static Testing t=new Testing();
	//static Demo d1=new Demo();
	void screen()
	{
		System.out.println("demo");
	}
	
}
