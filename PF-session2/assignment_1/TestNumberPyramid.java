package assignment_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestNumberPyramid {
	
	NumberPyramid test = new NumberPyramid ();
	String expectedArr [];
	String numbers, spaces;
	@Before
	public void toBeginPyramid ()
	{
		expectedArr = new String [] {"    1", "   121", "  12321", " 1234321", "123454321", " 1234321", "  12321", "   121", "    1"};
	}
	

	@Test
	public void testPyramid () 
	{
		   int n = 5;
		   assertArrayEquals (expectedArr, test.pyramid (n));
	}
	@Before
	public void toBeginNumbers () 
	{
		numbers = new String ("123454321");
	}
	

	@Test
	public void testNumbers ()
	{
		   int n = 5;
		   assertEquals (numbers, test.numbers (5, n));
	}
	@Before
	public void toBeginSpaces ()
	{
		spaces = new String ("    ");
	}
	

	@Test
	public void testSpaces ()
	{
		   int n = 5;
		   assertEquals (spaces, test.spaces (1, n));
	}

}
