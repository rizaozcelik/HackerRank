import java.util.Scanner;


public class LoveLetter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0; i<t; i++){
			String s = scan.next();
			int res = 0;
			for(int j = 0; j<=s.length()/2; j++){
				if(s.length() % 2 == 0){
					if( j == s.length() /2){
						break;
					}
				}
				res += Math.abs(s.charAt(j) - s.charAt(s.length()-j-1));
			}
			System.out.println(res);
		}
	}

}
