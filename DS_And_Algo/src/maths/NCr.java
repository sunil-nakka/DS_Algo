package maths;

public class NCr {

	public static void main(String[] args) {
		
		NCr obj = new NCr();
		obj.solve(3, 2, 33);

	}

    int cache[];
    public int solve(int n, int r, int p) {
        int max = Math.max(n,r);

        cache = new int[max+1];
        cache[0] = 1;
        buildFactorialCache(max);

        long nf = factorialOf(n)%p;
        long rf = factorialOf(r)%p;

        long nrf = factorialOf(n-r)%p;

        long rfpow = power(rf, p-2, p);
        long nrfpow = power(nrf, p-2, p);

        return (int) ( (nf*rfpow)%p*nrfpow%p)%p;

    }

   private long power(long x, long y, long p)
  {
    long res = 1; // Initialize result
 
    x = x % p; // Update x if it is more than or
    // equal to p
 
    if (x == 0)
      return 0; // In case x is divisible by p;
 
    while (y > 0)
    {
 
      // If y is odd, multiply x with result
      if ((y & 1) != 0)
        res = (res * x) % p;
 
      // y must be even now
      y = y >> 1; // y = y/2
      x = (x * x) % p;
    }
    return res;
  }

    private void buildFactorialCache(int n) {
		int last = 0;
		while(last<n) {
			cache[last+1] = cache[last] * (last+1);
			last++;
		}
		
    }

    private int factorialOf(int n) {
        return cache[n];
    }



}
