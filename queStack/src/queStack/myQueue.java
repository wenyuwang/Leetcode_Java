package queStack;

import java.util.Stack;

/**Implement the following operations of a queue using stacks.
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
**/
public class myQueue {
	
	
	Stack<Integer> value = new Stack<>();
	
    // Push element x to the back of queue.
    public void push(int x) {
        value.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
    	Stack<Integer> temp = new Stack<>();
    	while(!value.isEmpty()){
    		temp.push(value.pop());
    	}
    	temp.pop();
    	while(!temp.isEmpty()){
    		value.push(temp.pop());
    	}
        
    }

    // Get the front element.
    public int peek() {
    	Stack<Integer> temp = new Stack<>();
        temp.addAll(value);
        for (int i =0; i<value.size()-1; i++){
        	temp.pop();
        }
        return temp.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return (value.isEmpty());
    }
}
