package sorting_algorithms;

public class SelectionSort {
	
	// running time is O(n * n)  --> quadratic 
	// space complexity is good	--> modifies original array

	public static void main(String[] args) {
		
		int[] myArray = selectionSort(new int[] {9, 8, 3, 13, 87, 12, 99});
		
		for(int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}

	}
	
	
	public static int[] selectionSort(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			int min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[min])
					min = j;
			}
			
			//swaping process
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		return arr;
	}


}
