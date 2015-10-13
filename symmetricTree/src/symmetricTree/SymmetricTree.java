package symmetricTree;

import java.util.LinkedList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//Recursive Method

public class SymmetricTree {
    public boolean isSymmetricR(TreeNode root) {
    	
    	if (root == null) return true;
    	
    	return isSymmetric(root.left,root.right);
    	
    }
    
    public boolean isSymmetric(TreeNode a, TreeNode b) {
    	
    	if (a == null) return (b==null);
    	if (b == null) return false;
    	if (! (a.val == b.val)) return false;

    	if (!isSymmetric(a.left,b.right)) return false;
    	if (!isSymmetric(a.right,b.left)) return false;
    	
    	return true;
        
    }
    
    // Iterative
    
    public boolean isSymmetricIter(TreeNode root) {
    	if (root == null) return true;
    	LinkedList<TreeNode> left = new LinkedList<>();
    	LinkedList<TreeNode> right = new LinkedList<>();
    	
    	left.add(root.left);
    	right.add(root.right);
    	
    	while(!left.isEmpty() && !right.isEmpty()){
    		TreeNode temp1 = left.pop();
    		TreeNode temp2 = right.pop();
    		if( temp1 != null && temp2 == null || temp1 == null && temp2 != null)
    			return false;
    		
    		if (temp1 != null) {
	    		if( temp1.val != temp2.val) 
	    			return false;
	    		
	    		left.add(temp1.left);
	    		left.add(temp1.right);
	    		right.add(temp2.right);
	    		right.add(temp2.left);
    		}
    	}
    	
    	return true;
    	
    }
    
    
    
    //TreeNode Class
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}


