
import java.util.HashMap; 

/*Given a string, find the length of the longest substring without repeating characters. 
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", 
 * which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 * */

public class No3 {
    public int lengthOfLongestSubstring(String s) {
        if ( s == null ) return 0;
        char [] sc = s.toCharArray();
        int preLength =0 ;
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (int i =0; i< s.length(); i++){
        	if (!map.containsKey(sc[i])){
        		map.put(sc[i],i);
        	}
        	else{
        		preLength= Math.max(preLength, map.size());
        		i = map.get(sc[i]);
        		map.clear();
        	}
        }
        
        
        return Math.max(preLength,map.size());
    }
}
