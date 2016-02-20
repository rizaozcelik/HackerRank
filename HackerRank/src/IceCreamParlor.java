import java.util.Scanner;


public class IceCreamParlor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for(int i = 0; i<test; i++){
			int money = scan.nextInt();
			int flavor = scan.nextInt();
			int[] arr = new int[flavor];
			for(int j = 0; j<flavor; j++){
				arr[j] = scan.nextInt();
			}
			boolean broke = false;
			for(int j = 0; j<flavor; j++){
				for(int k = j+1; k<flavor; k++){
					if(arr[j] + arr[k] == money){
						System.out.println((j+1) + " " + (k+1));
						broke = true;
						break;
						
					}
				}
				if(broke){
					break;
				}
			}
		}
	}

}
