import java.awt.List;
import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> summaryRanges(int[] nums) {
        ArrayList<String> ret = new ArrayList<String>();
        if (nums == null || nums.length <1 ) return ret;
        int s =0, e = 0;
        while (e<nums.length){
        	if (e+1 < nums.length && nums[e+1] == nums[e]+1)
        		e ++ ;
        	else {
        		if (s == e)
        			ret .add(Integer.toString(nums[s]));
        		else {
        			ret.add (Integer.toString(nums[s])+"->" +Integer.toString(nums[e]));
        		}
        		++e;
            	s=e;
        	}
        }
        return ret;
    }
}
