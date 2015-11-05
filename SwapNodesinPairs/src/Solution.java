
public class Solution {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next ==null) return head;
		
		ListNode n1 = head;
		ListNode n2 = head.next;
		
		n1.next = n2.next;
		n2.next = n1;
		
		n1.next = swapPairs(n1.next);
		return n2;
		
	}
}
