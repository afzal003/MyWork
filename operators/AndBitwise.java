package operators;

public class AndBitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3;// 0011
		int y=5;// 0101
		int z=x&y; // BITWISE AND
		System.out.println(z);// 0001

	}

}


/* AND -> all are TRUE
 
0 0   0
0 1   0
1 0   0
1 1   1

*/