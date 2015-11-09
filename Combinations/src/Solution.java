import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
    	
    	ArrayList<ArrayList<Integer>> Lists = new ArrayList<ArrayList<Integer>> ();
    	combine(Lists, new ArrayList<Integer>(),1,n,k );
        return Lists;
    }
    private static void combine(ArrayList<ArrayList<Integer>> Lists , ArrayList<Integer> list, int start , int n , int k){
    	
    	if (k == 0){
    		Lists.add(new ArrayList<Integer>(list));
    		return ;
    	}
    	for (int i = start ; i<=n ; i++){
    		list.add(i);
    		combine(Lists,list,i+1,n,k-1);
    		list.remove(list.size()-1);
    	}
    	
    }
}
