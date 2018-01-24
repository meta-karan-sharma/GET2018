package assignment_4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSortedOrNot 
{
	SortedOrNot test;
	int arr[],arr1[],arr2[];
	@Before
	public void toBegin1()
	{
		test=new SortedOrNot();
		arr=new int[]{1,2,3,4,5,6,7,8};
	}

	@Test
	public void test1() {
		assertEquals(1,test.sortedOrNot(arr));
	}

	@Before
	public void toBegin2()
	{
		test=new SortedOrNot();
		arr1=new int[]{8,7,6,5,4,3,2,1};
	}

	@Test
	public void test2() {
		assertEquals(2,test.sortedOrNot(arr1));
	}
	
	@Before
	public void toBegin3()
	{
		test=new SortedOrNot();
		arr2=new int[]{1,2,4,5,6,7,3};
	}

	@Test
	public void test3() {
		assertEquals(0,test.sortedOrNot(arr2));
	}

}
