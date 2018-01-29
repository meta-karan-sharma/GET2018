package assignment_2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRemovingDuplicate {
	RemovingDuplicate test;
	int array[];
	int expectedArray[];
	@Before
	public void toBegin()
	{
		test=new RemovingDuplicate();
		array=new int[]{2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		expectedArray=new int[]{2,5,4,6,3,8,9,0};
	}
	@Test(timeout=1000)
	
	public void test() {
		assertArrayEquals(expectedArray,test.removeDuplicate(array));
	}

}
