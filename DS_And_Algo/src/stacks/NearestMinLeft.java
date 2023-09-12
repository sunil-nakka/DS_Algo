package stacks;

import java.util.Stack;

import utils.ArrayUtils;

public class NearestMinLeft {

	public static void main(String[] args) {
		
		int[] A = {4,7,3,8};
        
        int n = A.length;
        int[] minLeft = new int[n];
        int[] minRight = new int[n];
        
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];

        Stack<Integer> stack = new Stack<>();

        stack.push(-1);
        for(int i=0;i<n;i++)
        {
            
            while(stack.peek()!= -1 &&  A[stack.peek()]>= A[i])
            {
                stack.pop();
            }


                minLeft[i] = stack.peek();

            stack.push(i);
        }
        
        ArrayUtils.printArray(minLeft);
        
        stack.clear();

        stack.push(n);
        for(int i=n-1;i>=0;i--)
        {
            
            while(stack.peek()!= n && A[stack.peek()] >= A[i])
            {
                stack.pop();
            }

            minRight[i] = stack.peek();

            stack.push(i);
        }
        
        ArrayUtils.printArray(minRight);
        
        stack.clear();
        stack.push(-1);
        for(int i=0;i<n;i++)
        {
            
            while(stack.peek()!= -1 && A[stack.peek()] <= A[i])
            {
                stack.pop();
            }

            
                maxLeft[i] = stack.peek();
            
            stack.push(i);
        }
        
        ArrayUtils.printArray(maxLeft);

        stack.clear();

        stack.push(n);
        for(int i=n-1;i>=0;i--)
        {
            
            while(stack.peek()!= n && A[stack.peek()] <= A[i])
            {
                stack.pop();
            }

            maxRight[i] = stack.peek();

            stack.push(i);
        }

        ArrayUtils.printArray(maxRight);
	}

}
