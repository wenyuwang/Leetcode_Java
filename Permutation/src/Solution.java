import java.util.ArrayList;

public class Solution {
	ArrayList<ArrayList<Integer>> list;
    public ArrayList<ArrayList<Integer>> permute(int[] nums) {
       list = new ArrayList<>();
       ArrayList<Integer> perm = new ArrayList<Integer>();
       backTrack (perm,0,nums);
       return list;
    }
    private void backTrack(ArrayList<Integer> perm, int i, int[]nums){
    	if (i == nums.length){
    		list.add(new ArrayList(perm));
    		return;
    	}
    	
    	ArrayList<Integer> newPerm = new ArrayList<>(perm);
    	for (int j = 0 ; j<=i ;j++){
    		newPerm.add(j, nums[i]);
    		backTrack(newPerm,i+1,nums);
    		newPerm.remove(j);
    	}
    }
}
