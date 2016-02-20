import java.util.Scanner;


public class MissingNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size1  = scan.nextInt();
		long[] A = new long[size1];
		long[] arr1 = new long[100];
		for(int i = 0; i<size1; i++){
			A[i] = scan.nextLong();
		}
		int size2 = scan.nextInt();
		long[] B = new long[size2];
		long[] arr2 = new long[100];
		long max = 0;
		for(int i = 0; i<size2; i++){
			B[i] = scan.nextLong();
			if (B[i] > max){
				max = B[i];
			}
		}
		long dif = max - 99;	 
		for(int i = 0; i<size2; i++){
			if(i < size1){
				arr1[(int) (A[i] -dif)]++;
			}
			arr2[(int) (B[i] -dif)]++;
		}
//		for(int i = 0; i<arr1.length; i++){
//			System.out.println(arr1[i]);
//		}
//		for(int i = 0; i<arr2.length; i++){
//			System.out.println(arr2[i]);
//		}
		for(int i = 0; i<100;i++){
			if(arr1[i] != arr2[i]){
				System.out.println(i+dif);
			}
		}
		scan.close();
	}

}
