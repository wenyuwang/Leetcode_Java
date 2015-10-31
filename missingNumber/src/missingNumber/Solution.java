package missingNumber;

public class Solution {
    public int missingNumber(int[] nums) {
    	
    	if (nums.length ==1 && nums[0] ==0) return 1;
    	if (nums.length ==1 && nums[0] ==1) return 0;
    	int length = nums.length;
    	int sum = (nums[0] + nums[length-1]) * length /2;
    	for (int i =0; i < length; i++){
    		sum -= nums[i];
    	}
    	return sum;
    }
}
