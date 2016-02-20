import java.util.Scanner;


public class CountingSort1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int[] arr = new int[100];
        int size = scan.nextInt();
        for(int i = 0; i<size; i++){
            int val = scan.nextInt();
            arr[val] = arr[val] + 1;
//            System.out.println(arr[val]);
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        scan.close();
	}

}
