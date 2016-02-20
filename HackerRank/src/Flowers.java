import java.util.Arrays;
import java.util.Scanner;


public class Flowers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int prices = scan.nextInt();
		int friends = scan.nextInt();
		int[] arr = new int[prices];
		for(int i = 0; i<prices; i++){
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		int sum = 0;
		int multiplier = 1;
		int i = prices -1;
		while(i > -1){
			for(int j = 0; j <friends; j++){
				if(i > -1){
					sum += arr[i]*multiplier;
					i--;
				}
			}
			multiplier++;
		}
		System.out.println(sum);
	}

}
