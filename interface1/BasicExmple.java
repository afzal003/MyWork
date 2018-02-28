package interface1;

interface I {
	public static int add() {
		System.out.println("I");
		return 4;
	}
}

interface J {
	public static int add() {
		System.out.println("J");
		return 5;
	}
}

/*
 * interface K { int add() {
 * 
 * }
 * 
 * }
 */
public class BasicExmple implements I, J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(I.add());
		System.out.println(J.add());
		BasicExmple b = new BasicExmple();
		b.add();
		
	}

	public int add() {
		// TODO Auto-generated method stub
		int a = 42;
		int b = a + 4;
		System.out.println(b);
		return 0;
	}

}
