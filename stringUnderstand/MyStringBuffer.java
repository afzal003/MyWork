package stringUnderstand;

public class MyStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb=new StringBuffer("abc");
sb.delete(1, 2);// DELETE 2-1 = 1 
System.out.println(sb);
sb.append("afzal");
System.out.println(sb);
	}

}
