import java.util.Scanner;

public class SherlockAndGCD {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int[] arr = new int[scan.nextInt()];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = scan.nextInt();
			}
			if (is(arr)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

	}

	private static boolean is(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (egcd(arr[i], arr[j]) == 1) {
					System.out.println(arr[i] + " " + arr[j]);
					return true;
				}
			}
		}
		return false;
	}

	public static int GCD(int a, int b) {
		if (b == 0)
			return a;
		return GCD(b, a % b);
	}
	
	public static int egcd(int a, int b) {
	    if (a == 0)
	        return b;

	    while (b != 0) {
	        if (a > b)
	            a = a - b;
	        else
	            b = b - a;
	    }

	    return a;
	}

}
