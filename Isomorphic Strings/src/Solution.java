import java.util.HashMap;
import java.util.Objects;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
    	if (s.length() != t.length() ) return false;
    	if (s == null || t==null ) return false;
    	if (s.length() ==0 && t.length() ==0) return true;
    	HashMap<Character,Character> maps = new HashMap<Character,Character>();
    	HashMap<Character,Character> mapt = new HashMap<Character,Character>();
    	for (int i = 0; i <t.length(); i++){
    		char chs = s.charAt(i);
    		char cht = t.charAt(i);
    		
    		if(maps.containsKey(chs)){
    			if(maps.get(chs) != cht) return false;
    		}
    		if(mapt.containsKey(cht)){
    			if(mapt.get(cht) != chs) return false;
    		}
    		
    		maps.put(chs, cht);
    		mapt.put(cht, chs);
    	}
    	return true;
    }
}
