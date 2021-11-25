package queue;

public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(5);
		myQueue.insert(100);
		myQueue.insert(890);
		myQueue.insert(2100);
		myQueue.insert(150);
		myQueue.insert(648);
		myQueue.insert(6848);
		
		myQueue.view();
	}

}
