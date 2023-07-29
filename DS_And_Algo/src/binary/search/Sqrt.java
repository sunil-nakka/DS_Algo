package binary.search;

public class Sqrt {

	public static void main(String[] args) {
		
		int num = 2;
		int result = findSqrt(num);  
		System.out.println(result);
		/*
		long res = findSqrt_2((long) 10.2);
		System.out.println(res);
		*/
		
		long test = (long) 10.5;
		System.out.println(test);
		
	}
	
	private static int findSqrt(int num) {
		
		int low = 1;
		int high = num/2;
		
		while(low <= high) {
			int mid = low +(high-low)/2;
			
			long root = (long)mid*mid;
			
			if(root == num) {
				return mid;
			}
			
			else if(root > num) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
			
			
		}
		
		return high;
		
	}
	
     private static long findSqrt_2(long num) {
		
		long low = 1;
		long high = num/2;
		
		while(low <= high) {
			long mid = low +(high-low)/2;
			
			long root = mid*mid;
			System.out.println("mid "+mid);
			if(root == num) {
				return mid;
			}
			
			else if(root > num) {
				high = (long) (mid-.01);
			}
			else {
				low = (long) (mid+.01);
			}
			
			
		}
		
		return high;
		
	}
}
