package methodOverriding;

class Ride{
	 void fun()
	{
	System.out.println("x");	
	}
}

public class Overriding1 extends Ride {
	final void fun()
	{
	System.out.println("y");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding1 ov=new Overriding1();
		ov.fun();
	}

}


//STATIC - DEFAULT/PUBLIC/PROTECTED -> This instance(object/non-static) method cannot override the static method from Ride
//STATIC - STATIC -> OVERRIDE

//FINAL - FINAL -> Cannot override the final method from Ride
//FINAL - FINAL -> NOT OVERRIDE

//DEFAULT - STATIC -> This static method cannot hide the instance method from Ride
//DEFAULT - PRIVATE -> Cannot reduce the visibility of the inherited method from Ride

