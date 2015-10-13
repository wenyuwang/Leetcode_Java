/*Given an array and a value, ""remove all instances" of that value in place and "return the new length."
 * """"The order of elements can be changed.""
 *  It doesn't matter what you leave beyond the new length.
 *  
 *  Solution --> move all elements to the end
*/
public class Solution {
    public static int removeElement(int[] nums, int val) {
    	int length = nums.length;
    	int removedNum = 0;
    	int lastValid = length - 1;
    	int i =0;
    	
    	while(i <= lastValid){
    		if (nums[i] == val){
    			nums[i] = nums[lastValid];
    			lastValid --;
    			removedNum ++;
    		}
    		else{
    			i++;
    		}
    	}
    	
    	return (length-removedNum);
        
    }
}
