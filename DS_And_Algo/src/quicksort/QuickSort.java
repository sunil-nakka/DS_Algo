package quicksort;

import utils.ArrayUtils;

public class QuickSort {
	public static void main(String[] args) {
		
int[] arr = {7,3,2,5,1,6,4};
		
		ArrayUtils.printArray(arr, "Before quickSort");
		
		quickSort(arr, 0, arr.length-1);
		
		ArrayUtils.printArray(arr, "After quickSort");
		
	}

	private static void quickSort(int[] arr, int start, int end) {
		
		if(start >= end) 
		{
			return;
		}
		
		int pivot = partision(arr, start, end);
		quickSort(arr, start, pivot-1);
		quickSort(arr, pivot+1, end);
		
	}
	
private static int partision(int[] arr, int start, int end) {
	
		
		int pivot = arr[end];
		
		
		int i =start;
		int j = start;
		
		while(j<end) 
		{
			if(arr[j]<pivot) {
				swap(arr,i,j);
				i++;
			}
			j++;
			
		}
		
		swap(arr, i, j);
		
		return i;
		
	}

	private static void swap(int[] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		
	}

}
