package isPower2;

public class Solution {
    public static boolean isPowerOfTwo(int n) {
    	return n >0 &&  ( (n&(n-1) )==0);
    }
}
