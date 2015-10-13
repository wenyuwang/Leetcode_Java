
import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		ArrayList<Integer> nodeValues = new ArrayList<>();
		
		if (root == null) return result;
		
		// Two queues to go through each node
		LinkedList<TreeNode> current = new LinkedList<>();
		LinkedList<TreeNode> next = new LinkedList<>();
		current.add(root);
		
		while(!current.isEmpty()){
			
			TreeNode node = current.remove();
			if( node.left != null){
				next.add(node.left);
			}
			if( node.right != null){
				next.add(node.right);
			}
			
			nodeValues.add(node.val);
			
			if( current.isEmpty()){
				current = next;
				next  = new LinkedList<>();
				result.add(nodeValues);
				nodeValues = new ArrayList<>();
			}
			
		}
		return result;
		
    }
    
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}


}
