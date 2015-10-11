import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTester {

	@Test
	public void test() {
		assertEquals(true,Solution.isValid("()"));
		assertEquals(true,Solution.isValid("[()]"));
		assertEquals(true,Solution.isValid("{([])}"));
		assertEquals(true,Solution.isValid("[[{[()]}]]"));
		assertEquals(true,Solution.isValid("(([{}[]()]))"));
		assertEquals(false,Solution.isValid("[()"));
		assertEquals(false,Solution.isValid("{(]"));
	}

}
