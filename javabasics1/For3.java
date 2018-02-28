package javabasics1;

public class For3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=10;i++)//outer loop
{
	for(int j=1;j<=10;j++)//inner loop
	{
		if(i==j)
		{
			break;//breaks the inner loop
		}
		System.out.println(i+" "+j);
	}
	
}
	}

}
