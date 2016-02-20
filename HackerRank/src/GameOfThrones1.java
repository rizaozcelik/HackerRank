import java.util.Scanner;
import java.util.Stack;

public class GameOfThrones1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int l = s.length();
		int[] arr = new int[26];
		for(int i = 0; i<s.length(); i++){
			char temp = s.charAt(i);
			int index = temp-97;
			arr[index]++;
		}
		int odd = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i] % 2 == 1){
				odd++;
			}
		}
		
		if(s.length() % 2 ==0){
			if(odd == 0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}else{
			if(odd == 1){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}
