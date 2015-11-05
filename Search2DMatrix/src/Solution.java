
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    	return recursionSearch(matrix,target,0,matrix.length*matrix[0].length-1);
    }
    private boolean recursionSearch(int [][] matrix, int target, int left, int right){
    	int mid = (left + right ) /2;
    	int a = matrix[mid/matrix[0].length][mid%matrix[0].length];
    	if (target == a) return true;
    	if (left == right ) return false;
    	if (target < a ) return recursionSearch(matrix, target, left , mid);
    	else return recursionSearch(matrix,target,mid+1,right);
    }
}
