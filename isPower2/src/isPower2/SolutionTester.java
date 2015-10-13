package isPower2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTester {

	@Test
	public void test() {
		assertEquals(true,Solution.isPowerOfTwo(4));
		assertEquals(true,Solution.isPowerOfTwo(8));
		assertEquals(true,Solution.isPowerOfTwo(16));
		assertEquals(true,Solution.isPowerOfTwo(32));
		assertEquals(true,Solution.isPowerOfTwo(64));
		assertEquals(false,Solution.isPowerOfTwo(5));
		assertEquals(false,Solution.isPowerOfTwo(9));
		assertEquals(false,Solution.isPowerOfTwo(17));
	}

}
