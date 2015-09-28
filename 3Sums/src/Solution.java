import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
    public static ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	if (nums.length < 3) return result;
    	
    	Arrays.sort(nums);
    	
    	for (int i =0 ; i <nums.length-2;i++){
    		if( i ==0 || nums[i] > nums[i-1]){
        		int negate = -nums[i] ;
        		int start = i+1;
        		int end = nums.length-1;
        		while(end > start){
        			if(nums[end] + nums[start] == negate){
        				ArrayList<Integer> temp = new ArrayList<Integer>();
        				temp.add(nums[i]);
        				temp.add(nums[start]);
        				temp.add(nums[end]);
        				
        				result.add(temp);
        				start ++;
        				end --;
        				while (start < end && nums[end] == nums[end+1]){
        					end --;
        				}
        				while (start < end && nums[start] == nums[start-1]){
        					start ++;
        				}
        			}
        			else if (nums[start] + nums[end] < negate){
        				start ++;
        			}
        			else {
        				end --;
        			}
        		}
    		}
    		
    		
    	}
    
    	return result;
    }
}
