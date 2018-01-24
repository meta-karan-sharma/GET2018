package assignment_1;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestBinaryToOctal {
	BinaryToOctal test =new BinaryToOctal();
	@Test
	public void test() {
		assertEquals(65,test.convertBinaryToOctal(110101));
	}

}
