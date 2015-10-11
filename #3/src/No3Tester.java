import static org.junit.Assert.*;

import org.junit.Test;

public class No3Tester {

	@Test
	public void testSol1() {
		No3 n = new No3();
		assertEquals(0,n.lengthOfLongestSubstringSol1(""));
		assertEquals(1,n.lengthOfLongestSubstringSol1("a"));
		assertEquals(6,n.lengthOfLongestSubstringSol1("WENYUWANG"));
		assertEquals(8,n.lengthOfLongestSubstringSol1("CHANYUCHIEN"));
		assertEquals(4,n.lengthOfLongestSubstringSol1("ntuee"));
		assertEquals(5,n.lengthOfLongestSubstringSol1("ntuEe"));
		assertEquals(1,n.lengthOfLongestSubstringSol1("bbbbbbbbbbbb"));
		assertEquals(2,n.lengthOfLongestSubstringSol1("bbbbbBbbbbbb"));
	}

	@Test
	public void testSol2() {
		No3 n = new No3();
		assertEquals(0,n.lengthOfLongestSubstringSol2(""));
		assertEquals(1,n.lengthOfLongestSubstringSol2("a"));
		assertEquals(6,n.lengthOfLongestSubstringSol2("WENYUWANG"));
		assertEquals(8,n.lengthOfLongestSubstringSol2("CHANYUCHIEN"));
		assertEquals(4,n.lengthOfLongestSubstringSol2("ntuee"));
		assertEquals(5,n.lengthOfLongestSubstringSol2("ntuEe"));
		System.out.println(n.lengthOfLongestSubstringSol2("bbbbbbbbbbbb"));
		assertEquals(2,n.lengthOfLongestSubstringSol2("bbbbbBbbbbbb"));
	}
}
