
import java.util.ArrayList;

/*I.
 * Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/

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
    
    public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
    	if (rowIndex < 0) return ret;
        ret.add(1);
        for (int i =1 ; i<=rowIndex;i++){
        	for (int j = ret.size()-2; j>=0;j--){
        		ret.set(j+1, ret.get(j)+ret.get(j+1));
        	}
        	ret.add(1);
        }
        
    	return ret;
    }
}
