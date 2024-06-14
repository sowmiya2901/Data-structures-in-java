package stack;

public class linkedlist_implementation {
	class Node{
		int data;
		Node next;
		Node prev;
	}

	Node top=null;
	Node head=null;
//isfull operation	
boolean isFull() {
	return(top==head);
}
//push operation

public void push(int a) {
  if(!isFull()) {
	  head.data=a;
	  head.next=top;
	  
	  System.out.println(head);
  }

  else {
	  System.out.println("Can't add");
  }
}
//pop operation
Node pop() {
	return top=head;
}
//peek operation
int peek() {
	return top.data;
	}
//isempty operation
Node isempty() {
	return (top=null);
}


	public static void main( String args[]) {
		array_implementation obj=new array_implementation();
		System.out.println("Stack elements are:");
        obj.push(10);
        obj.push(20);
        obj.push(30);
        System.out.println("peek element");
        System.out.println(obj.peek());
        System.out.println(obj.isFull());
        System.out.println(obj.isempty());
        obj.pop();
        System.out.println("peek element");
        System.out.println(obj.peek());
        }

}
