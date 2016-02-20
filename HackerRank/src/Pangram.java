import java.util.Scanner;


public class Pangram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		s = s.toLowerCase();
		String chars = "qwertyuiopasdfghjklzxcvbnm";
		char[] arr = chars.toCharArray();
		for(int i = 0; i<26; i++){
			if(!s.contains(arr[i] +"" )){
				System.out.println("not pangram");
				return;
			}
		}
		System.out.println("pangram");
	}

}
