package queue;

public class Queue {
	
	//FIFO
	
	private int maxSize; // initializes the set number of slots
	private long[] queArray; //slots
	private int front;  // index position for the element in the front
	private int rear; // index position for the element at the back of the line
	private int nItems; // counter to maintain the number of items in our queue
	
	
	public Queue(int size) {
		this.maxSize = size;
		this.queArray = new long[size];
		front = 0;
		rear = -1; //there is no item in the array yet to be considered as the last item.
		nItems = 0;  // we don't have elements in the array yet	
		
	}
	
	public void insert(long j) {
		if (isFull()) {
			System.out.println("The queue is already full!");
		}
		
		//Circular Queue
		if(rear == maxSize - 1) {
			rear = -1;  //this will override if the queue is full
		}
		
		rear++;
		queArray[rear] = j;
		nItems++;
	}
	
	public long remove() {  //remove item from the front of the queue
		long temp = queArray[front];
		front++;
		if(front == maxSize) {
			front = 0; // we set front back to the 0th index so that we can utilize the entire array again
		}
		nItems--;
		
		return temp;
	}
	
	public long peekFront() {
		return queArray[front];
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	public void view() {
		for(int i=0; i<queArray.length; i++) {
			System.out.println(queArray[i]);
		}
		
	}
	
	
	
	
	
	
	
	
}


