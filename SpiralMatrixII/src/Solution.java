
public class Solution {
	public int[][] generateMatrix(int n) {
		int [][] ret = new int[n][n];
		int row = 0, col= 0;
		int tag = 0 ;// tag ==0 right; 1 down ; 2 left 3 up
		int left =0, top =0, right = n-1, bottom = n-1;
		for (int m =1 ; m <= n*n ; m++){
			if (tag == 0){
				ret[row][col++] = m;
				if (col == right){
					tag = 1;
					top ++ ;
				}
			}else if (tag == 1){
				ret[row++][col] = m;
				if(row == bottom ){
					tag = 2;
					right --;
				}
			}else if (tag == 2){
				ret[row][col--] = m;
				if (col == left ){
					tag = 3;
					bottom --;
				}
			}else if (tag == 3){
				ret[row--][col] = m;
				if (row == top){
					tag = 0;
					left ++;
				}
			}
		}
		return ret;
	}
}
