package assignment_1_c;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRemainder 
{
	Remainder r = new Remainder();
	@Test
	public void test()
	{
		assertEquals(0, r.findRemainder(2, 1));
	}
	@Test
	public void test1()
	{
		assertEquals(2, r.findRemainder(2, 0));
	}
	@Test
	public void test2() 
	{
		assertEquals(1, r.findRemainder(100, 3));
	}

}
