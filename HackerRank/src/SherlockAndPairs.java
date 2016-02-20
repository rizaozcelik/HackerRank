import java.util.Scanner;


public class SherlockAndPairs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int j = 0; j < t; j++) {
			int size = scan.nextInt();
			long[] arr = new long[(int) Math.pow(10, 6)];
			long sum = 0;
			for (int i = 0; i < size; i++) {
				long index = scan.nextLong()-1;
				arr[(int) index]++;
				long temp = arr[(int) index];
				long perm = temp * (temp - 1) - (temp - 1) * (temp - 2);
				sum += perm;
			}
			System.out.println(sum);
		}
		scan.close();
	}

}
