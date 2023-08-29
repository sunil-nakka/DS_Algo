package binary.search;

import java.util.ArrayList;
import java.util.List;

public class MedianOf2SortedList {

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		
		a.add(-5);
		a.add(3);
		a.add(6);
		a.add(12);
		a.add(15);
		
		b.add(-12);
		b.add(-10);
		b.add(-6);
		b.add(-3);
		b.add(4);
		b.add(19);
		
		double ans = findMedianSortedArrays(a, b);
		
		System.out.println(ans);
		
		

	}
	
	public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {

        if(a.size()>b.size())
        {
            return findMedianSortedArrays(b, a);
        }
        
        int n1 = a.size();
        int n2 = b.size();
        int low = 0;
        int high = n1;

        while(low<=high)
        {

            int amid = low + (high-low)/2;

            int bmid = (n1+n2+1)/2-amid;

            int l1 = amid == 0 ? Integer.MIN_VALUE : a.get(amid-1);
            int l2 = bmid == 0 ? Integer.MIN_VALUE : b.get(bmid-1);

            int r1 = amid == n1 ? Integer.MAX_VALUE : a.get(amid);
            int r2 = bmid == n2 ? Integer.MAX_VALUE : b.get(bmid);

            if(l1<=r2 && l2<=r1)
            {
                if((n1+n2)%2==0)
                {
                    return (Math.max(l1,l2) + Math.min(r1,r2))/2;
                }
                else
                {
                    return Math.max(l1,l2);
                }
            }

            else if(l2>r1)
            {
                low = amid+1;
            }

            else{
                high = amid-1;
            }

        }

        return -1;
	}

}
