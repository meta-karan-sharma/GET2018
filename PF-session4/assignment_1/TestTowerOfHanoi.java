package assignment_1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestTowerOfHanoi 
{
	List <String> stringSequence = new ArrayList <String> ();
	List <String> stringSequence1 = new ArrayList <String> ();
	List <String> stringSequence2 = new ArrayList <String> ();
	TowerOfHanoi towerOfHanoiObject, towerOfHanoiObject1, towerOfHanoiObject2;
	
	@Before
	public void begin ()
	{
		towerOfHanoiObject = new  TowerOfHanoi (1);
		stringSequence.add ("Move Disk 1 from A to B"); 
	}
	
	@Test
	public void test () 
	{
	        assertEquals (stringSequence, towerOfHanoiObject.towerOfHanoi ("A", "B", "C", 1));
	}
	
	@Before
	public void begin1 ()
	{
		towerOfHanoiObject1 = new  TowerOfHanoi (2);
		stringSequence1.add ("Move Disk 2 from A to C");
		stringSequence1.add ("Move Disk 1 from A to B"); 
		stringSequence1.add ("Move Disk 2 from C to B"); 
	}
	
	@Test
	public void test1 () 
	{
	        assertEquals (stringSequence1, towerOfHanoiObject1.towerOfHanoi ("A", "B", "C", 2));
	}
	
	@Before
	public void begin2 ()
	{
		towerOfHanoiObject2 = new  TowerOfHanoi (3);
		stringSequence2.add ("Move Disk 3 from A to B");
		stringSequence2.add ("Move Disk 2 from A to C");
		stringSequence2.add ("Move Disk 3 from B to C");
		stringSequence2.add ("Move Disk 1 from A to B");
		stringSequence2.add ("Move Disk 3 from C to A");
		stringSequence2.add ("Move Disk 2 from C to B");
		stringSequence2.add ("Move Disk 3 from A to B");
	}
	
	@Test
	public void test2 () 
	{
	        assertEquals (stringSequence2, towerOfHanoiObject2.towerOfHanoi ("A", "B", "C", 3));
	}
}
