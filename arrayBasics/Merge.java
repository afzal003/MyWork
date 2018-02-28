package arrayBasics;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3};
int b[]= {4,5,6};
int c[]=new int[a.length+b.length];
for(int i=0;i<a.length;i++)
{
	c[i]=a[i];
}
int k=0;
for(int j=a.length;j<a.length+b.length;j++)
{
	c[j]=b[k];
	k++;
}
for(int i:c)
{
	System.out.println(i);
}
	}

}




/*
1.MERGE
2.DUPLICATE
3.SORT
*/