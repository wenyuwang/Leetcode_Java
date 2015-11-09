import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

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
    
    
    
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        return combination(candidates, target, 0);
    }
    private ArrayList<ArrayList<Integer>> combination (int[] candidates, int target, int start){
    	
    	ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
    	Arrays.sort(candidates);
    	
    	for (int i = start; i<candidates.length;i++){
    		if(candidates[i] < target){
    			for (ArrayList<Integer> array : combination(candidates,target-candidates[i],i)){
    				array.add(0,candidates[i]);
    				ret.add(array);
    				
    			}
    		}else if (candidates[i]== target){
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(candidates[i]);
				ret.add(list);
			}else 
				break;
    		
    	}
    	
    	return ret;
    	
    }
}
