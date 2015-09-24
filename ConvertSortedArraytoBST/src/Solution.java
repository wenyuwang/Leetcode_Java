
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
    
}
