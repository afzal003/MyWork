package arrayBasics;

public class Sorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 1, 2, 2, 3, 3 };
		int b[] = { 1, 1, 2, 2, 3, 3 };
		int temp;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[i] == b[j]) 
				{
					b[i] = 0;
				}
			}

		}
		
		for (int i : b) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if (a[i] > a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}

		}
		
		for (int i : a) {
			System.out.print(i + " ");
		}
		

	}

}
