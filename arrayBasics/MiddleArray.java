package arrayBasics;

//TO FIND MIDDLE NUMBER OF ARRAY

public class MiddleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		int x=0;
		int y=0;
		int z=0;
		if(a.length%2==0)// IF IT IS EVEEN... MIDLE NUMBER WILL BE TWO NUMBERS
		{
			 x=a.length/2;
			 y=x-1;
			 System.out.println(a[y]);
			 System.out.println(a[x]);
		}
		else// IF IT IS ODD... MIDLE NUMBER WILL BE ONE NUMBER
		{
			 z=(a.length/2);
			 System.out.println(a[z]);
		}

		
	}

}
