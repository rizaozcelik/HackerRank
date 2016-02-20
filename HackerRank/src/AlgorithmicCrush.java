import java.util.Scanner;


public class AlgorithmicCrush {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numbers = scan.nextInt();
		long[] arr = new long[numbers+2];
		int op = scan.nextInt();
		for(int i = 0; i<op; i++){
			int f = scan.nextInt()-1;
			int l = scan.nextInt()-1;
			int k = scan.nextInt();
				arr[f] += k;
				arr[l+1] -= k; 
		}
		
		for(int i = 0; i<arr.length-1; i++){
			arr[i+1] = arr[i] + arr[i+1];
		}
		long max = arr[0];
		for(int i = 0; i<numbers; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println(max);
		
	}

}
