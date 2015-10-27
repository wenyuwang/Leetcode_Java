package binaryTreePath;

import java.util.ArrayList;

public class Solution {
    public ArrayList<String> binaryTreePaths(TreeNode root) {
    	ArrayList<String> ret = new ArrayList<String>();
    	if (root == null) return ret;
    	
    	dfs(root,new StringBuilder(), ret);
    	
    	return ret;
    }
    
    public void dfs(TreeNode root , StringBuilder sb , ArrayList<String> ret){
    	if (root.right == null && root.left==null){
    		sb.append(root.val);
    		ret.add(sb.toString());
    		return ; 
    	}
    	
    	sb.append(root.val);
    	sb.append("->");
    	
    	if(root.left!=null){
    		dfs(root.left, new StringBuilder(sb), ret);
    	}
    	if (root.right!=null){
    		dfs(root.right, new StringBuilder(sb), ret);
    	}
    }
    
    public class TreeNode {
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int x) { val = x; }
    }
}
