package assignment_6;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLongestIncreasingSequence 
{
	LongestIncreasingSequence test;
	int arr[],expectedArr[];
	@Before
	public void toBegin()
	{
		arr=new int[]{1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		test=new LongestIncreasingSequence();
		expectedArr=new int[]{1,2,4,5,6,7,8,9};
	}
	@Test
	public void test() {
		assertArrayEquals(expectedArr,test.longestSequence(arr));
	}

}
