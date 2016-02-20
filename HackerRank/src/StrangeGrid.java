import java.util.Scanner;


public class StrangeGrid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long r = scan.nextLong();
		int c = scan.nextInt();
		if(r % 2 == 1){
			System.out.println((r-1)/2*10 + (c-1)*2);
		}else{
			System.out.println((r-1)/2*10 + (c-1)*2 + 1);
		}
	}

}
