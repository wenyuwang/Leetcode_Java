
public class Solution {
	
	public boolean isBalanced(TreeNode root) {

		if(root == null) return true;
		if(root.right == null && root.left == null) return true;
		if(Math.abs(  maxDepth(root.left)-maxDepth(root.right) )>1) return false;


		return isBalanced(root.left) && isBalanced(root.right) ; 
	}
	
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p==null && q==null) return true;
        if (p == null || q== null ) return false;
        
        return(p.val == q.val &&
                isSameTree(p.right, q.right) && isSameTree(p.left, q.left));
        
    }
    
    public TreeNode invertTree(TreeNode root) {
    	if(root == null) return root;
    	TreeNode left = root.left;
    	root.left = root.right;
    	root.right = left;
    	invertTree(root.left);
    	invertTree(root.right);
        return root;
    }
	
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	 
    	if(root.val > p.val && root.val<q.val) return root;
    	else if (root.val > p.val && root.val>q.val) 
    		return lowestCommonAncestor(root.left, p,  q);
    	else if (root.val < p.val && root.val<q.val) 
    		return lowestCommonAncestor(root.right, p,  q);
    	
    	return root;
     
    }
    
    
	public int maxDepth (TreeNode root){

		if (root == null) return 0;

		return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
	}

	
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
