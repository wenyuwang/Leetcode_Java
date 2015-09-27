package javaPractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecursionSkeletonTester {

	@Test
	public void test() {
		
		assertEquals(5,RecursionSkeleton.number('a', "caeadeapaea"));
		assertEquals(3,RecursionSkeleton.number('e', "caeadeapaea"));
		
		assertEquals("caeadeapaea",RecursionSkeleton.dup("caeadeapaea"));
		assertEquals("capple",RecursionSkeleton.dup("capple"));
		assertEquals("wenyuLovesYuchien",RecursionSkeleton.dup("wenyuLovesYuchien"));
		
		assertEquals("baca$%",RecursionSkeleton.removeAdjacentDups("baaacca$$%"));
		
		assertEquals("ccccc",RecursionSkeleton.repeated('c', 5));
		assertEquals("a",RecursionSkeleton.repeated('a', 1));
		assertEquals("",RecursionSkeleton.repeated('a', 0));
		
		assertEquals("$$$bb555555",RecursionSkeleton.decompress("3$2b0d65"));
		assertEquals("aabbcc",RecursionSkeleton.reverse1("ccbbaa"));
		assertEquals("aabbcc",RecursionSkeleton.reverse2("ccbbaa"));
		
		assertEquals(3,RecursionSkeleton.numDigits(384));
		assertEquals(9,RecursionSkeleton.numDigits(204958697));
		
		assertEquals(15,RecursionSkeleton.sumDigits(384));
		assertEquals(50,RecursionSkeleton.sumDigits(204958697));
		
		assertEquals(5,RecursionSkeleton.addUp(204958697));
		assertEquals(6,RecursionSkeleton.addUp(384));
		
		assertEquals(725,RecursionSkeleton.complement(385));
		
		assertEquals("433$1B1x",RecursionSkeleton.compress("3333$$$Bx"));
		assertEquals("3$2b65",RecursionSkeleton.compress("$$$bb555555"));
		
		
		assertEquals(200,RecursionSkeleton.ZeroOutOddDigits(3250));
		assertEquals(0,RecursionSkeleton.ZeroOutOddDigits(3050));
		
		assertEquals("5,624,827",RecursionSkeleton.commafy(5624827));
		
		assertEquals("007",RecursionSkeleton.prependTo3(7));
		assertEquals("017",RecursionSkeleton.prependTo3(17));
		
		Integer [] oo = {1, 2, 3};
		Integer [][] oAo = {{1, 2, 5}, {3, 4}};
		Integer [][][] B = {{{1}, {0, 3}, {}}, {{1,2,3}, {3}}};
		assertEquals(6, RecursionSkeleton.arraySum(  oo ) );
		assertEquals(6, RecursionSkeleton.arraySum(6) );
		assertEquals(15, RecursionSkeleton.arraySum(oAo) );
		assertEquals(13, RecursionSkeleton.arraySum(B) );
	}

}
