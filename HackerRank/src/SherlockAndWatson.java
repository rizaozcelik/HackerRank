import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class SherlockAndWatson {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int op = size - (scan.nextInt()%size);
		int query = scan.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i = 0; i<size; i++){
			q.add(scan.nextInt());
		}
		for(int i = 0; i<op; i++){
			q.add(q.remove());
		}
		Object[] arr = q.toArray();
		for(int i = 0; i<query; i++){
			System.out.println(arr[scan.nextInt()]);
		}
	}

}
