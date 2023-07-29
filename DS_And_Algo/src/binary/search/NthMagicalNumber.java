package binary.search;

//https://leetcode.com/problems/nth-magical-number
public class NthMagicalNumber {

	public static void main(String[] args) {
		
		NthMagicalNumber obj = new NthMagicalNumber();
		int ans = obj.solve(19, 11, 14);
		System.out.println(ans);

	}
	
	int mod = 1000000000+7;
	
	public int solve(int N, int B, int C) {

        long low = 0;
        long high = (long)N*Math.min(B,C);

        long lcm = (B)/gcd(B,C)*C;
    
        long count = 0;
        while(low<high)
        {
            long mid = low + (high-low)/2;
            count = mid/B+mid/C-mid/lcm;

        

             if(count<N)
            {
                low = mid+1;
            }

            else
            {
                high = mid;
            }


        }

        return (int)(low%mod);
    }

    int gcd(int a , int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b, a%b);
    }

}
