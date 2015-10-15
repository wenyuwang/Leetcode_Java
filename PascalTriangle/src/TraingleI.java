
import java.util.ArrayList;

public class TraingleI {
    public ArrayList<ArrayList<Integer>> generateI(int numRows) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        
        if (numRows<=0) return ret;
        for (int i=0; i<numRows;i++){
        	ArrayList<Integer> cur = new ArrayList<Integer>();
        	for (int j=0; j<=i;j++){
        		if(j==0) cur.add(1);
        		else if (j<i){
        			cur.add(ret.get(i-1).get(j-1) + ret.get(i-1).get(j));
        		}
        		else if (j==i) cur.add(1);
        	}
        		ret.add(cur);
        	}     	
      
    	return ret;
    }
}
