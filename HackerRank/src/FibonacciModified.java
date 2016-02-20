import java.math.BigInteger;
import java.util.Scanner;


public class FibonacciModified {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		int sec = scan.nextInt();
		int n = scan.nextInt();
		BigInteger b1 = BigInteger.valueOf(first);
		BigInteger b2 = BigInteger.valueOf(sec);
		BigInteger res = BigInteger.valueOf(0);
		for(int i = 0; i<n-2; i++){
			res = b1.add(b2.multiply(b2));
			b1 = b2;
			b2 = res;
		}
		System.out.println(res);
		scan.close();
		scan = null;
	}

}
