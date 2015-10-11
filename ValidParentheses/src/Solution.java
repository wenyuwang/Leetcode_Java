import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
    	Stack<Character> stack = new Stack<Character>();
    	
    	for (int i =0; i<s.length(); i++){
    		char currentChar = s.charAt(i);
    		if(currentChar == '(' || currentChar == '{' ||currentChar == '[' ){
    			stack.push(currentChar);
    		}
    		else if(currentChar == ')' || currentChar == '}' ||currentChar == ']'){
    			if (stack.isEmpty()) return false;
    			char popChar = stack.pop();
    			if(s.charAt(i) ==')' && popChar != '(') return false;
    			if(s.charAt(i) =='}' && popChar != '{') return false;
    			if(s.charAt(i) ==']' && popChar != '[') return false;
    		}
    	}
    	
        return stack.size()==0;
    }
}
