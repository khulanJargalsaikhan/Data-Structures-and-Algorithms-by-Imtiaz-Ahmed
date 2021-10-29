package SinglyLinkedList;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList mylist = new SinglyLinkedList();
		
		mylist.insertFirst(100);
		mylist.insertFirst(55);
		mylist.insertFirst(40);
		mylist.insertFirst(30);
		mylist.insertFirst(10);
		
		mylist.displayList();
		
		mylist.insertLast(9999999);
		
		mylist.displayList();
	}

}
