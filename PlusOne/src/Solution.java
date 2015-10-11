
public class Solution {
    public static int[] plusOne(int[] digits) {
        if(digits.length ==0 || digits == null) return digits;
        int carry =1;
        
        for (int i = digits.length-1; i >=0; i--){
        	if (carry ==0) break;

        	if (digits[i] ==9){

        		digits[i] =0;

        	}
        	else{
        		digits[i] +=1;
        		carry =0;
        	}
        	
        	
        }
    	
        if(carry == 0)
    		return digits;
        int[] ret = new int[digits.length+1];
        for(int i=0;i<digits.length;i++){
            ret[i+1]=digits[i];
        }
        ret[0] = 1;
    	return ret;
    }
}
