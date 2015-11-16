import java.util.Stack;

public class Solution {
	public class BSTIterator {
		  /**
	     * Precondition: the top of the stack is current smallest node (t)
	     *               whose value will be returned
	     * 
	     * Postcondition: the top of the stack is the next smallest node.
	     * 
	     * if the t has right node, the next smallest node will be the left 
	     * most of the right node; otherwise, the next smallest node is t's parent node, 
	     * which has already been pushed on the stack just before the t. 
	     * */
		private Stack<TreeNode> stack = null;
		public BSTIterator(TreeNode root) {
			/** push all the nodes from c to its left most node to the stack */
			stack = new Stack<TreeNode>();
			TreeNode n = root;
			while (n!= null){
				stack.push(n);
				n = n.left;
			}
		}

		/** @return whether we have a next smallest number */
		public boolean hasNext() {
			return !stack.isEmpty();
		}

		/** @return the next smallest number */
		public int next() {
			if (hasNext()){
				int ret = stack.peek().val;
				TreeNode n = stack.pop();
				
				if (n.right!=null){
					n = n.right;
					while (n!= null){
						stack.push(n);
						n=n.left;
					}
				}
				return ret;
			}
			return -1;
		}
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
