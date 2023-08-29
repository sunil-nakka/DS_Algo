package binary.search;

public class SearchInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,6,7,8,9,0,1,2,3,4};
		int index = search(arr, 1);
		System.out.println(index);
	}
	
	
	 public static int search(final int[] nums, int target) {


	        int low = 0;
	        int high = nums.length-1;

	        while(low  <= high)
	        {
	            int mid = low + (high-low)/2;

	            if(nums[mid] == target)
	            {
	                return mid;
	            }

	            if(nums[mid]>=nums[low])
	            {
	                if(nums[mid]>=target && nums[low]<=target)
	                {
	                    high = mid;
	                }
	                else
	                {
	                    low = mid+1;
	                }
	            }

	            else
	            {
	                if(nums[mid]<= target && nums[high]>= target)
	                {
	                    low = mid;
	                }
	                else
	                {
	                    high = mid-1;
	                }

	            }
	        } 

	        return -1;
	    }

}
