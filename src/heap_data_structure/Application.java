package heap_data_structure;

public class Application {
	
	public static void main(String[] args) {
		Heap newHeap = new Heap(10);
		newHeap.insert(10);
		newHeap.insert(11);
		newHeap.insert(12);
		newHeap.insert(13);
		newHeap.insert(24);
		newHeap.insert(25);
		newHeap.insert(26);
		newHeap.insert(31);
		newHeap.insert(32);
		newHeap.insert(33);
		
		newHeap.displayHeap();

		
		
	}

}
