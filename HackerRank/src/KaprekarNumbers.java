import java.util.Scanner;

public class KaprekarNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int lower = scan.nextInt();
		int upper = scan.nextInt();
		String s = "";
		if(lower == 1){
			s += 1 +" ";
		}
		for (long i = lower; i <= upper; i++) {
			if (kaprekar(i)) {
				s += i + " ";
			}
		}
		if (s.length() == 0) {
			System.out.println("INVALID RANGE");
		} else {
			System.out.println(s);
		}
	}

	public static boolean kaprekar(Long number) {

		Long sq = number * number;
		String s = sq.toString();
		int digit = s.length();
//		for (int i = 0; i < digit; i++) {
//			String s1 = s.substring(0, i);
//			String s2 = s.substring(i);
//			int n1 = 0, n2 = 0;
//			if (s1.length() != 0 && s2.length() != 0) {
//				n1 = Integer.parseInt(s1);
//				n2 = Integer.parseInt(s2);
//			}
//			if(n1 == 0 || n2 == 0){
//				continue;
//			}
//			if (n1 + n2 == number) {
//				return true;
//			}
//		}
		int n1 = 0, n2 = 0;
		String s1,s2;
		s1 = s.substring(0,digit/2);
		s2 = s.substring(digit/2);
		if (s1.length() != 0 && s2.length() != 0) {
			n1 = Integer.parseInt(s1);
			n2 = Integer.parseInt(s2);
		}
		
		if (n1 + n2 == number) {
			return true;
		}
		return false;
	}
}
