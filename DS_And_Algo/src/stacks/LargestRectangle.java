package stacks;

import java.util.Stack;

import utils.ArrayUtils;

public class LargestRectangle {

	public static void main(String[] args) {

		int[] arr = {2,1,5,6,2,3};
		int maxArea =  largestRectangleArea(arr);
		System.out.println("Max Area is "+maxArea);

	}
	
	public static int largestRectangleArea(int[] A) {
        Stack<Integer> stack = new Stack<>();

        stack.push(-1);
        int maxArea = 0;
        for(int i=0;i<A.length;i++)
        {
            while(stack.peek() != -1 && A[stack.peek()] >=A[i])
            {
                int currentHeight = A[stack.pop()];
                int currentWidth = i-stack.peek()-1;
                maxArea = Math.max(maxArea, currentHeight*currentWidth);
            }

                stack.push(i);
        }

        
        while (stack.peek() != -1) {
            int currentHeight = A[stack.pop()];
            int currentWidth = A.length - stack.peek() - 1;
            maxArea = Math.max(maxArea, currentHeight * currentWidth);
        }
        
        return maxArea;
    }

}
