import java.util.Scanner;
import java.util.Stack;


public class LargestRectangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[scan.nextInt()];
		int minH = 0;
		int adj = 1;
		int maxA = 0;
		for(int i = 0; i<arr.length;i++){
			arr[i] = scan.nextInt();
		}
		int indexMin = 0;
		int indexMax = 0;
		minH = arr[0];
		for(int i = 0; i<arr.length;i++){
			if(arr[i] < minH){
				minH = arr[i];
				indexMax = i;
				for(int j = indexMin; j<indexMax; j++){
					int area = arr[j] * (indexMax-indexMin);
					if(maxA < area){
						maxA = area;
					}
				}
				indexMin = indexMax;
			}
			
//			indexMin = indexMax;
		}
		if(maxA ==0 ){
			for(int j = 0; j<arr.length; j++){
				int area = arr[arr.length-1] * (arr.length -j);
				if(maxA < area){
					maxA = area;
				}
			}
		}
		System.out.println(maxA);
	}

}
