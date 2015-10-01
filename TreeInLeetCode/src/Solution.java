
public class Solution {
	
	public boolean isBalanced(TreeNode root) {

		if(root == null) return true;
		if(root.right == null && root.left == null) return true;
		if(Math.abs(  nodeCount(root.left)-nodeCount(root.right) )>1) return false;


		return isBalanced(root.left) && isBalanced(root.right) ; 
	}
	
	
	public int nodeCount (TreeNode root){

		if (root == null) return 0;

		return 1+Math.max(nodeCount(root.left), nodeCount(root.right));
	}

	
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
