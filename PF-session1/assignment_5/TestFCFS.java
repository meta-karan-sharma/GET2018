package assignment_5;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFCFS {
	FirstComeFirstServe test=new FirstComeFirstServe();
	int arrival_time[]={1,5,9,25};
	int job_size[]={12,7,2,5};
	int actualArr[][]=test.FCFS(arrival_time, job_size);
	int expectedArr[][]={{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};
	boolean isArrayEqual(int expected[][], int output[][])
	{
		for(int loopCounter1=0;loopCounter1<4;loopCounter1++)
		{
			for(int loopCounter2=0;loopCounter2<5;loopCounter2++)
			{
				if(actualArr[loopCounter1][loopCounter2]!=expectedArr[loopCounter1][loopCounter2])
					return false;
			}
		}
		return true;
	}

	@Test
	public void test() 
	{
		assertTrue(isArrayEqual(expectedArr,actualArr));
	}

}
