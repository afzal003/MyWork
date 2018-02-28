package arrayBasics;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {7,17,27,37,47,57};
int temp;
for(int i=0;i<a.length/2;i++)// HALF OF LENGTH IS ENOUGH TO REVERSE... 
	//IF WE GO TILL END THEN THE REVERSE IS DONE TWO TIME... SO WE GET THE OUTPUT AS SAME NUMBER
{
	temp=a[i];
	a[i]=a[a.length-i-1];
	
	a[a.length-i-1]=temp;
}
//System.out.println(a[0]);
for(int i:a)
{
	System.out.println(i);
}
	}

}
