package stringUnderstand;

public class Exc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double startTime=System.currentTimeMillis();
StringBuffer sb=new StringBuffer("abcde");
for(int i=0;i<=1000000;i++)
{
	sb.append("fghij");
}
double endTime=System.currentTimeMillis();
System.out.println("time taken is "+(endTime-startTime)+"ms");// TO CALCULATE THE EXECUTion TIME OF PROGRAM 
	}

}
