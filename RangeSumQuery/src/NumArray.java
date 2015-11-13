
public class NumArray {
	private int[] num ;
	public NumArray(int[] nums) {
		num = nums;
	}
	public int sumRange(int i, int j) {
		if (j - i <0) return 0;
		int sum = 0;
		for (int x = i ; x <=j ; x++){
			sum += num[x];
		}

		return sum;
	}
}
