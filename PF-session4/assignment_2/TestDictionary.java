package assignment_2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestDictionary 
{
	Dictionary dictionaryObject = new Dictionary ();
	List <String> stringSequence = new ArrayList <String> ();
    @Before
    public void begin ()
    {
    	stringSequence.add ("ABC");
    	stringSequence.add ("ACB");
    	stringSequence.add ("BAC");
    	stringSequence.add ("BCA");
    	stringSequence.add ("CBA");
    	stringSequence.add ("CAB");
    }
	@Test
	public void test () 
	{
		assertEquals (stringSequence, dictionaryObject.permutation ("ABC"));
		
	}

}