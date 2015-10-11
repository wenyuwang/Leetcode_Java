
public class reverseInteger {
    public int reverse(int x) {
    	double ret=0;
    	while (x !=0){
    		int modeX = x %10; 
    		x = x/10;
    		ret = ret*10+modeX;
    	}
    	
    	if (ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE) ret = 0;
    	return (int) ret;
    }
}
