import java.util.Scanner;

public class ClosestNumber {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int test = scan.nextInt();
			for (int i = 0; i < test; i++) {
				long a = scan.nextLong();
				long b = scan.nextLong();
				long x = scan.nextLong();
				long res =(long) Math.pow(a, b);
				double remainder = res % x;
				
				if (res < 1) {
					System.out.println("0");
					continue;
				}
				
				if(remainder > x/2.0){
					System.out.println((int)(res+x-remainder));
				}else{
					System.out.println((int)(res-remainder));
				}
				
			}
	}
// https://hr-testcases.s3.amazonaws.com/2582/output11.txt?AWSAccessKeyId=AKIAJAMR4KJHHUS76CYQ&Expires=1434147231&Signature=D4Lhg6%2BJQUu7dWCQu%2ByDxCiF6lk%3D&response-content-type=text%2Fplain
// https://hr-testcases.s3.amazonaws.com/2582/input11.txt?AWSAccessKeyId=AKIAJAMR4KJHHUS76CYQ&Expires=1434147227&Signature=gj0le3RMW%2FP5nGu%2Ftge4BwoMQd4%3D&response-content-type=text%2Fplain
}
