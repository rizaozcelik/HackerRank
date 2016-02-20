import java.util.Scanner;


public class FindMedian {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int[] arr = new int[l];
        for(int i = 0; i<l; i++){
            arr[i] = scan.nextInt();
        }
        
        for(int i = 0; i<l; i++){
        int counter = 0;
            for(int j = 0; j<l; j++){
                if(arr[i] < arr[j]){
                    counter++;
                }
                if(counter > l/2){
                    break;
                }
            }
            if(counter == l/2){
                System.out.print(arr[i]);
                break;
            }
        }
    }
}
