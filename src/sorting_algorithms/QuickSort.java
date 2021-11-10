package sorting_algorithms;

import java.util.Arrays;

public class QuickSort {
	/* running time is O(n log n)
	 							--> worst case it can be O(n*n)
	 							--> advantage: it sorts the array in place rather than creating new array.
	 							--> divide and conquer algorithm
	 
	 Pseudocode:
	 
	 QuickSort(A,p,r)    			// A is array, p = 0; r = arr.length-1;
	 	if(p<r){
	 		q = PARTITION(A,p,r)   	// this is key part of this algorithm
	 		
	 		QuickSort(A,p,q-1)
	 		QuickSort(A,q+1,r)
	 	}
	 
	 */
	

	public static void main(String[] args) {
		
		int[] inputArray = {12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4};
		quickSort(inputArray, 0, inputArray.length-1);
		
		System.out.println(Arrays.toString(inputArray));

	}
	
	static int[] quickSort(int[] inputArray, int start, int end) {
				
		if(start < end) {
			int pp = partition(inputArray, start, end);   //pp --> partition point that gives us index position of the correctly placed value in the array
			quickSort(inputArray, start, pp-1);  // sorts the left half of the range
			quickSort(inputArray, pp+1, end);    // sorts the right half of the range
		}
		return inputArray;
	}
	
	
	static int partition(int[] inputArray, int start, int end) {
		
		int pivot = inputArray[end];   
		int i = start - 1;             //i --> starts with index -1
		for(int j=start; j <= end-1; j++) {  // j --> starts with index 0
			if(inputArray[j] <= pivot) {
				i++;
				int temp = inputArray[i];
				inputArray[i] = inputArray[j];
				inputArray[j] = temp;
			}
				
		}
		
		int temp = inputArray[i+1];
		inputArray[i+1] = inputArray[end];
		inputArray[end] = temp;
		return i+1;
	}
	


	
}
