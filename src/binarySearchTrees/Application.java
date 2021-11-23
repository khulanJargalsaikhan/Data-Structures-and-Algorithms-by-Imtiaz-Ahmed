package binarySearchTrees;

public class Application {

	public static void main(String[] args) {
		
		BST tree = new BST();
		tree.insert(10, "Ten");
		tree.insert(20, "Twenty");
		tree.insert(4, "Four");
		tree.insert(2, "Two");
		tree.insert(5, "Five");
		tree.insert(18, "Eighteen");
		tree.insert(22, "Twenty two");
		tree.insert(8, "Eight");
		tree.insert(17, "Seventeen");
		tree.insert(19, "Nineteen");
		tree.insert(21, "Twenty one");
		tree.insert(24, "Twenty four");
		tree.insert(9, "Nine");
		tree.insert(33, "Thirty three");
		
		
//		System.out.println(tree.findMin().key);
//		System.out.println(tree.findMax().key);
//		
//
//		System.out.println(tree.remove(10));
//		System.out.println(tree.findMin().key);
		
		
		tree.displayTree();
		
		
		
		
		
	}

}
