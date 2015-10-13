
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	
    	if (headA == null || headB == null) return null;
    	
    	ListNode nodeA = headA;
    	ListNode nodeB = headB;
    	ListNode tailA = null;
    	ListNode tailB = null;
    	
    	while(true){
    		
    		if(nodeA == null) nodeA = headB;
    		if(nodeB == null) nodeB = headA;
    		if(nodeA.next == null) tailA = nodeA;
    		if(nodeB.next == null) tailB = nodeB;
    		
    		if(tailA != null && tailB != null && tailA!=tailB) return null;
    		if(nodeA == nodeB) return nodeA;
    		
    		nodeA = nodeA.next;
    		nodeB = nodeB.next;
     		
    	}
 
        
    }
    
    public class ListNode {
    	int val;
    	ListNode next;
    	ListNode(int x) {
    		val = x;
    		next = null;
    	}
    }
}
