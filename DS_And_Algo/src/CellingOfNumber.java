
public class CellingOfNumber {
	
	public static void main(String[] args) {
		
		int arr[] = {2,4,5,6,7,8,10,13,14,16,18,29};
		
		int target = 15;
		
		int result = findCelingOf(target, arr);
		
		System.out.println("Celling of "+ target + " is: "+result);
		
	}

	private static int findCelingOf(int target, int[] arr) {

		int low = 0;
		int high = arr.length-1;
		
		while(low<high) {
			int mid = low+(high-low)/2;
			
			if(arr[mid] == target) {
				return target;
			}
			
			if(target > arr[mid]) {
				low = mid+1;
			}
			
			else {
				high = mid-1;
			}
		}
		
		if(low+1<arr.length-1) {
			return arr[low+1];
		}
		
		return -1;
	}

}
