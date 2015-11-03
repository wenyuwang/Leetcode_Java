
public class Solution {
    public int maxSubArray(int[] nums) {
    	
    	int sum = detect(nums);
    	if (sum < 0)
    		return sum;
    	int max = nums[0];
    	for (int i =0; i<nums.length; i++){
    		sum += nums[i];
    		sum = Math.max(0, sum);
    		max = Math.max(sum, max);
    	}
        return max;
    }
    
    private static int detect (int[] nums){
    	
    	int max = nums[0];
    	for (int i =0; i < nums.length;i++){
    		if (nums[i] >=0 ) 
    			return 0;
    		max = Math.max(max, nums[i]);
    	}
    	return max;
    }
}
