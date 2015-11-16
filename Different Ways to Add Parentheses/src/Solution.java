import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> ret = new ArrayList<Integer>();
        for (int i =0 ; i <input.length(); i ++){
        	char c = input.charAt(i);
        	if (c=='+' || c == '-' || c =='*'){
        		String a = input.substring(0,i);
        		String b = input.substring(i+1,input.length());
        		List<Integer> al = diffWaysToCompute(a);
        		List<Integer> bl = diffWaysToCompute(b);
        		
        		for (int x :al){
        			for(int y : bl){
        				if (c=='+'){
        					ret.add(x+y);
        				}else if (c=='-'){
        					ret.add(x-y);
        				}else if (c=='*'){
        					ret.add(x*y);
        				}
        			}
        		}
        	}
        }
        if (ret.size() ==0 ) ret.add(Integer.valueOf(input));
        
        return ret;
    }
}
