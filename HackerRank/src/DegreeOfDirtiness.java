import java.util.Arrays;
import java.util.Scanner;

public class DegreeOfDirtiness {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int k = 0; k < t; k++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int index = 0;
			int dirtiness = m/n;
			int remainder = m % n;
			if (n % 2 == 0) {
				if (remainder == 0) {
					index = n / 2;
					dirtiness--;
				} else if (remainder % 2 == 0) {
					index = n - remainder/2;
				} else if(remainder % 2 == 1){
					index = remainder/2;
				}
			} else {
				if(remainder == 0){
					index = n/2;
					dirtiness--;
				}else if( m % 2 == 0){
					remainder = m % (2*n);
					if(remainder > n){
						remainder = remainder - (n - 1);
					}
//					index = remainder /2 -1;
					index = n - remainder / 2;
				}else if(m %2 == 1){
					remainder = m % (2*n);
					if(remainder > n){
						remainder = remainder - (n +1);
					}
//					index = n-1 - remainder/2;
					index = remainder/2;
					
				}
			}
			System.out.println(index + 1 + " " + (dirtiness));
		}

		scan.close();
	}
}
