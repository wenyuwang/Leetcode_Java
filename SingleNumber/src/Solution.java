import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : nums){
        	if (!set.add(i))
        		set.remove(i);
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }
    
    public int singleNumber2(int[] nums) {
       int x =0;
       for (int i : nums){
    	   x = x ^ i;
       }
       return x;
    }
}
