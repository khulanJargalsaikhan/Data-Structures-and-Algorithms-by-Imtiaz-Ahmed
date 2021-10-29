package Linked_List;

public class App {

	public static void main(String[] args) {

		Node nodeA = new Node();
		nodeA.data = 5;
		
		Node nodeB = new Node();
		nodeB.data = 7;
		
		Node nodeC = new Node();
		nodeC.data = 1;
		
		Node nodeD = new Node();
		nodeD.data = 8;
		
		Node nodeE = new Node();
		nodeE.data = 10;
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		nodeD.next = nodeE;
		
		System.out.println(listLength(nodeA)); // 4
		System.out.println(listLength(nodeB)); // 3
		
	}

	public static int listLength(Node aNode) {
		
	int length = 0;

	while(aNode != null) {
		length++;
		aNode = aNode.next;
	}
	return length;
	}
	
}
