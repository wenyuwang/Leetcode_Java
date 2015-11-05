
public class Solution {
    public int uniquePaths(int m, int n) {
        
    	if (m==1 || n == 1) return 1;
    	m--;
    	n--;
    	if (m < n) {
    		m = m + n;
            n = m - n;
            m = m - n;
    	}
    	
    	long ret = 1;
    	for (int i = m+1, j=1; i <= m+n ; i++,j++){
    		ret *= i ;
    		ret /= j ;
    		
    	}
    	
    	return (int) ret;
    	
    	
    }
}
