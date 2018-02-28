package operators;

public class Increment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=a;
		int c=a++;// AFTER PASSING VALUE OF a=5 TO C, THEN IT BECOMES a=6
		int d=++a;// a=6,++a=7 TO D
		int e=b++;// b=a,a=5 ASSIGNS TO B
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(a);
		System.out.println(b);
	}

}
