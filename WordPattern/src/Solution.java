import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length ) return false;
        Map index = new HashMap<>();
        for (int i =0; i <words.length; i++){
        	if (!Objects.equals(index.put(words[i], i), index.put(pattern.charAt(i), i)))
        		return false;
        }
        return true;
    }
}
