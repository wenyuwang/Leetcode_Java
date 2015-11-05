
public class Solution {
	static int ret = 0;
	public int kthSmallest(TreeNode root, int k) {
		helper(root,k);
		return ret;
	}
	private int helper (TreeNode root, int k){
		if (root == null) return 0;
		
		int leftChild = helper(root.left, k);
		int rightChild = helper(root.right, k-leftChild-1);
		if (k == leftChild +1 ){
			ret = root.val;
		}
		return leftChild+rightChild+1;
	}
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
