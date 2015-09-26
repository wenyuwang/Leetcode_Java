import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTester {

	@Test
	public void test() {
		Solution s1 = new Solution();
		assertEquals("aba", s1.longestPalindrome("abac"));
		assertEquals("abcccba", s1.longestPalindrome("eabcccbad"));
		assertEquals("oaobccdccboao", s1.longestPalindrome("oaobccdccboaoik"));

		
	}

}
