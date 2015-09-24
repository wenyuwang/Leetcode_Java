import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public TreeNode2 sortedArrayToBST(int[] nums) {
        
    	if (nums == null) return null;
    	
    	return sortedArrayToBST(nums, 0, nums.length-1) ;
    }
    
    public TreeNode2 sortedArrayToBST(int[] num, int start, int end) {
    	if (start > end ) return null;
        int middle = (start + end) /2 ;
        TreeNode2 root = new TreeNode2(num[middle]);
       
        root.left = sortedArrayToBST(num, start, middle - 1);
		root.right = sortedArrayToBST(num, middle + 1, end); 
		
		return root;
		}
    

    
    public ArrayList<Integer> rightSideView(TreeNode2 root) {
    	ArrayList<Integer> ret = new ArrayList<Integer>();
    	if (root == null) return ret;
    	
    	LinkedList<TreeNode2> queue = new LinkedList<TreeNode2>();
    	queue.add(root);
    	while(queue.size() != 0){
    		int size = queue.size();
    		for (int i =0; i<size; i++){
    			TreeNode2 top = queue.remove();
    			if(i ==0 ) ret.add(top.val);
    			if(top.right != null) queue.add(top.right);
    			if(top.left != null) queue.add(top.left);
    		}
    	}
    	
        return ret;
        
    }
}
