package binarySearch;

public class BinarySearch {

	public static void main(String[] args) {

		System.out.println(binarySearch(new int[] {1, 2, 3, 4, 8, 11, 22}, 10));
		System.out.println(binarySearch(new int[] {1, 2, 3, 4, 8, 11, 22}, 2));
	}


	
	// binary search only works on SORTED array
	public static int binarySearch(int[] arr, int x) {

		int p = 0; // starting point
		int r = arr.length-1;  // last index

		while(p <= r) {
			// q is midpoint
			int q = (p + r) / 2;

			if(arr[q] == x) {
				return q;
			} else {
				if(arr[q] > x) {
					r = q - 1;
				} else {
					p = q + 1;
				}
			}
		}

		return -1;
	}

}
