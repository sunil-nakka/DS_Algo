package trees;

import java.util.LinkedList;

/*
 * You are given the root of a binary tree containing digits from 0 to 9 only.

Each root-to-leaf path in the tree represents a number.

    For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.

Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a 32-bit integer.
 */

public class sumNumbers {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(4);
		root.left =  new TreeNode(9);
		root.right =  new TreeNode(0);
		root.left.left =  new TreeNode(5);
		root.left.right =  new TreeNode(1);
		int result = sumNumbers(root);
		
		System.out.println("sum of numbers fromed by root-to-leaf is "+ result);
		
	}
	
	private static int sum = 0;
	public static int sumNumbers(TreeNode root) {
		
		if(root == null) {
			return 0;
		}
		
		StringBuilder sb = new StringBuilder();
		findNumbers(root, sb);
		return sum;
 		
	    
	}
	private static void findNumbers(TreeNode node, StringBuilder currNum) {
		
		if(node == null) {
			return;
		}
		
		currNum.append(node.val);
		
		if(node.left == null && node.right == null) {
			sum +=  Integer.parseInt(currNum.toString());
			currNum.deleteCharAt(currNum.length()-1);
			return;
		}
		findNumbers(node.left, currNum);
		findNumbers(node.right, currNum);
		
		
		currNum.deleteCharAt(currNum.length()-1);
		
	}
	
}


