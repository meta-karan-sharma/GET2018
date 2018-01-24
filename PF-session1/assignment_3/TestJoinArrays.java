package assignment_3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestJoinArrays {
	int a[],b[],c[],array[];
	int asize,bsize;
	JoinArrays test;
	@Before
	public void toBegin()
	{
		a=new int[]{1,3,5,7,9};
		asize=a.length;
		b=new int[]{2,4,6,8};
		bsize=b.length;
		c=new int[asize+bsize];
		test=new JoinArrays();
		array=new int[]{1,2,3,4,5,6,7,8,9};
	}
	@Test
	public void test() {
	    
	    assertArrayEquals(array,test.join(a, asize, b, bsize, c));
	}

}