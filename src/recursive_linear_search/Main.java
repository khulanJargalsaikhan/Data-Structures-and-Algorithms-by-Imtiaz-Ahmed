package recursive_linear_search;

public class Main {

	public static void main(String[] args) {

		System.out.println(recursiveLinearSearch(new int[] {2,5,4,8,11,45,3,9}, 0, 12 ));   //-1
		System.out.println(recursiveLinearSearch(new int[] {2,5,4,8,11,45,3,9}, 1, 8 ));   //3

	}

	
	// i is starting index, x is value we are looking for
	public static int recursiveLinearSearch(int[] arr, int i, int x) {
		
		// if index is greater than arr length then return -1. That means x was not found in the array
		if (i > arr.length-1){
			return -1;
		} else if (arr[i] == x) {
			return i;
		} else
			System.out.println("index at: " + i);
			return recursiveLinearSearch(arr, i+1, x);
	}
	
}
