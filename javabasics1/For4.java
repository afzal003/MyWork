package javabasics1;

public class For4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i>=1;i--)//outer loop
		{
			for(int j=1;j<=100;j++)//inner loop
			{
				if(i==j)
				{
					System.out.println(i+" "+j);
				break;	
				}
				//System.out.println(i+" "+j);
			}

	}

}
}
