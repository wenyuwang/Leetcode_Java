
public class Solution {
    public static int maxArea1(int[] height) {
    	int maxArea = 0;
    	if(height.length < 2 ) return 0 ;
        for (int i =0; i<height.length ; i++){
        	int currentBL = height[i];
        	for(int j = i; j<height.length;j++){
        		int currentLL = height[j];
        		int h = ( currentBL >= currentLL) ? currentLL : currentBL;
        		int curArea = h * (j-i);
        		if (curArea > maxArea) {
        			maxArea = curArea;
        		}
        	}
        
        }
        
        return maxArea;
    }
    
    public static int maxArea2(int[] height) {
    	if(height.length < 2 ) return 0 ;
    	int maxArea = 0;
    	int left = 0, right = height.length-1;
    	while (left < right ){
    		maxArea = Math.max(maxArea , (right-left)* Math.min(height[right], height[left]));
    		if(height[left] < height[right])
    			left ++;
    		else 
    			right --;
    	}
    	return maxArea;

    }
}
