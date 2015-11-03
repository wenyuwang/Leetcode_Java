
public class Solution {
    public int search(int[] nums, int target) {
       int start = 0; int end = nums.length-1;
       while(start <= end ){
    	   int mid = (start + end)/2;
    	   if (target == nums[mid]) return mid;
    	   
    	   if (nums[mid] >= nums[start]){ // front part 
    		   
    		   if (nums[start] <= target && target <= nums[mid])
    			   end = mid-1 ;
    		   else 
    			   start = mid+1;
    	   }
    	   else { // nums[mid] < nums[start]
    		   if (nums[mid] < target && target <= nums[end])
    			   start = mid+1 ;
    		   else 
    			   end = mid-1;
    	   }

       }
      
       return -1;
    }
}
