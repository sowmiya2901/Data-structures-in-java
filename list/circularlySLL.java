package list;
class Node{
	int value;
	Node next;
	public Node(int value) {
		this.value=value;;
	}
}
public class circularlySLL {
	Node head=null;
   	Node tail=null;
	void addNode(int value) {
		Node temp=null;
        temp=new Node(value);
		if(head==null) {
			head=temp;
		}
		else {
			tail.next=temp;
		}
		tail=temp;
		tail.next=head;
		System.out.println(tail.value);
	}
	public static void main (String args[]) {
		 circularlySLL  obj=new  circularlySLL ();
		 obj.addNode(11);
		 obj.addNode(12);
		 obj.addNode(13);
		 obj.addNode(14);
		 obj.addNode(15);
		
	}

}
