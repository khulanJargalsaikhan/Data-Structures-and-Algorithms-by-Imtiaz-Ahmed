package hashtable;

public class HashTable {
	// O(1) runtime
	// double hashing algorithms will be used
	
	String[] hashArray;  // array is used for underlying container
	int arraySize;
	int size = 0;  // counter for number of elements in the hash table
	
	public HashTable(int numOfSlots) {
		
		if(isPrime(numOfSlots)) {
			hashArray = new String[numOfSlots];
			arraySize = numOfSlots; 
		} else {
			int primeCount = getNextPrime(numOfSlots);   // this will give next available prime number
			hashArray = new String[primeCount];
			arraySize = primeCount; 
			
			System.out.println("Hash table size given " + numOfSlots + " is not a prime");
			System.out.println("Hash table size changed to " + primeCount);
		}
	}
	
	private boolean isPrime(int num) {
		for(int i = 2; i*i <= num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

	private int getNextPrime(int minNumber) {
		for (int i = minNumber; true; i++) {
			if(isPrime(i)) {
				return i;
			}
		}
	}
	
	// returns preferred index position
	private int hashFunc1(String word) {
		int hashVal = word.hashCode(); // just be aware that java can return negative number here
		hashVal = hashVal % arraySize;  
		if(hashVal < 0) {
			hashVal = hashVal + arraySize;
		}	
		return hashVal; // ideal index position we'd like to insert or search in
	}
	
	
	// return step size that greater than 0  
	private int hashFunc2(String word) {
		int hashVal = word.hashCode();
		hashVal = hashVal % arraySize;
		
		if(hashVal < 0) {
			hashVal = hashVal + arraySize;
		}
		
		//use a prime number less than array size (example: 3, 7, 11 etc)
		return 3 - hashVal % 3;  // this will give us step size
	}
	
	public void insert(String word) {
		int hashVal = hashFunc1(word);
		int stepSize = hashFunc2(word);
		
		while(hashArray[hashVal] != null) {
			hashVal = hashVal + stepSize;
			hashVal = hashVal % arraySize;
		}
		
		hashArray[hashVal] = word;
		System.out.println("inserted word: " + word);
		size++;
	}
	
	public String find(String word) {
		int hashVal = hashFunc1(word);
		int stepSize = hashFunc2(word);
		
		while(hashArray[hashVal] != null) {
			if(hashArray[hashVal].equals(word)) {
				return hashArray[hashVal];
			}
			hashVal = hashVal + stepSize;
			hashVal = hashVal % arraySize;
		}
		return hashArray[hashVal];
	}
	
	
	public void displayTable() {
		System.out.println("Table: ");
		for(int i=0; i<arraySize; i++) {
			if(hashArray[i] != null)
				System.out.println(hashArray[i]);
			else
				System.out.println("**");	
		}
		
		System.out.println();
		
	}
	
}
