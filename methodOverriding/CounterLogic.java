package methodOverriding;

public class CounterLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int a[]= {0,10,100,10,20,10};
		for(int i:a)//for(int j=0;j<a.length;j++)
		{
			if(i==10)//if(a[j]==10)
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
