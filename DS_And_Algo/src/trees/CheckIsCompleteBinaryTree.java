package trees;

import java.util.LinkedList;
import java.util.Queue;

public class CheckIsCompleteBinaryTree {
	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(4);
		root.left =  new TreeNode(9);
		root.right =  new TreeNode(0);
		root.left.left =  new TreeNode(5);
		root.left.right =  new TreeNode(1);
		boolean result = isCompleteTree(root);
		
		System.out.println("Is Complete binary tree: "+ result);
		
	}
	public static boolean isCompleteTree(TreeNode root) {
		if (root == null) {
		            return true;
		        }

		        boolean nullNodeFound = false;
		        Queue<TreeNode> q = new LinkedList<>();
		        q.offer(root);

		        while (!q.isEmpty()) {
		            TreeNode node = q.poll();

		            if (node == null) {
		                nullNodeFound = true;
		            } else {
		                if (nullNodeFound) {
		                    return false;
		                }
		                q.offer(node.left);
		                q.offer(node.right);
		            }
		        }
		        return true;

		        
		    }

}
