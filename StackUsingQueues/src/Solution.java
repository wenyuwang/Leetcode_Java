
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    // Push element x onto stack.
	
	private Queue<Integer> q = new LinkedList<>();
    public void push(int x) {
    	q.offer(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
    	int size = q.size();
    	for (int i =1 ; i<size ;i++){
    		q.offer(q.poll());
    	}
        q.poll();
    }

    // Get the top element.
    public int top() {
    	
    	int size = q.size();
    	for (int i =1 ; i<size ;i++){
    		q.offer(q.poll());
    	}
    	int top= q.peek();
    	q.offer(q.poll());
    	
    	return top;
        
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return (q.isEmpty());
    }
}
