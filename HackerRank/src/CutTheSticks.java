import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < l; i++) {
			list.add(scan.nextInt());
		}
		Collections.sort(list);

		while (list.size() > 0) {
			int counter = 0;
//			System.out.println(list);
			int temp = list.get(0);
			for (int i = 0; i < list.size(); i++) {
				
				list.set(i, list.get(i) - temp);
				counter++;
			}
//			System.out.println(list);
			while (list.get(0) <= 0) {
				list.remove(0);
				if (list.isEmpty()) {
					break;
				}
			}
			System.out.println(counter);
		}
	}

}
