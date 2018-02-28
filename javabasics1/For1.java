package javabasics1;

public class For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i;
		for(int i=1;i<=100;i++);//statement terminates here because of semicolon
		{
			System.out.println(i);//i cannot be resolved to a variable
		}

	}

}


// IN THIS CASE.. IT WILL PRODUCE OUTPUT AS 101...

/* int i=1;
 for(i=1;i<=100;i++);//statement terminates here because of semicolon
{
	System.out.println(i);//i cannot be resolved to a variable
}*/