package isPalindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class isPalidromeTester {

	@Test
	public void test() {
		isPalidrome p = new isPalidrome();
		assertEquals(true,p.isPalindrome("A man, a plan, a canal: Panama") );
		assertEquals(false,p.isPalindrome("puuuuuuuuuu") );
		assertEquals(true,p.isPalindrome("A but tuba,") );
		System.out.print(p.isPalindrome("A but tuba,"));
		assertEquals(true,p.isPalindrome("Gabe’s on a nosebag.") );
		
		
	}

}
