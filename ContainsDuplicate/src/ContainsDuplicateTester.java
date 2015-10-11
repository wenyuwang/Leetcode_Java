import static org.junit.Assert.*;

import org.junit.Test;

public class ContainsDuplicateTester {

	@Test
	public void test() {
		ContainsDuplicate p = new ContainsDuplicate ();
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {1,2,2,4,5};
		int[] array3 = {1,2,3,4,5,7,8,9,0};
		int[] array4 = {1,2,3,4,5,1,2,3,4,5};
		int[] array5 = {1,1,1,1,1};
		int[] array6 = {1};
		int[] array7 = {};
		int[] array8 = {1,2,3,1,1,1,1,1,1,1,1,1};
	
		assertEquals(false,p.containsDuplicate(array1 ));
		assertEquals(true,p.containsDuplicate(array2 ));
		assertEquals(false,p.containsDuplicate(array3 ));
		assertEquals(true,p.containsDuplicate(array4 ));
		assertEquals(true,p.containsDuplicate(array5 ));
		assertEquals(false,p.containsDuplicate(array6 ));
		assertEquals(false,p.containsDuplicate(array7 ));
		assertEquals(true,p.containsDuplicate(array8 ));
	}

}
