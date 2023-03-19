package trees;

class TreeUtil {

	TreeNode root;
 
    public TreeUtil(TreeNode root) { this.root = root; }

    
    int height(TreeNode root)
    {
        if (root == null)
            return 0;
        else {
            /* compute height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);
 
            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
 
    /* Print nodes at a given level */
    private void printGivenLevel(TreeNode root, int level)
    {
        if (root == null)
            return;
        if (level == 1) {
            System.out.print(root.val + " ");
        }
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }
 
    /* function to print level order traversal of tree*/
   public void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++) {
            printGivenLevel(root, i);
            System.out.print(System.lineSeparator());
        }
    }
 

}
