package primes;

import static org.junit.Assert.*;

import org.junit.Test;

public class countPrimesTest {

	@Test
	public void test() {
		
		assertEquals(8,countPrimes.countPrime(20));
		assertEquals(10,countPrimes.countPrime(30));
		assertEquals(12,countPrimes.countPrime(40));
		System.out.println(countPrimes.countPrime(999983));
	}

}
