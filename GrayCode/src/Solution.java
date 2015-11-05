import java.util.LinkedList;

public class Solution {
	public LinkedList<Integer> grayCode(int n) {
		LinkedList<Integer> ret = new LinkedList<Integer>();
		ret.add(0);
		
		for (int i =0; i<n; i++){
			int size = ret.size(); 
			for (int j = size-1; j>=0; j--){
				ret.add(ret.get(j)+size);
			}
		}
		
		return ret;
	}
}
