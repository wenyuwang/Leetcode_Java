package minDepth;

public class Solution {
    public int minDepth(TreeNode root) {
    	
    	if (root == null )return 0;
    	if (root.right == null) return minDepth(root.left)+1;
    	else if (root.left == null) return minDepth(root.right)+1;
    	else return 1+Math.min(minDepth(root.right), minDepth(root.left));
     	

    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}

