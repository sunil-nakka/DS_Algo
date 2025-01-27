package arrays;
import java.util.*;
// print all triplets who sum is equals to 0
public class Sum3 {
	
	    public static void main(String[] args) {

	        int nums[] = {-1,0,1,2,-1,-4};
	        List<List<Integer>> result = threeSum(nums);

	        System.out.println(result);

			System.out.println(result);

		}

	    public static List<List<Integer>> threeSum(int[] nums) {


	        Set<List<Integer>> result = new HashSet<>();

	        Set<Integer> duplicate = new HashSet<>();

	        Set<Integer> seen = new HashSet<>();

	        for(int i=0;i<nums.length-2;i++) {

	            if(duplicate.add(nums[i])) {

	                for(int j=i+1; j<nums.length;j++) {

	                    int comp = -nums[i]-nums[j];

	                    if(seen.contains(comp)) {

	                        List<Integer> triplets = Arrays.asList(nums[i],nums[j], comp);

	                        Collections.sort(triplets);
	                        result.add(triplets);
	                    }
	                    seen.add(nums[j]);

	                }
	                seen = new HashSet<>();
	            }
	        }

	        return new ArrayList(result);
	    }
}
