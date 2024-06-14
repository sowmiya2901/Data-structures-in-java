package tree;

public class tree_implementation {
	public class Node{
		int data;
		Node leftchild;
		Node rightchild;
	};
	Node root;
	 
	 //searching operation
	 
  Node search(int data) {
	Node current=root;
	System.out.println("visiting node:");
	while(current.data!=data) {
		if(current!=null) {
	       System.out.println(current.data);
		}
	if(current.data>data) {
		current=current.leftchild;
	}
	else {
		current=current.rightchild;
	}
	if(current==null) {
		return null;
	}
	}
	return current;
		
	}
	 
	 //insertion operation
	 void insert(int data) {
		 if(root==null) {
			 root.data=data;
		 }
		 while(root!=null) {
			 if(root.data<data) {
				 root.rightchild=root;
				 if(root==null) {
					 root.data=data;
					 return;
				 }
			 }
			 else {
				 root.leftchild=root;
				root.data=data;
				return;
			 }
		 }
		
	 }
	 
	

	public static void main(String[] args) {
		tree_implementation  obj=new tree_implementation ();
		
		obj.insert(10);
		obj.search(10);
	}

}
