package list;
public class insert_after_node {
		   static class Node{
			   int data;
			   Node next;
		   };
		   static void printList(Node n) {
			   while(n!=null) {
				   System.out.println(n.data+" ");
				   n=n.next;
			   }
		   }
		   public void push(Node prev,int d) {
			   if(prev==null) {
				   System.out.println("Can't be null");
				   return;
			   }
			   Node node=new Node();
			   node.data=d;
			   node.next=prev.next;
			   prev.next=node;
		   }
		   public static void main(String args[]) {
			   Node head=null;
			   Node s=null;
			   Node t=null;
			   head=new Node();
			   s=new Node();
			   t=new Node();
			   head.data=1;
			   head.next=s;
			   s.data=2;
			   s.next=t;
			   t.data=3;
			   t.next=null;
			   int th=20;
			   insert_after_node obj=new insert_after_node();
			   obj.push(s, th);
			   printList(head);
					   
}
}

