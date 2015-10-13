package happyNumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class happyNumberTester {

	@Test
	public void test() {
		happyNumber a = new happyNumber();
		assertEquals(true, a.isHappy(19));
		

	}

}
