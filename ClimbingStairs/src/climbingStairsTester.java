import static org.junit.Assert.*;

import org.junit.Test;

public class climbingStairsTester {

	@Test
	public void test() {
		assertEquals(1,climbingStairs.climbStairs(1));
		assertEquals(2,climbingStairs.climbStairs(2));
		assertEquals(3,climbingStairs.climbStairs(3));
		assertEquals(3,climbingStairs.climbStairs(3));
		assertEquals(5,climbingStairs.climbStairs(4));
		
		assertEquals(1,climbingStairs.climbStairs2(1));
		assertEquals(2,climbingStairs.climbStairs2(2));
		assertEquals(3,climbingStairs.climbStairs2(3));
		assertEquals(3,climbingStairs.climbStairs2(3));
		assertEquals(5,climbingStairs.climbStairs2(4));
	}

}
