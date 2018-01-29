package assignment_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestQuickSort 
{
	QuickSort quickSortObject;
	int arr[],expectedArray[];
	@Before
	public void toBegin()
	{
		quickSortObject = new QuickSort();
		arr = new int [] {2, 5, 8, 9, 10, 77, 55, 11};
		expectedArray = new int [] {2, 5, 8, 9, 10, 11, 55, 77};
	}

	@Test
	public void test() 
	{
		assertArrayEquals (expectedArray, quickSortObject.sort1 (arr, 0, arr.length-1));
	}
	@Before
	public void toBegin1()
	{
		quickSortObject = new QuickSort();
		arr = new int [] {};
		expectedArray = new int [] {};
	}

	@Test
	public void test1() 
	{
		assertArrayEquals(expectedArray,quickSortObject.sort1(arr, 0, arr.length-1));
	}
}
