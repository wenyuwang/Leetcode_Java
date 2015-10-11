
public class Solution {
    public String longestPalindrome(String s) {
        String ret = "";
        int maxLength = 0 ;
        if(s.length() == 0 || s == null)
        	return ret;
        
        for (int i = 0; i<2*s.length()-1; i++){
        	int left = i/2;
        	int right = i/2;
        	if ( i%2 == 1) right = right+1;
        	String getString = findPalin(s,left,right);
        	if (maxLength < getString.length()){
        		maxLength = getString.length();
        		ret = getString;
        	}
        }
        return ret;
    }
    
    public String findPalin(String s, int left, int right){
    	while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
    		left --;
    		right ++;
    	}
    	return s.substring(left+1, right);
    }
    
    public int lengthOfLongestSubstring(String s) {
    	if(s == null || s.length() == 0) return 0;
    	int maxLength = 0;
    	boolean [] flag = new boolean[256];
    	char [] sc= s.toCharArray();
    	int result = 0 ; int start = 0;
    	
    	for(int i =0; i<s.length();i++){
    		char current = sc[i];
    		if (flag[current]){
    				result = Math.max(result, i-start);
    				for (int k = start; k<i; k++){
    					if(sc[k] == current){
    						start = k+1;
    						break;
    					}
    					flag[sc[k]] = false;
    			}
    		}
    		else{
    			flag[current] =true;
    		}
    	}
    	
    	return Math.max(result, sc.length-start);
    }
}

