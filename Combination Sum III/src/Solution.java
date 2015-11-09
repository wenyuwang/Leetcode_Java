import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum3(int k, int n) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
        backTrack(lists, new ArrayList<Integer>(),1, k, n );
        return lists;
    }
    private void backTrack (ArrayList<ArrayList<Integer>> lists, ArrayList<Integer> list, int start, int k , int target){
    	
    	if (target == 0 && k ==0){
    		lists.add(new ArrayList<Integer>(list));
    		return ;
    	}
    	
    	for (int i = start; i <= 10-k && i<= target; i++){
    		list.add(i);
    		backTrack(lists,list,i+1,k-1,target-i);
    		lists.remove(list.size()-1);
    	}
    }
}
