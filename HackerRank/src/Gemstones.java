import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gemstones {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] arr = new int[26];
		
		for (int i = 0; i < num; i++) {
			String  s = scan.next();
			Set<Character> set = new HashSet<Character>();
			for(int j = 0; j<s.length(); j++){
				set.add(s.charAt(j));
			}
			for(Character ch : set){
				arr[ch-97]++;
			}
		}
//		System.out.println(set);
		int counter = 0;
		for(int i  = 0; i<arr.length; i++){
			if(arr[i] == num){
				counter++;
			}
		}
		System.out.println(counter);
	}

}
