import java.util.ArrayList;
import java.util.Stack;

public class Solution {
	class MinStack {
		Stack<Integer> stack = new Stack<Integer>();  
		Stack<Integer> minStack = new Stack<Integer>(); 
	    public void push(int x) {
	        stack.push(x);
	        if (minStack.isEmpty() || minStack.peek() >= x)
	        	minStack.push(x);
	    }

	    public void pop() {
	    	if (stack.isEmpty()) return;
	    	
	    	if (stack.peek().equals(minStack.peek()))
	    		minStack.pop();
	    	stack.pop();
	        
	    }

	    public int top() {
	    	return stack.peek();
	        
	    }

	    public int getMin() {
	    	return minStack.peek();
	        
	    }
	}
}
