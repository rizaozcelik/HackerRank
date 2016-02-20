import java.util.Scanner;


public class PlayingWithNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[8001];
		for(int i = 0; i<size; i++){
			int index = scan.nextInt()+2000;
			arr[index]++;
		}
		int x = 0;
		int[] newArr = new int[size];
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i]; j++){
				newArr[x] = i-2000;
				x++;
			}
		}
		for(int i = 0; i<newArr.length; i++){
			System.out.println(newArr[i] + " ");
		}
		int qs = scan.nextInt();
		for(int i = 0; i<qs; i++){
			int q = scan.nextInt();
			
		}
	}

}
