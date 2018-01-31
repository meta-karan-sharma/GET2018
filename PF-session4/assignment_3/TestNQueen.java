package assignment_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestNQueen 
{
	boolean isArrayEqual(int arr1[][], int arr2[][])
	{
		for(int loopCounter1=0;loopCounter1<arr1.length;loopCounter1++)
		{
			for(int loopCounter2=0;loopCounter2<arr1.length;loopCounter2++)
			{
				if(arr1[loopCounter1][loopCounter2]!=arr2[loopCounter1][loopCounter2])
					return false;
			}
		}
		return true;
	}

	NQueen nQueenObject = new NQueen();
	NQueen nQueenObject1 = new NQueen();
	NQueen nQueenObject2 = new NQueen();
	int arr[][], arr2[][], arr3[][];
	int expArr[][];
	@Before
	public void begin() {
		arr = new int[][]{{0,0,0,0},
			{0,0,0,0},
			{0,0,0,0},
			{0,0,0,0}};
		expArr = new int[][]{{0,1,0,0},
				{0,0,0,1},
				{1,0,0,0},
				{0,0,1,0}};
		
			
	}
	@Test
	public void test() 
	{
		assertTrue (nQueenObject.nQueen (arr, 0, arr.length));	
		assertTrue (isArrayEqual (expArr, nQueenObject.finalBoard));
	}

	@Before
	public void begin1 () 
	{
		arr2 = new int [][] { {0,0,0},
			{0,0,0},
			{0,0,0}};
			
	}
	@Test
	public void test1() 
	{
		assertFalse (nQueenObject1.nQueen (arr2, 0, arr2.length));
	}
	
	@Before
	public void begin3 () 
	{
		arr3 = new int [][] { {0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0}};
			
	}
	@Test
	public void test3 () 
	{
		assertTrue (nQueenObject2.nQueen (arr3, 0, arr3.length));
	}

}
