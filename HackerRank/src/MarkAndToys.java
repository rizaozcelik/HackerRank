import java.util.Arrays;
import java.util.Scanner;


public class MarkAndToys {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int n = scan.nextInt();
		long k = scan.nextLong();
		long[] arr = new long[n];
		for(int i = 0; i<n;i++){
			arr[i] = scan.nextLong();
		}
		Arrays.sort(arr);
		long sum = 0;
		long counter = 0;
		for(int i = 0; i<n; i++){
			if(sum + arr[i] <= k){
				sum +=arr[i];
				counter++;
			}else{
				System.out.println(counter);
				break;
			}
		}
	}

}
