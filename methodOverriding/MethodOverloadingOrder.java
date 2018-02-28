package methodOverriding;
class ChangeOrder
{
static void check(String name,int id)
{
	System.out.println("name :"+name+" "+"id :"+id);
	
}
static void check(int id,String name)
{
	System.out.println("id :"+id+" "+"name :"+name);
}
}
public class MethodOverloadingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChangeOrder.check("hi",1);
		ChangeOrder.check(2,"bye");
	}

}



//METHOD OVERLOADING IS ALSO ACHIEVED THROUGH BY CHANGING THE ORDER OF THE PARAMETERS