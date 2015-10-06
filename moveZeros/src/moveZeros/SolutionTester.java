package moveZeros;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTester {

	@Test
	public void test() {
		int[] a1 = {0,0,0,0,0,0};
		Solution.moveZeroes(a1);
		for (int a : a1){
			System.out.println("a1 " + a);
		}
		
		int[] a2 = {0,1,0,4,8,0};
		Solution.moveZeroes(a2);
		for (int a : a2){
			System.out.println("a2 " + a);
		}
	}

}
