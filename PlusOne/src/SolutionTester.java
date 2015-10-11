import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTester {

	@Test
	public void test() {
		int[] digits1= new int[] {1,2,3,9};
		for (int i =0 ; i<4; i++){
			System.out.println(Solution.plusOne(digits1)[i]);
		}
	}

}
