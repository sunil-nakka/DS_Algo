package quicksort;

import utils.ArrayUtils;

public class Partision {
	
	public static void main(String[] args) {
		
		int[] arr = {7,3,2,5,1,6,4};
		
		ArrayUtils.printArray(arr, "Before partision");
		
		int pivot = partision(arr, 0, arr.length-1);
		
		ArrayUtils.printArray(arr, "After partision");
		
		System.out.println("Pivot index: "+pivot);
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
