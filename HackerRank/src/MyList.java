import java.util.Collection;
import java.util.Collections;

public class MyList<E> {

	private Node head;

	Node getHead() {
		return this.head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	void insert(int data) {
		Node node = new Node(data);
		if (getHead() == null) {
			setHead(node);
			return;
		}
		Node temp = getHead();
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}

	void insert(int... i) {
		for (int x : i) {
			insert(x);
		}
	}

	void insertHead(int data) {
		if (getHead() == null) {
			setHead(new Node(data));
			return;
		}

		Node node = new Node(data);
		node.next = getHead();
		setHead(node);

	}

	void insertAll(Collection<Integer> list) {
		for (Integer i : list) {
			this.insert(i);
		}
	}

	void insertNth(int data, int position) {
		Node node = new Node(data);
		Node temp = getHead();

		if (position >= this.length()) {
			insert(data);
			return;
		}

		if (getHead() == null) {
			setHead(node);
			return;
		}

		if (position == 0) {
			node.next = getHead();
			setHead(node);
			return;
		}

		int x = 0;

		while (x != position - 1) {
			temp = temp.next;
			x++;
		}

		node.next = temp.next;
		temp.next = node;

	}

	boolean contains(int data) {
		if (getHead().data == data) {
			return true;
		}
		Node temp = getHead();
		while (temp.data != data) {
			temp = temp.next;
			if (temp != null) {
				if (temp.data == data) {
					return true;
				}
			} else {
				break;
			}
		}
		return false;
	}

	boolean delete(int data) {
		Node toDelete = find(data);
		if (toDelete == null) {
			return false;
		}

		if (getHead().data == toDelete.data) {
			setHead(getHead().next);
			return true;
		}

		Node temp = getHead();
		while (temp.next.data != toDelete.data) {
			temp = temp.next;
		}

		temp.next = toDelete.next;
		toDelete = null;
		return true;
	}

	int indexOf(int data) {
		Node temp = getHead();
		int index = 0;
		while (temp != null) {
			if (temp.data == data) {
				return index;
			}
			temp = temp.next;
			index++;
		}

		return -1;
	}

	int get(int index) {
		if (index >= this.length()) {
			throw new IndexOutOfBoundsException();
		}

		int x = 0;
		Node temp = getHead();
		while (x != index) {
			x++;
			temp = temp.next;
		}
		return temp.data;
	}

	void set(int index, int data) {
		int x = 0;
		Node temp = getHead();
		{
			while (x <= index) {
				if (x == index) {
					temp.data = data;
				}
				x++;
				temp = temp.next;
			}
		}
	}

	boolean replace(int newData, int oldData) {
		if (!contains(oldData)) {
			return false;
		}
		Node node = new Node(newData);
		Node temp = getHead();
		if (getHead().data == oldData) {
			node.next = getHead().next;
			setHead(node);
			return true;
		}
		while (temp.next != null) {
			if (temp.next.data == oldData) {
				node.next = temp.next.next;
				temp.next = node;
			}
			temp = temp.next;
		}

		return true;
	}

	MyList<Integer> reverse() {
		MyList<Integer> list = new MyList<Integer>();
		Node temp = getHead();
		while (temp != null) {
			list.insertHead(temp.data);
			temp = temp.next;
		}
		return list;
	}

	MyList<Integer> merge(MyList<Integer> list2) {
		MyList<Integer> list = new MyList<Integer>();
		Node head1 = getHead();
		Node head2 = list2.getHead();
		while (head1 != null && head2 != null) {
			if (head1.data <= head2.data) {
				list.insert(head1.data);
				head1 = head1.next;
			} else {
				list.insert(head2.data);
				head2 = head2.next;
			}
		}
		while (head1 != null) {
			list.insert(head1.data);
			head1 = head1.next;
		}
		while (head2 != null) {
			list.insert(head2.data);
			head2 = head2.next;
		}

		return list;
	}

	MyList<Integer> split(int i) {
		if (i >= this.length()) {
			throw new IndexOutOfBoundsException();
		}

		MyList<Integer> list = new MyList<Integer>();
		if (i == 0) {
			Node x = getHead();
			while (x != null) {
				list.insert(x.data);
				x = x.next;
			}

			setHead(null);
			return list;

		}

		Node temp = getHead();
		int x = 0;
		while (x < i - 1) {
			temp = temp.next;
			x++;
		}
		Node temp2 = temp.next;
		while (temp2 != null) {
			list.insert(temp2.data);
			temp2 = temp2.next;
		}

		temp.next = null;
		temp = null;

		return list;

	}

	int length() {
		if (getHead() == null) {
			return 0;
		}
		int length = 0;
		Node temp = getHead();
		while (temp != null) {
			temp = temp.next;
			length++;
		}
		return length;
	}

	public int[] toArray() {
		int arr[] = new int[this.length()];
		Node temp = getHead();
		for (int i = 0; i < arr.length; i++) {
			if (temp != null) {
				arr[i] = temp.data;
				temp = temp.next;
			}
		}
		return arr;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		Node temp = getHead();
		while (temp != null) {
			str.append(temp.data);
			str.append(" ");
			temp = temp.next;
		}
		return str.toString().substring(0, str.length() - 1);
	}

	void print() {

		Node temp = getHead();
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	private Node find(int data) {
		if (!contains(data)) {
			return null;
		}

		Node temp = getHead();
		while (temp.data != data) {
			temp = temp.next;
		}
		return temp;
	}


}

class Node {

	protected int data;
	protected Node next;

	public Node(int data) {
		this.data = data;
	}
}
