package strStr;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() ==0 || needle.length() == 0 || haystack == null || needle == null )
        	return 0;
        if(needle.length() > haystack.length() )
        	return -1;
        
        for(int i =0; i <= haystack.length() - needle.length() ; i ++){
        	
        	boolean flag = true;
        	
        	for (int j =0; j<needle.length();j++){
        		if(haystack.charAt(i+j)!= needle.charAt(j)){
        			flag = false;
        			break;
        		}
        	}
        	
        	if(flag) 
        		return i;
        }
    	return -1;
    }
}
