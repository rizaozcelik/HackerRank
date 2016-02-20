import java.util.Scanner;


public class SherlockAndArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0; i<t; i++){
			int[] arr = new int[scan.nextInt()];
			for(int j = 0; j<arr.length; j++){
				arr[j] = scan.nextInt();
			}
			if(arr.length == 1){
				System.out.println("YES");
				continue;
			}
			long sumAll = 0;
			for(int j = 0; j<arr.length; j++){
				sumAll+= arr[j];
			}
			long sum = 0;
			for(int j = 0; j<arr.length-1; j++){
				sum += arr[j];
				if(sum == sumAll - sum - arr[j+1]){
					System.out.println("YES");
					break;
				}
				if(j == arr.length -2){
					System.out.println("NO");
				}
			}
		}
		
	}

}
