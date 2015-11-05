
public class Solution {
    public int findPeakElemen1(int[] nums) {
    	int ret =Integer.MIN_VALUE;
    	int retInd = 0;
    	for (int i =0; i < nums.length; i++){
    		if (nums[i] > ret){
    			ret = nums[i];
    			retInd = i;
    		}
    	}
    	
    	return retInd;
    }
    
    public int findPeakElemen2(int[] nums) {
    	int low=0, high = nums.length-1, mid =0; 
    	while (low < high){
    		mid = low + (high-low)/2;
    		if (nums[mid] < nums[mid+1]) low = mid +1;
    		else
    			high = mid;
    	}
    	return low;
    }
}
