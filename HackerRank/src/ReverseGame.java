import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseGame {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int i = 0; i < test; i++) {
			int n = scan.nextInt();
			int x = scan.nextInt();
			int store = n;
			int tempp = n;
			Stack<Integer> st = new Stack<Integer>();
			Queue<Integer> q = new LinkedList<Integer>();
			for (int j = 0; j < n; j++) {
				st.push(j);
			}
			for (int j = n; j > 0; j--) {
				for (int k = 0; k < j; k++) {
					q.add(st.pop());
				}
				while (!q.isEmpty()) {
					st.push(q.remove());
				}
			}
			System.out.println(st);
			while (!st.isEmpty()) {
				n--;
				int temp = st.pop();
				if (x == temp) {
					System.out.println(n);
					break;
				}
			}
			if (x > n / 2) {
				System.out.println((store - x) * 2 - 1);
			} else {
				if (2 * x + 1 == store) {
					System.out.println(2 * x);
				} else {
					System.out.println(2 * x + 1);
				}
			}
			ArrayList<Integer> list = new ArrayList<Integer>();
			int k = 0;
			int t = store-1;
			while(store > -1){
				if(t >= tempp/2){
					list.add(t);
					if( t == x){
						System.out.println(list.size()-1);
						break;
					}
				}
				store--;
				t--;
				if(store > -1 && k != tempp/2){
					list.add(k);
					if( k == x){
						System.out.println(list.size() -1);
						break;
					}
					k++;
				}
				store--;
			}
//			System.out.println(list);
		}
	}

}
