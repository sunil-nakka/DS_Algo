package dynamic_programming;


/**
 * Find count of good strings can be formed by zeros and ones of given length
 *
 */
public class CountWaysToBuilldString {

	public static void main(String[] args) {

		int mod = 1_000_000_007;
		System.out.println(mod);
		

	}
	
	public int countGoodStrings(int low, int high, int zero, int one) {

        int answer = 0;

        int mod = 1_000_000_007;

        int dp[] = new int[high+1];

        dp[0] = 1;
        for(int end=1;end<dp.length;end++) {

            if(end >= zero) {
                dp[end] += dp[end-zero];
            }
            if(end >= one) {
                dp[end] += dp[end-one];
            }
            dp[end] = dp[end]%mod;
        }

        for(int i=low;i<=high;i++) {
            answer += dp[i];
            answer %= mod;
        }

        return answer;
    }

}
