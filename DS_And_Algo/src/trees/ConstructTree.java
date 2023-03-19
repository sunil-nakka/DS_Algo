package trees;

import java.util.HashMap;

// construct tree from given inorder and postorder
public class ConstructTree {

	public static void main(String[] args) {
		int[] inorder = {9,3,15,20,7}; 
		int[] postorder = {9,15,7,20,3};
		ConstructTree obj = new ConstructTree();
		TreeNode root = obj.buildTree(inorder, postorder);
		
		TreeUtil util = new TreeUtil(root);
		util.printLevelOrder();

	}
	
	int post_idx;
	  int[] postorder;
	  int[] inorder;
	  HashMap<Integer, Integer> idx_map = new HashMap<Integer, Integer>();

	  public TreeNode helper(int in_left, int in_right) {

	    if (in_left > in_right)
	      return null;


	    int root_val = postorder[post_idx];
	    TreeNode root = new TreeNode(root_val);

	    
	    int index = idx_map.get(root_val);


	    post_idx--;

	    root.right = helper(index + 1, in_right);

	    root.left = helper(in_left, index - 1);
	    return root;
	  }

	  public TreeNode buildTree(int[] inorder, int[] postorder) {
	    this.postorder = postorder;
	    this.inorder = inorder;

	    post_idx = postorder.length - 1;

	    int idx = 0;
	    for (Integer val : inorder)
	      idx_map.put(val, idx++);
	    return helper(0, inorder.length - 1);
	  }

}
