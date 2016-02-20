import java.util.Scanner;


public class Campers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int players = scan.nextInt();
		int awp = scan.nextInt();
		boolean[] table = new boolean[players];
		boolean[] table2 = table;
		for(int i = 0; i<awp; i++){
			table[scan.nextInt()-1] = true;
		}
		int res1 = 0;
		for(int i = 0; i<players; i++){
			if(i != 0 && i!= players-1){
				if((table[i+1] == false && table[i-1] == false)){
					table[i] = true;
				}
			}else if(i == 0){
				if(table[1] == false){
					table[0] = true;
				}
			}else if(i== players -1){
				if(table[players-2] == false){
					table[players-1] = true;
				}
			}
		}
		for(int i = 1; i<players; i++){
			if(i != 0 && i!= players-1){
				if((table2[i+1] == false && table2[i-1] == false)){
					table2[i] = true;
				}
			}else if(i == 0){
				if(table2[1] == false){
					table2[0] = true;
				}
			}else if(i== players -1){
				if(table2[players-2] == false){
					table2[players-1] = true;
				}
			}
		}
		int res2 = 0;
		for(int i = 0; i<players; i++){
			if(table[i]){
				res1++;
			}
			if(table2[i]){
				res2++;
			}
		}
		System.out.println(Math.max(res1, res2));
	}

}
