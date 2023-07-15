package maths;

public class GcdOfArray {
	
	public static void main(String[] args) {
		int[] arr = {12, 15, 18};
		GcdOfArray obj = new GcdOfArray();
		int result = obj.solve(arr);
		System.out.println(result);
	}
	
	public int solve(int[] A) {

        int ans = A[0];
        
        for(int i=1;i<A.length;i++) {
            ans = gcd(ans , A[i]);
        }
        return ans;
    }

    private int gcd(int a, int b) {
        if(b==0) {
            return a;
        }
        return gcd(b, a%b);
    }

}
