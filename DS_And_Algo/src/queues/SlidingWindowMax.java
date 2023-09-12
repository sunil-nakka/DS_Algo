package queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import utils.ArrayUtils;

public class SlidingWindowMax {

	public static void main(String[] args) {
		
		int[] arr = {3,15,6,12,7,2,10,8,5};
		int[] result = slidingMaximum(arr, 4);
		ArrayUtils.printArray(result);

	}
	
	public static int[] slidingMaximum(final int[] A, int k) {

        LinkedList<Integer> dqueue = new LinkedList<>();

        List<Integer> resultList = new ArrayList<>();

        for(int i=0;i<k;i++)
        {
            while(!dqueue.isEmpty() && dqueue.getLast() <= A[i])
            {
                dqueue.removeLast();
            }
            dqueue.addLast(A[i]);
        }

        resultList.add(dqueue.peekFirst());

        for(int i=k;i<A.length;i++)
        {
            if(!dqueue.isEmpty())
            {
                if(A[i-k] == dqueue.getFirst())
                {
                    dqueue.removeFirst();
                }
                
            }

            while(!dqueue.isEmpty() && dqueue.getLast() <= A[i])
                {
                    dqueue.removeLast();
                }
            dqueue.addLast(A[i]);
            resultList.add(dqueue.peekFirst());
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();

    }

}
