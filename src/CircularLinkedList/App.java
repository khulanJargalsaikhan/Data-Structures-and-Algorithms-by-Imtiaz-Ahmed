package CircularLinkedList;

public class App {

	public static void main(String[] args) {
		CircularLinkedList mylist = new CircularLinkedList();
		
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
