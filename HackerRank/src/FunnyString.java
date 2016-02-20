import java.util.Scanner;


public class FunnyString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int j = 0; j<t; j++){
			boolean broken = false;
			String s = scan.next();
			for(int i = 0; i<s.length()-1; i++){
				int dif1 = Math.abs(s.charAt(i) - s.charAt(i+1));
				int dif2 = Math.abs(s.charAt(s.length()-1-i) - s.charAt(s.length()-2-i));
				if(dif1 != dif2){
					System.out.println("Not Funny");
					broken = true;
					break;
				}
			}
			if(!broken){
				System.out.println("Funny");
			}
		}
	}

}
