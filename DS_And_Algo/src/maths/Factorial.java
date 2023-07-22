package maths;

import java.util.HashMap;
import java.util.Map;

public class Factorial {
	
	//static Map<Integer, Integer> cache = new HashMap<>();
	static long[] cache;
	public static void main(String[] args) {
		int n =  10;
		cache = new long[n+1];
		cache[0] = 1;
		long start1 = System.nanoTime();
		long ans = findFactorial(n);
	    long end1 = System.nanoTime(); 
		
		System.out.println("Factorial of "+ n+" is: "+ ans);
		System.out.println("Elapsed Time in nano seconds: "+ (end1-start1));
		
		long start2 = System.nanoTime();
		long ans2 = findFactorialWithoutCache(n);
	    long end2 = System.nanoTime(); 
	    
	    System.out.println("Factorial of "+ n+" is: "+ ans2);
		System.out.println("Elapsed Time without cache in nano seconds: "+ (end2-start2));
		
	}

	private static long findFactorial(long n) {
		
		if(n==0 || n==1) {
			return 1;
		}
		int last = 0;
		while(last<n) {
			cache[last+1] = cache[last] * (last+1);
			last++;
		}
		
		return cache[(int)n];
	}
	
	private static long findFactorialWithoutCache(long n) {
		if( n==0 || n==1) {
			return 1;
		}
		
		return n*findFactorialWithoutCache(n-1);
	}

}
