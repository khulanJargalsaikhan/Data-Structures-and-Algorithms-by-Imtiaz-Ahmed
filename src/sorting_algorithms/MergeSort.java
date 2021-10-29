package sorting_algorithms;

import java.util.Arrays;

public class MergeSort {
	
	/* running time is O(n log n)  	--> Advantage: faster than Insertion sort and Selection sort
									--> divide and conquer algorithm
									--> uses recursive approach
									--> Disadvantage: requires complete copy of the array, so if you are at tight space then this is not a good solution. 	
	*/			

	public static void main(String[] args) {
		int[] arr = new int[] {8, 1, 4, 1, 2, 7, 11, 124, 3, 45, 6};
		
		sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
	
	
	
	public static void sort(int[] inputArray) {
		sort(inputArray, 0, inputArray.length-1);
	}
	
	
	public static void sort(int inputArray[], int start, int end) {
		if(end <= start) {
			return; // we're done traversing the array
		}
		
		int mid = (start + end) / 2;
		sort(inputArray, start, mid);   // will sort left half
		sort(inputArray, mid+1, end);   // will sort right half
		merge(inputArray, start, mid, end);   // will merge sorted results into the inputArray
		
	}
	
	public static int[] merge(int inputArray[], int start, int mid, int end) {
		
		int[] temp = new int[end - start + 1];
		
		int leftStart = start;
		int rightStart = mid + 1;
		
		int k = 0;
		
		while(leftStart <= mid && rightStart <= end) {
			if(inputArray[leftStart] < inputArray[rightStart]) {
				temp[k] = inputArray[leftStart];
				leftStart++;
			} else {
				temp[k] = inputArray[rightStart];
				rightStart++;
			}
			
			k++;
		}
		
		/* When it get's to here, that means the above loop has completed.
		 * So both the right and the left side of the sub-array can be considered sorted
		 */
		
		if(leftStart <= mid) {   // consider the right side done being sorted. Left must be sorted already
			while(leftStart <= mid) {
				temp[k] = inputArray[leftStart];
				leftStart++;
				k++;
			}
		} else {
			while(rightStart <= end) {
				temp[k] = inputArray[rightStart];
				rightStart++;
				k++;
			}	
		}
		
		
		// copy over the temp array into the appropriate slots of the inputArray
		for(int i=0; i<temp.length; i++) {
			inputArray[start+i] = temp[i];
		}
		
		return inputArray;

	}
	

}
