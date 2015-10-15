package houseRobber;

public class Solution {
    public int rob(int[] nums) {
    	if (nums==null || nums.length ==0) return 0;
    	int n = nums.length;
    	
    	int[] ret = new int[n+1];
    	ret[0] = 0;
    	ret[1] = nums[0];
    	
    	for (int i =2; i<n+1;i++){
    		ret[i] = Math.max(nums[i-1]+ret[i-2], ret[i-1]);
    	}
    	
    	return ret[n];
    }
}
