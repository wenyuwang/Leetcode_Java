
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
}

