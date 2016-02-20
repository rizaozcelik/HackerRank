import java.util.ArrayList;
import java.util.Scanner;


public class IsFibo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0; i<t; i++){
			long n = scan.nextLong();
			long counter = 1;
			ArrayList<Double> list = new ArrayList<Double>();
			double temp = fibonacci(counter);
			while(temp <= n){
				list.add(temp);
				counter++;
				temp = fibonacci(counter);
			}
			list.add(fibonacci(counter));
			System.out.println(list.get(list.size()-1));
			if(Math.abs(list.get(list.size()-1) - n) < 0.1 || n == 1 || n == 2){
				System.out.println("IsFibo");
			}else{
				System.out.println("IsNotFibo");
			}
		}
	}
	
	public static double fibonacci(long n)  {
		double r = (1 + Math.sqrt(5))/2;
		return (Math.pow(r,n) - Math.pow(-r, -n))/Math.sqrt(5);
	}
}
