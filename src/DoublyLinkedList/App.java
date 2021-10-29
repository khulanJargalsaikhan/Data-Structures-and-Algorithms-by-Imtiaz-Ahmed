package DoublyLinkedList;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList mylist = new DoublyLinkedList();
		
		mylist.insertFirst(100);
		mylist.insertFirst(55);
		mylist.insertFirst(40);
		mylist.insertFirst(30);
		mylist.insertFirst(10);
		
		mylist.displayForward();
		mylist.displayBackward();
		
		mylist.insertLast(40);
		mylist.insertLast(30);
		mylist.insertAfter(10, 7777777);
		
		mylist.displayForward();
		mylist.displayBackward();
		

	}

}
