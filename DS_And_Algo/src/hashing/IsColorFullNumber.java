package hashing;

import java.util.HashSet;

public class IsColorFullNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = colorful(123);
		System.out.println(result);

	}
	
	public static int colorful(int A) {

        HashSet<Integer> cache = new HashSet<>();

        while(A>0)
        {
            int reminder = A%10;
            A = A/10;
            cache.add(reminder);
        }

    if(cache.contains(1) || cache.contains(0))
    {
        return 0;
    }

    return 1;

    }

}
