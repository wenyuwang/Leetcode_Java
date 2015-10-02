package moveZeros;

public class Solution {
	
    public static void moveZeroes(int[] nums) {
        int i = -1; int j =0;
        while ( j <nums.length ){
        	if(nums[j] !=0 ) swap(++i, j , nums);
        	j++;
        }
        
    }
	

	public static void swap (int i, int j,int[] nums){
		int t = nums[i];
		nums[i] = nums[j];
		nums[j]= t;
	}
}
