package queue;

public class Queue_array {
	int front,rear,capacity;
	int queue[];
	Queue_array(int size){
    	front=rear=0;
    	capacity=size;
    	queue=new int[capacity];
    }
	void enqueue(int item) {
		if(capacity==rear) {
			System.out.println("Queue is full");	
		}
		else {
			queue[rear]=item;
			System.out.println(queue[rear]);
			rear++;
			
		}
	}
	void dequeue() {
		if(front==rear) {
			System.out.println("Queue is empty");
			
		}
		else {
			for(int i=0;i<rear-1;i++) {
				queue[i]=queue[i+1];
				
			}
			if(rear<capacity) {
				queue[rear]=0;
				rear--;
			}
		}
		
	}

	public static void main(String args[]) {
		Queue_array  obj=new Queue_array(2);
		obj.enqueue(10);
		//obj.enqueue(50);
		//obj.enqueue(40);
		//obj.enqueue(30);
		//obj.enqueue(20);
		//obj.enqueue(60);
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		//obj.dequeue();
		//obj.dequeue();
		//obj.dequeue();
		//obj.dequeue();
		//obj.dequeue();
		
		
	}

}