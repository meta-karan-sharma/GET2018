package assignment_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestNumberTraingle 
{

	NumberTriangle test = new NumberTriangle ();
	String expectedArr [];
	String numbers, spaces;
	@Before
	public void toBeginPattern ()
	{
		expectedArr = new String [] {"12345", " 1234", "  123", "   12", "    1"};	
	}
	

	@Test
	public void testPattern () 
	{
		   int n=5;
		   assertArrayEquals(expectedArr,test.triangle(n));
	}
	
	@Before
	public void beforeNumbers ()
	{
		numbers = new String ("12345");
	}
	

	@Test
	public void testNumbers () 
	{
		   int n=5;
		   assertEquals (numbers, test.numbers (1, n));
	}
	
	@Before
	public void beforeSpaces ()
	{
		spaces = new String ("   ");
	}
	

	@Test
	public void testSpaces () 
	{
		   int n=5;
		   assertEquals (spaces, test.spaces (4, n));
	}
}


