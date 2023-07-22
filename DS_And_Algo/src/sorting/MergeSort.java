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
	
	private static void merge2(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
	
	

}
