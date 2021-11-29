package hashtable;

public class App {

	public static void main(String[] args) {
		
		HashTable table = new HashTable(19); // this number better to be a prime number
		table.insert("Apple");
		table.insert("Hello");
		table.insert("Feeling");
		table.insert("Water");
		table.insert("Africa");
		table.insert("Speed");
		table.insert("Phone");
		table.insert("Huge");
		table.insert("Milk");
		
		table.displayTable();
		//figure out why find crashes
//		System.out.println("-----FIND ELEMENTS------");
//		System.out.println(table.find("Apple"));
//		System.out.println(table.find("Zebra"));
//		System.out.println(table.find("Feeling"));
//		System.out.println(table.find("Water"));
//		System.out.println(table.find("Feeling"));
//		System.out.println(table.find("Africa"));
		
		

	}

}
