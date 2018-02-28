package methodOverriding;

class R{
	 int a=6;
}
class S extends R{
	void dis()
	{
System.out.println(super.a);
	}
}
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
S s=new S();
s.dis();
	}

}



// WHILE INHERITING PRIVATE VARIABLES OR METHODS OF SUPER CLASS ARE NOT ACCESSED BY CHILD CLASS 