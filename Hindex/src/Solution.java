import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        if (citations == null) return 0;
        Arrays.sort(citations);
        int len  = citations.length;
        for (int i =0; i< citations.length; i++){
        	if (len <= citations[i])
        		return len;
        	
        	else len --;
        }
        return len;
    }
}
