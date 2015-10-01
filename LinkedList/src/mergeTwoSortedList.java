
public class mergeTwoSortedList {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		ListNode newHead = new ListNode(0);
		ListNode curNode = newHead;
		ListNode p1 = l1;
		ListNode p2 = l2;
		
		// two lists are not null
		// iterate curNode one by one 
		while(p1 != null && p2!=null){
			if(p1.val <= p2.val){
				curNode.next = p1;
				p1=p1.next;
			}else{
			curNode.next = p2;
			p2 = p2.next;}
			
			curNode = curNode.next;
		}
		
		// if one of the lists is null
		if(p1 != null) curNode.next = p1;
		if(p2 != null) curNode.next = p2;
		
		return newHead.next;
	}
	
	
public ListNode mergeTwoListsRecursive(ListNode l1, ListNode l2) {
		
		
	// if one of the list is null, return the other one
	if (l1 == null ) return l2;
	if (l2 == null ) return l1; 
	
	ListNode node ;
	if( l1.val < l2.val){
		node = l1;
		node.next = mergeTwoListsRecursive(l1.next,l2);
	}
	
	else{
		node = l2;
		node.next = mergeTwoListsRecursive(l1,l2.next);
	}
	
	return node;
	}
	

	public ListNode reverseList(ListNode head) {
		
		if(head == null || head.next == null) return head;
		ListNode headNext = head.next;
		head.next = null;
		ListNode restList = reverseList(headNext);
		headNext.next = head;
		return restList;
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head == null  ) return head;
		int pos = getLength(head)-n;
		if (pos ==0 )return head.next;
		
		ListNode p = head;
		
		while(p!=null){
			if (pos ==1){
				//p.next.val = p.next.next.val;
				p.next = p.next.next;
			}
			p = p.next;
			pos --;
		}

		return head;
	}
	
    public ListNode removeElements(ListNode head, int val) {
    	
    	if(head == null) return null;
    	
    	ListNode curNode = head;
    	while(curNode.next != null){
    		if (curNode.next.val == val) curNode.next = curNode.next.next;

    		else curNode= curNode.next;
    	}
    	
    	 return head.val == val ? head.next : head;
    }
	
	public int getLength(ListNode head){
		int count =0;
		ListNode p = head;
		while(p!=null){
			p=p.next;
			count +=1;
		}
		return count;
	}
	
	/**
	 * Definition for singly-linked list.
	 */
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	 
}
