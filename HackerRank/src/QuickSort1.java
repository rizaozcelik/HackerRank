import java.util.Scanner;

public class QuickSort1 {

	static void partition(int[] ar) {
		int key = ar[0], index = 0;
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] < key) {
				int temp = ar[index + 1];
				ar[index] = ar[i];
				ar[index + 1] = key;
				ar[i] = temp;
				index++;
//				printArray(ar);
			}
		}
		// printArray(ar);
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		partition(ar);
	}
}
