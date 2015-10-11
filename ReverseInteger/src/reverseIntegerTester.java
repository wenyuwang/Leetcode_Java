import static org.junit.Assert.*;

import org.junit.Test;

public class reverseIntegerTester {

	@Test
	public void test() {
		reverseInteger p = new reverseInteger();
		assertEquals(123,p.reverse(321));
		assertEquals(0,p.reverse(0));
		assertEquals(21,p.reverse(120));
		assertEquals(0,p.reverse(1234556989));
		

	}

}
