
public class SortedList extends MyList{
	
	@Override
	void insert(int data){
		if(super.getHead() == null){
			super.insert(data);
			return;
		}
		Node node = new Node(data);
		Node temp = super.getHead();
		if(data< super.getHead().data){
			super.insertHead(data);
			return;
		}
		while(true){
			if(temp.next != null){
				if(temp.next.data < data){
					temp = temp.next;
				}else{
					node.next = temp.next;
					temp.next = node;
					return;
				}
			}else{
				if(temp.data < data){
					temp.next = node;
					return;
				}else{
					node.next = temp;
					return;
				}
			}
		}
	}
	
	@Override
	void insert(int... i) {
		for (int x : i) {
			insert(x);
		}
	}
}
