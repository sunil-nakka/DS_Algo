package maths;

public class Gcd {
	
	public static void main(String[] args) {
		
		int result = findGCD(12,16);
		System.out.println(result);
		
		System.out.print("Using Recursion: ");
		System.out.println(findGCD(12,16));
	}
	
	private static int findGCD(int a, int b) {
		
		int temp = b;
		b = a;
		a = temp;
		while(a!=0 ) {
			
			a = a%b;
			
			if(a == 0) {
				return b;
			}
			temp = b;
			b = a;
			a = temp;
			
		}
		
		return b;
		
	}
	
	private static int recursionGCD(int a , int b) {
		if(b==0) {
			return a;
		}
		return recursionGCD(b, a%b);
	}

}
