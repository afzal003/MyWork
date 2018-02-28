package operators;

public class BitwiseOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3;// 0011
		int y=5;// 0101
		int z=x|y; // BITWISE OR
		System.out.println(z);// 0111
	}

}


/* OR -> any one TRUE

0 0   0
0 1   1
1 0   1
1 1   1

*/