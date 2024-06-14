package list;
public class deletion_iteration {
	int number;
	static class Node{
		int data;
		Node next;
		public int number;
	};
	public static Node push(Node head, int A) {
	    Node n = new Node(); 
	    n.number = A; 
	    n.next = head;
	    head = n;
	    return head; 
	  }
	 static void printList(Node n) {
		   while(n!=null) {
			   System.out.println(n.data+" ");
			   n=n.next;
		   }
	 }

	public static void main(String args[]) {
		Node list=new Node();
		list.next=null;
		list=push(list,10);
		list=push(list,20);
		list=push(list,30);
		list=push(list,40);
		printList(list);
		
		
	}

}
