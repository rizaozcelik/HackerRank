import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int j = 0; j < t; j++) {
			String s = scan.next();
			int[] arr1 = new int[26];
			int[] arr2 = new int[26];
			String s1 = s.substring(0,s.length()/2);
			String s2 = scan.next();
			for (int i = 0; i < s1.length(); i++) {
				arr1[s1.charAt(i) - 97]++;
			}
			for (int i = 0; i < s2.length(); i++) {
				arr2[s2.charAt(i) - 97]++;
			}
			int counter = 0;
			for (int i = 0; i < 26; i++) {
				counter += Math.abs(arr1[i] - arr2[i]);
			}
			System.out.println(counter);
		}
	}
}
