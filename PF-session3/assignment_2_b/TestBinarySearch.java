package assignment_2_b;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBinarySearch 
{
	BinarySearch binarySearchObject;
	int arr [];
	@Before
	public void toBegin ()
	{
		binarySearchObject = new BinarySearch ();
		arr = new int [] {2, 4, 5, 8, 9, 10, 55, 77};
	}

	@Test
	public void test () 
	{
		assertEquals (-1, binarySearchObject.binarySearch (arr, 88, 0, arr.length));
	}

	@Test
	public void test2 () 
	{
		assertEquals (2, binarySearchObject.binarySearch (arr, 4, 0, arr.length));
	}

}
