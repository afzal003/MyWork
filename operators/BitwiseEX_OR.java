package operators;

public class BitwiseEX_OR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3;// 0011
		int y=5;// 0101
		int z=x^y; // BITWISE EX_OR
		System.out.println(z);// 0110

	}

}


/* EX_OR -> SAME=0 , DIFFERENT=1

0 0   0
0 1   1
1 0   1
1 1   0

*/