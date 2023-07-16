package maths;

import java.util.HashMap;
import java.util.Map;

public class Factorial {
	
	static Map<Integer, Integer> cache = new HashMap<>();
	public static void main(String[] args) {
		int n = 10;
		long start1 = System.nanoTime();
		int ans = findFactorial(n);
	    long end1 = System.nanoTime(); 
		
		System.out.println("Factorial of "+ n+" is: "+ ans);
		System.out.println("Elapsed Time in nano seconds: "+ (end1-start1));
		
		long start2 = System.nanoTime();
		int ans2 = findFactorialWithoutCache(n);
	    long end2 = System.nanoTime(); 
	    
	    System.out.println("Factorial of "+ n+" is: "+ ans2);
		System.out.println("Elapsed Time without cache in nano seconds: "+ (end2-start2));
		
	}

	private static int findFactorial(int n) {
		
		if(n==0 || n==1) {
			return 1;
		}
		
		if(cache.containsKey(n)) {
			return cache.get(n);
		}
		
		int temp = n*findFactorial(n-1);
		
		cache.put(n, temp);
		
		
		
		return temp;
	}
	
	private static int findFactorialWithoutCache(int n) {
		if( n==0 || n==1) {
			return 1;
		}
		
		return n*findFactorialWithoutCache(n-1);
	}

}
