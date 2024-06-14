package list;
class N{
	int data;
	N next;
	N prev;
};

public class doublyLinkedList {
    N head=null;
    N tail=null;
    
    public void AddNode(int val) {
       N temp=new N();
       temp.data=val;
       if(head!=null) {
    	   head.prev=temp;
       }
       head=temp;
       if(tail==null) {
    	   tail=temp;
       }
       System.out.println(temp.data);
    }
    public static void main(String args[]) {
    	doublyLinkedList obj=new doublyLinkedList();
    	int val=12;
    	obj.AddNode(val);
    	int v=13;
    	obj.AddNode(v);
    	int va=14;
    	obj.AddNode(va);
    }
}
