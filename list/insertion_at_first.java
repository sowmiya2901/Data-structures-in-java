package list;
public class insertion_at_first {
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
		   public static void main(String args[]) {
			   Node head=null;
			   Node s=null;
			   Node t=null;
			   Node third=null;
			   int th=10;
			   head=new Node();
			   s=new Node();
			   t=new Node();
			   head.data=1;
			   head.next=s;
			   s.data=2;
			   s.next=t;
			   t.data=3;
			   t.next=null;
			   third=new Node();
			   third.data=th;
			   third.next=head;
			   head=third;
			   printList(head);
					   
		   }
		}

