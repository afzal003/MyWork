package arrayBasics;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double si=0;
		double cil=0;
		
		int g=6;
		int h=2;
		int c=(int) Math.pow(g,h);
		System.out.println(c);
for(int p=1000;p<=10000;p=p+1000)
{
	
	for(int n=1;n<=3;n++)
	{
	for(int r=7;r<=9;r++)
	{
		double x=1+(r/100);
		si=(p*n*r)/100;
		cil=p*(int)(Math.pow(x,n));
		System.out.println("p "+p+"  n "+n+" r "+r+"   si "+si);
		System.out.println(cil);
	}
		
		
	}
}
	}

}
