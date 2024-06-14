package stack;
public class array_implementation{
	int size=1000;
	int[] intArray=new int[size];
	int top=-1;
boolean isFull() {
	return(top==size-1);
}
//push operation

public void push(int a) {
  if(!isFull()) {
	  intArray[++top]=a;
	  System.out.println(intArray[top]);
  }

  else {
	  System.out.println("Can't add");
  }
}
//pop operation
int pop() {
	return intArray[top--];
}
//peek operation
int peek() {
	return intArray[top];
	}

//isfull operation

boolean isfull() {
	return(top==size-1);
}

//isempty operation
boolean isempty() {
	return (top==-1);
}


	public static void main( String args[]) {
		array_implementation obj=new array_implementation();
		System.out.println("Stack elements are:");
        obj.push(10);
        obj.push(20);
        obj.push(30);
        System.out.println("peek element");
        System.out.println(obj.peek());
        System.out.println(obj.isfull());
        System.out.println(obj.isempty());
        obj.pop();
        System.out.println("peek element");
        System.out.println(obj.peek());
        }
	}

		