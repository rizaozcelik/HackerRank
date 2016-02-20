import java.util.Scanner;

public class PoisonousPlants {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long[] arr = new long[scan.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextLong();
		}
		boolean dead = true;
		long day = 0;
		int start = arr.length - 1;
		while (dead) {
			boolean changed = false;
			dead = false;
			for (int i = arr.length - 1; i > 0; i--) {
				int index = i - 1;
				while (arr[index] == -1) {
					index--;
				}
				arr[i] = -1;
				dead = true;

			}
			day++;
		}
		System.out.println(--day);
	}

}
