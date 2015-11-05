
public class SolutionI {

	/*Best Time to Buy and Sell Stock*/
    public int maxProfit(int[] prices) {
    	 
    	int min = Integer.MAX_VALUE, max = 0;
    	for (int i = 0 ; i < prices.length;i ++){
    		min = Math.min(min, prices[i]);
    		max = Math.max(max, prices[i] - min);
    	}
    	return max;
    }
	/*Best Time to Buy and Sell Stock II */
	
	public int maxProfitII(int[] prices) {
		int profit = 0;
		for (int i = 1; i<prices.length;i++){
			int diff = prices[i] - prices[i-1];
			if (diff >=0)
				profit += diff;
		}

		return profit;
	}
}
