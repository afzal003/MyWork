package arrayBasics;

public class RepeatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b=false;
		int a[]= {1,2,3,4,5,6,1,2,7};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
			{
			b=true;
			break;
			}
		}
		if(b==true)
		{
			System.out.println("1 is found");
		}

	}

}
