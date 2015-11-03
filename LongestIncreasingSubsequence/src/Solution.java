
public class Solution {
    public static int lengthOfLIS(int[] nums) {
    	if (nums.length == 0 || nums == null ) return 0;
    	
    	int [] ret = new int[nums.length];
    	for(int i=0;i<nums.length;i++){
    		ret[i] = 1;
    	}
    	
    	for(int i =0; i < nums.length; i++){
    		for(int j = 0 ; j<i;j++){
    			if (nums[j] < nums[i] ){
    				ret[i] = Math.max(ret[i], ret[j]+1);
    			}
    		}
    	}
    	int result =1;
    	for (int i =0; i<ret.length;i++){
    		result = Math.max(ret[i], result);
    	}
    	
    	return result;
    }
    
    

}
