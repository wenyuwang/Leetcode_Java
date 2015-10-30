import java.awt.List;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 */

 
public class Solution {
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (root==null) return ret;
        Stack <TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
        	TreeNode tn = stack.pop();
        	ret.add(tn.val);
        	if (tn.right != null){
        		stack.push(tn.right);
        	}
        	if (tn.left != null){
        		stack.push(tn.left);
        	}
        }
        return ret;
    }
    
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (root==null) return ret;
        Stack <TreeNode> stack = new Stack<TreeNode>();
        TreeNode tn = root;
        while(!stack.isEmpty() || tn != null){
        	if(tn!=null){
        		stack.push(tn);
        		tn = tn.left;
        	}
        	else{
        		TreeNode p = stack.pop();
        		ret.add(p.val);
        		tn=p.right;
        	}
        }
        return ret;
    }
}

