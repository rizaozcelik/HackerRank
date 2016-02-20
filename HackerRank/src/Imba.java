import java.util.Scanner;


public class Imba {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0; i<t;i++){
			int n = scan.nextInt();
			int[] arr = new int[n];
			int index = n-1;
			while(index >= 0){
				arr[index] = n;
				n--;
				index-=2;
			}
			index = 0;
			int x = arr.length/2;
			for(int j = 0; j<arr.length; j++){
				if(arr[j] == 0){
					arr[j] = x;
					x--;
				}
			}
			for(int j = 0; j<arr.length; j++){
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
	}

}
