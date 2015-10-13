import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTeseter {

	@Test
	public void test() {
		int[] arr1 = {1,2,3,4,5,6,4,4,3,2,3,5,1,2,4,3,4,3,1};
		assertEquals( 14,Solution.removeElement(arr1,4));
		assertEquals( 17,Solution.removeElement(arr1,5));
		assertEquals( 16,Solution.removeElement(arr1,2));
	

	}

}
