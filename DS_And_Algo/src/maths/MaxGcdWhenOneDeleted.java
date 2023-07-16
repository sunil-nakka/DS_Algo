package maths;

public class MaxGcdWhenOneDeleted {

	public static void main(String[] args) {

		MaxGcdWhenOneDeleted obj = new MaxGcdWhenOneDeleted();
		int A[] = {3,9,6,8,3};
		int ans = obj.solve(A);
		System.out.println(ans);
	
	}
	
	public int solve(int[] A) {

        int ans = 0;
        int n = A.length;
        int[] preGcd =  new int[n+1];
        int[] sufGcd =  new int[n+1];

        for(int i=0;i<n;i++) {
            preGcd[i+1] = gcd(preGcd[i], A[i]);
            sufGcd[n-i-1] = gcd(sufGcd[n-i], A[n-i-1]);
        }

        for(int i=0;i<n;i++) {
            ans = Math.max(ans,gcd(preGcd[i], sufGcd[i+1]));
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
