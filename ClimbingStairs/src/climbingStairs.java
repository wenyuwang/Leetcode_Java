
public class climbingStairs {
    public static int climbStairs(int n) {
        
       if(n==0 || n==1 || n==2 ) return n;
        return climbStairs(n-1)+climbStairs(n-2);
        
        // recursive is too slow!
    }
    
    //dynamic programming
    public static int climbStairs2(int n) {
        
        if(n==0 || n==1 || n==2 ) return n;
        
        int [] ret = new int [n+1];
        ret[0] = 0 ; ret[1]=1; ret[2]=2;
        for (int i=3; i<n+1;i++){
        	ret[i] = ret [i-1]+ret[i-2];
        }
        
        return ret[n];
     }
}
