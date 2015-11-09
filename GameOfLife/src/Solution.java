
public class Solution {
	int[][] direction = {{-1,-1}, {0,-1},{1,-1},{-1,0},{1,0},{-1,1}, {0,1},{1,1}};
    public void gameOfLife(int[][] board) {
    	
    	int m = board.length;
    	int n = board[0].length;
    	for (int i =0; i< m ; i++){
    		for(int j = 0 ; j<n;j ++){
    			int life =0;
    			
    			for (int[] d : direction){
    				if (d[0] + i <0 || d[0] + i >= m || d[1] + j < 0 || d[1] + j >= n) continue;
    				if (board[d[0]+i][d[1]+j] == 1 || board[d[0]+i][d[1]+j] == 2 ) life ++;
    			}
    			if (board[i][j] == 0 && life ==3 ) board[i][j] =3 ;
    			if (board[i][j] == 1 && ( life < 2 || life >3)) board[i][j] =2 ;
    		}
    	}
    	for (int i =0; i< m ; i++){
    		for(int j = 0 ; j<n;j ++){
    			board[i][j] =board[i][j]%2; 
    		}
    	}
        
    }
}
