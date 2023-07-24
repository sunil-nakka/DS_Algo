package sorting;

import utils.ArrayUtils;

public class MergeSort {
	
	
	
	public static void main(String[] args) {
		int[] arr = {9,2,5,10,3,8,6,1,7,4};
		
		System.out.println("Before Sorting: ");
		ArrayUtils.printArray(arr);
		mergeSort(arr, 0, arr.length-1);
		
		System.out.println("After Sorting: ");
		ArrayUtils.printArray(arr);
		
	}

	private static void mergeSort(int[] arr, int start, int end) {
		
		if(start<end) {
			
			int mid = (start+end)/2;
			
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr,start,mid,end);
		}
		
		
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		
		int[] temp = new int[end-start+1];
		
		int s1 = start;
		int s2 = mid+1;
		
		int index = 0;
		while(s1<=mid&& s2<=end) {
			
			if(arr[s1]<=arr[s2]) {
				temp[index++] = arr[s1++]; 
			}
			else {
				temp[index++] = arr[s2++];
			}
			
		}
		
		while(s1<=mid) {
			temp[index++] = arr[s1++];
		}
		
		while(s2<=end) {
			temp[index++] = arr[s2++];
		}
		
		index = 0;
		for(int i=start;i<=end;i++) {
			arr[i] = temp[index++];
		}
		
	}
	


}
