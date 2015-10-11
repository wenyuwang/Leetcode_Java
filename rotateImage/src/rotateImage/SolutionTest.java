package rotateImage;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		int[][] test = {{1,2,3},
						{4,5,6},
						{7,8,9}};
		
		Solution.rotate(test);
		for (int i =0; i<test.length;i++){
			System.out.println(Arrays.toString(test[i]));
		}
	}

}
