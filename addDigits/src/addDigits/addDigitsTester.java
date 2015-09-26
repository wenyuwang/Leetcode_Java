package addDigits;

import static org.junit.Assert.*;

import org.junit.Test;

public class addDigitsTester {

	@Test
	public void test() {
		addDigits p1 = new addDigits();
		assertEquals(6,p1.addDigits(123));
		assertEquals(2,p1.addDigits(38));
	}

}
