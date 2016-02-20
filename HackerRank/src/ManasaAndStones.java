import java.util.ArrayList;
import java.util.Scanner;


public class ManasaAndStones {
	
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		for(int i = 0; i<test; i++){
			int limt = scan.nextInt();
			int a = scan.nextInt();
			int b = scan.nextInt();
//			generator(limt,a,b,0,0,0);
			System.out.println(list);
			list.clear();
		}
		
	}
	
//	public static int generator(int limit,int a, int b,int counter,int result1,int result2){
//		if(counter < limit){
//			result1 += generator(limit,a,b,++counter,result1,result2) +a; 
//			result2 += generator(limit,a,b,++counter,result1,result2) +b;
//			list.add(result1);
//			list.add(result2);
//		}
//		return 0;
//	}
	
	public static void generator(){
//		for(int i = 0 ; i<Math.pow(2, arg1))
	}
}
