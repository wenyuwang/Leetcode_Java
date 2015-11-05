
public class Solution {
    public void sortColors(int[] nums) {
        int count0 =0 , count1 = 0, count2 =0;
        for(int n : nums){
        	if (n == 0 ) count0++;
        	if (n == 1 ) count1++;
        	if (n == 2 ) count2++;
        }
        for (int i =0; i< nums.length;i++){
        	if ( i >= 0 && i < count0 ) nums[i]=0;
        	if ( i >= count0 && i < count0+count1) nums[i]=1;
        	if ( i >= count0+count1 && i < count0+count1+count2) nums[i]=2;
        }
    }
}
