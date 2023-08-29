package arrays.two_pointers;

import utils.ArrayUtils;

// find minimum sub-array to be sorted so that entire array will be sorted ;
// should be done in TimeComplexity O(n) and Space Complexity is O(1) 
public class SortedSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {1,2,5,3,4,7};
		
		int[] result = findIndexOfNonSortedSubArray(arr);
		
		ArrayUtils.printArray(result);
		
		
	}

	private static int[] findIndexOfNonSortedSubArray(int[] arr) {
		int n = arr.length;
		int l = -1;
		int[] result = new int[2];
		
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				l = i;
				break;	
			}
			
		}
		
		if(l == -1)
		{
			result[0] = -1;
			result[1] = -1;
			return result;
		}
		
		int r = -1;
		for(int i=n-1;i>0;i--)
		{
			if(arr[i]<arr[i-1])
			{
				r = i;
				break;	
			}
			
		}
		
		
		int max = arr[l];
		
		for(int i=l+1;i<r;i++)
		{
			max = Math.max(max, arr[i]);
			
		}
		
		int min = arr[r];
		
		for(int i=r-1;r>l;i--)
		{
			min = Math.min(min, arr[i]);
			
		}
		
		for(l=0;l<n;l++) {
            if(arr[l] > min) {
                break;
            }
        }
        
        for(r = n-1;r>=0;r--) {
            if(arr[r] < max) {
                break;
            }
        }
        
		
		
		result[0] = l;
		result[1] = r;
		
		return result;
	}
	
	

}
