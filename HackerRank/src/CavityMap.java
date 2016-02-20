import java.util.Scanner;


public class CavityMap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		String[][] arr = new String[t][1];
		int [][] arr2 = new int[t][t];
		for(int i = 0; i<t; i++){
			arr[i][0] = scan.next();
			for(int j = 0; j<t; j++){
				arr2[i][j] = arr[i][0].charAt(j)-48;
			}
		}
		
		for(int i = 1; i<t-1; i++){
			for(int j = 1; j<t-1; j++){
				int x = arr2[i][j];
				int a = arr2[i+1][j];
				int b = arr2[i-1][j];
				int c = arr2[i][j-1];
				int d = arr2[i][j+1];
				if(x > a && x > b && x > c && x > d ){
					arr2[i][j] = 10;
				}
			}
		}

		for(int i = 0; i<t; i++){
			for(int j = 0; j<t; j++){
				if(arr2[i][j] != 10){
					System.out.print(arr2[i][j]);
				}else{
					System.out.print("X");
				}
			}
			System.out.println();
		}
	}

}
