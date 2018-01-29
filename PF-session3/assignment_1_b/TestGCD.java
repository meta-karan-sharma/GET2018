package assignment_1_b;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGCD {

	GCD gcdObject = new GCD ();
	@Test
	public void test () 
	{
		assertEquals (1, gcdObject.gcd (2, 1));
	}
	@Test
	public void test1 () 
	{
		assertEquals (6, gcdObject.gcd (12, 18));
	}
	@Test
	public void test2 () 
	{
		assertEquals(1, gcdObject.gcd (100, 3));
	}
}
