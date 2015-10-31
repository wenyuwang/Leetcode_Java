
public class Solution {
	public String getHint(String secret, String guess) {
		if (secret == null || guess==null || secret.length() != guess.length() )
			return "";

		int bulks =0;
		int cows = 0;
		int[] numbers = new int[10];

		for(int i = 0; i<guess.length() ; i ++){
			if (secret.charAt(i) == guess.charAt(i)) bulks ++;
			else{
				if (numbers[secret.charAt(i) - '0']++ <0) cows ++;
				if (numbers[guess.charAt(i) - '0']-- >0) cows ++;
			}
		}
		return bulks + "A" + cows + "B";
	}
}
