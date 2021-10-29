package recursive_binary_search;

public class Main {

	public static void main(String[] args) {
		
		// array must be SORTED
		System.out.println(recursiveBinarySearch(new int[] {1,2,3,4,5,6,7,8,9,11,15}, 0, 10, 7 ));   //6
		//System.out.println(recursiveBinarySearch(new int[] {1,2,3,4,5,6,7,8,9,11,15}, 0, 10, 77 ));   //-1


	}

	
	
	// arr[p ... r]    --> p is starting index, r is last index of the array, x is the value we are looking for
	public static int recursiveBinarySearch(int[] arr, int p, int r, int x) {
		
		System.out.println("[" +p + "...." + r + "]");
		if(p > r)
			return -1;
		else {
			int q = (p + r) / 2;   // q is middle index of the array
			if (arr[q] == x)     
				return q;
			else if (arr[q] > x) 
				// r = q-1  --> searching in the first half of the array
				return recursiveBinarySearch(arr, p, q-1, x);
			else
				// p = q+1   --> searching second half
				return recursiveBinarySearch(arr, q+1, r, x);
		}
		
		
		
	}
}
