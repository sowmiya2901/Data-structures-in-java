package list;
public class searching {
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
			   head=new Node();
			   s=new Node();
			   t=new Node();
			   head.data=1;
			   head.next=s;
			   s.data=2;
			   s.next=t;
			   t.data=3;
			   t.next=null;
			   printList(head);
			   int k=3;
			   int i=0;
			  while(head!=null) {
				   if(k==head.data) {
					   System.out.println("key found at position" +i);
					   break;
				   }
				   head=head.next;
				   i++;
				   
				   
				   
				   
			   }
					   
		   }
}


