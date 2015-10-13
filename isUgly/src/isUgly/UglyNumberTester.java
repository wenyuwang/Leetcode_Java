package isUgly;

import static org.junit.Assert.*;

import org.junit.Test;

public class UglyNumberTester {

	@Test
	public void test() {
		assertEquals(true, UglyNumber.isUgly(1));
		assertEquals(true, UglyNumber.isUgly(4));
		assertEquals(true, UglyNumber.isUgly(9));
		assertEquals(true, UglyNumber.isUgly(25));
		assertEquals(false, UglyNumber.isUgly(14));
		assertEquals(false, UglyNumber.isUgly(22));
		assertEquals(false, UglyNumber.isUgly(51));
		assertEquals(false, UglyNumber.isUgly(26));
		assertEquals(false, UglyNumber.isUgly(95));
		assertEquals(false, UglyNumber.isUgly(28));
	}

}
