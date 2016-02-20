import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
//		MyList list1 = new MyList();
//		MyList list2 = new MyList();
//		ArrayList<Integer> xxx = new ArrayList<Integer>();
//		xxx.add(333);
//		xxx.add(4555);
//		xxx.add(666);
//		xxx.add(777);
//		xxx.add(888);
//		list1.insert(10, 15, 20, 25, 30);
//		list2.insert(9, 11, 12, 18, 19, 23, 25);
//		MyList list = list1.merge(list2);
//		list.print();
//		list2 = list.split(0);
//		list.print();
//		list2.print();
		SortedList srt = new SortedList();
		srt.insert(3,4,53,6,7,8,12,11,13,666,0,2,1);
		srt.delete(6);
		
		System.out.println(srt);;
	}
}
