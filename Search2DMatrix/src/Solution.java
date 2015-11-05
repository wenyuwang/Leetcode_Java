
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    	
    	for (int i = 0 ; i < matrix[0].length ; i++){
    		int low = 0, high = matrix.length-1, mid =0;
    		while(low < high){
    			mid = low + (high-low)/2;
    			if (matrix[i][mid] == target) return true;
    			if (matrix[i][mid] < target) low = mid -1;
    			else 
    				low = mid +1 ;
    			
    			
    		}
    	}
    	
    	return false;
    }
}
