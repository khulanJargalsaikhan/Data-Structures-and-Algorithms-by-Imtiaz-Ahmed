package sorting_algorithms;

import java.util.Arrays;

public class InsertionSort {
	
	// running time is O(n * n)  --> quadratic
	// space complexity is good	--> modifies original array

	public static void main(String[] args) {
		
		int[] arr = new int[] {2, 5, 3, 1, 8, 11};
		
		System.out.println(Arrays.toString(insertionSort(arr)));

	}
	
	
	public static int[] insertionSort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			//element variable contains the data we intend on bringing over to the sorted area
			int element = arr[i];
			//j variable points to the index position of the last value in the sorted area 
			int j = i - 1;
			
			while(j >= 0 && arr[j] > element) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = element;
			
		}
		
		
		return arr;
		
	} 

}
