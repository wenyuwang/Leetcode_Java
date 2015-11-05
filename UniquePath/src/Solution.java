
public class Solution {
    public int uniquePaths(int m, int n) {
    	
    	// 總共要走 (m-1) + (n-1)步
    	// 排組
        
    	if (m==1 || n == 1) return 1;
    	m--;
    	n--;
    	if (m < n) {
    		int temp = m ;
    		m = n;
    		n = temp;
    		
    	}
    	
    	long ret = 1;
    	for (int i = m+1, j=1; i <= m+n ; i++,j++){
    		ret *= i ;
    		ret /= j ;
    		
    	}
    	
    	return (int) ret;
    	
    	
    }
}
