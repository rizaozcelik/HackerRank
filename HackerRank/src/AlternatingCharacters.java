import java.util.Scanner;


public class AlternatingCharacters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0; i<t; i++){
			int count = 0; 
			String s = scan.next();
			for(int j = 0; j<s.length()-1; j++){
				if(s.charAt(j) == s.charAt(j+1)){
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
