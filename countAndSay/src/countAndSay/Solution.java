package countAndSay;

public class Solution {
	public static String countAndSay(int n) { 
		if (n == 1) return "1";
		String s = "1";
		StringBuffer ret = new StringBuffer();
		int count = 0;
		int round = 1;
		int i ;
		while( round != n ){
			count = 1;
			ret.setLength(0);
			for (i=1; i<s.length(); i++){
				if (s.charAt(i) == s.charAt(i-1)){
					count ++; 
				}
				else {
					ret.append(count).append(s.charAt(i-1));
					count = 1;
				}
			}
			ret.append(count).append(s.charAt(i-1));
			s = ret.toString();
			round = round +1;
		}
		return ret.toString();
	}
}
