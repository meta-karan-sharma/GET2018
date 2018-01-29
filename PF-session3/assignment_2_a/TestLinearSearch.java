package assignment_2_a;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestLinearSearch 
{

	LinearSearch linearSearchObject = new LinearSearch ();
	int pos = 0;
	int arr [], arr1 [], element, element1;
	
	@Before
	public void begin ()
	{
		arr = new int [] {2, 5, 8, 9, 10, 77, 55};
		element = 88;
	}
	
	@Test
	public void test () 
	{
		assertEquals (0, linearSearchObject.linearSearch (arr, element, pos));
	}
	
	@Before
	public void begin1 ()
	{
	    arr1 = new int [] {2,5,8,9,10, 77, 55, 11};
		element1 = 77;
	}
	
	@Test
	public void test1 () 
	{
		assertEquals (5, linearSearchObject.linearSearch (arr1, element1, pos));
	}

}
