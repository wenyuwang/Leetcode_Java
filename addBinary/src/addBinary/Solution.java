package addBinary;

public class Solution {
    public static String addBinary(String a, String b) {
    	if (a.length() < b.length()){
    		String temp = a;
    		a = b ;
    		b = temp;
    	}
    	
    	int lenA = a.length()-1;
    	int lenB = b.length()-1; // lenA >= lenB
    	int carry = 0;
    	String ret = "";
    	
    	while(lenB>=0){
    		int sum =(int) (a.charAt(lenA)-'0') + (int)(b.charAt(lenB)-'0') + carry;
    		carry = sum/2;
    		ret = String.valueOf(sum%2) + ret;
    		lenA--;
    		lenB--;
    	}
    	while(lenA>=0){
    		int sum =(int) (a.charAt(lenA)-'0') + carry;
    		carry = sum/2;
    		ret = String.valueOf(sum%2) + ret;
    		lenA--;
    	}
    	
        
        return (carry ==0) ? ret : "1"+ret;
    }
}
