import static org.junit.Assert.*;

import org.junit.Test;

public class No3Tester {

	@Test
	public void test() {
		No3 n = new No3();
		assertEquals(0,n.lengthOfLongestSubstring(""));
		assertEquals(1,n.lengthOfLongestSubstring("a"));
		assertEquals(6,n.lengthOfLongestSubstring("WENYUWANG"));
		assertEquals(8,n.lengthOfLongestSubstring("CHANYUCHIEN"));
		assertEquals(4,n.lengthOfLongestSubstring("ntuee"));
		assertEquals(5,n.lengthOfLongestSubstring("ntuEe"));
		assertEquals(1,n.lengthOfLongestSubstring("bbbbbbbbbbbb"));
		assertEquals(2,n.lengthOfLongestSubstring("bbbbbBbbbbbb"));
	}

}
