import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTester {

	@Test
	public void test() {
		int [] h1 = {3,4,5,2};
		assertEquals(6, Solution.maxArea2(h1));
	}

}
