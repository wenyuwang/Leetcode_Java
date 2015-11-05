import java.util.ArrayList;

public class Solution {
	
	ArrayList<String> list = new ArrayList<String>();
    public ArrayList<String> generateParenthesis(int n) {
        generate(n,n,"");
        return list;
    }
    public void generate(int left, int right, String s){
    	if (left == 0 && right ==0 ){
    		list.add(s);
    	}
    	if (left >0)
    		generate(left-1 , right, s+"(");
    	if (right >0 && right > left)
    		generate(left , right-1, s+")");
    }
}
