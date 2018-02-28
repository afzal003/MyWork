package methodOverriding;

public class FlagLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean flag=false;
int a[]= {1,2,3,4,5,6,7,8,9,10,11,12};
for(int i:a)// (or) for(int i=0;i<a.length;i++)
{
	//System.out.println(i);
	if(i==10)// (or) if(a[i]==10)
		
	{
		flag=true;
		break;
	}
}
if(flag==true)
	System.out.println("found");
else
	System.out.println("not found");
	}

}
