import java.util.Scanner;

public class BotSavesPrincess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean written = false;
		int[] mloc = new int[2];
		int[] ploc = new int[2];
		mloc[0] = scan.nextInt();
		mloc[1] = scan.nextInt();
		char[][] arr = new char[n][n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.next().toCharArray();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (arr[i][j] == 'p') {
					ploc[0] = i;
					ploc[1] = j;
				}
			}
		}

		for (int i = 0; i < mloc[0] - ploc[0]; i++) {
			if (!written) {
				System.out.println("UP");
				written = true;
			}
		}

		for (int i = 0; i < ploc[0] - mloc[0]; i++) {
			if (!written) {
				System.out.println("DOWN");
				written = true;
			}
		}

		for (int i = 0; i < mloc[1] - ploc[1]; i++) {
			if (!written) {
				System.out.println("LEFT");
				written = true;
			}
		}

		for (int i = 0; i < (ploc[1] - mloc[1]); i++) {
			if (!written) {
				System.out.println("RIGHT");
				written = true;
			}
		}
		// System.out.println(mloc[0]);
		// System.out.println(mloc[1]);
		// System.out.println(ploc[0]);
		// System.out.println(ploc[1]);
	}
}
