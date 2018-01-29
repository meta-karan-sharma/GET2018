package assignment_1_a;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLargestDigit 
{
	LargestDigit largestDigitObject = new LargestDigit ();

	@Test
	public void test1 () 
	{
		assertEquals (2, largestDigitObject.largestDigit (2));
	}

	@Test
	public void test2 () 
	{
		assertEquals (9, largestDigitObject.largestDigit (1257369));
	}
	
	@Test
	public void test3 () 
	{
		assertEquals (4, largestDigitObject.largestDigit (444));
	}
}
