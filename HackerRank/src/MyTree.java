
public class MyTree {
	
	TreeNode head;
	
	public void insert(int data){
		
		TreeNode node = new TreeNode(data);
		if(head == null){
			head = node;
			return;
		}
		insert(head,node);
	}
	
	private void insert(TreeNode head, TreeNode node) {
		if(node.data > head.data){
			if(head.left != null){
				insert(node,head.left);
			}else{
				head.left = node;
				node.parent = head;
			}
			if(head.right != null){
				insert(node,head.right);
			}else{
				head.right = node;
				node.parent = head;
			}
		}
		
		if(node.data < head.data){
			if(head.right != null){
				insert(node,head.right);
			}else{
				head.right = node;
				node.parent = head;
			}
			
			if(head.left != null){
				insert(node,head.left);
			}else{
				head.left = node;
				node.parent = head;
			}
		}
	}

	void inOrderTraversal(){
		inOrderTraversal(head);
	}
	
	StringBuilder s = new StringBuilder();
	private void inOrderTraversal(TreeNode TreeNode){
		
		if(TreeNode == null){
			return;
		}
		
		if(TreeNode != null){
			inOrderTraversal(TreeNode.left);
		}

		s.append(TreeNode.data);
		s.append(" ");
		
		if(TreeNode != null){
			inOrderTraversal(TreeNode.right);
		}
		
	}
	
	@Override
	public String toString(){
		return s.toString().substring(0,s.length()-1);
	}
	
}

class TreeNode {
	TreeNode right,left,parent;
	int data;
	
	public TreeNode(int data){
		this.data = data;
	}
}
