package arrayBasics;

public class EnhancedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5,6};
for(int i=0;i<a.length;i++)
{
if(a[i]==3||a[i]==4)
{
	a[i]=0;
}
if(a[i]==0)
{
	System.out.println(i);
}
}


	}

}
