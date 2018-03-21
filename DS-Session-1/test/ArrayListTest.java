package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.util.ArrayList;

public class ArrayListTest {

	@Test
	public void testAddMethod() {
		ArrayList<String> s = new ArrayList<>();
		s.add("1");
		s.add(1, "2");
		s.add("3");
		String[] expected = new String[] {"1","2","3"};
		assertArrayEquals(expected, s.getArray());  
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testAddMethodForException() {
		ArrayList<String> s = new ArrayList<>();
		s.add("1");
		s.add(2, "2");
		s.add("3");
		String[] expected = new String[] {"1","2","3"};
		assertArrayEquals(expected, s.getArray());  
	}
	
	@Test
	public void testRemoveMethod() {
		ArrayList<String> s = new ArrayList<>();
		s.add("1");
		s.add("2");
		s.add("3");
		String expected = "1";
		assertEquals(expected, s.remove(0));  
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testRemoveMethodForException() {
		ArrayList<String> s = new ArrayList<>();
		s.add("1");
		s.add("2");
		s.add("3");
		String expected = "1";
		assertEquals(expected, s.remove(5));  
	}
	
	@Test
	public void testRemoveMethodByElement() {
		ArrayList<String> s = new ArrayList<>();
		s.add("1");
		s.add("2");
		s.add("3");
		boolean expected = true;
		assertEquals(expected, s.remove("2"));  
	}
	@Test
	public void testRemoveMethodByElementUnSuccessful() {
		ArrayList<String> s = new ArrayList<>();
		s.add("1");
		s.add("2");
		s.add("3");
		boolean expected = false;
		assertEquals(expected, s.remove("4"));  
	}
	
	@Test
	public void testIndexOfMethod() {
		ArrayList<String> s = new ArrayList<>();
		s.add("1");
		s.add("2");
		s.add("3");
		int expected = 2;
		assertEquals(expected, s.indexOf("3"));  
	}
	
	@Test
	public void testIndexOfMethodNotFound() {
		ArrayList<String> s = new ArrayList<>();
		s.add("1");
		s.add("2");
		s.add("3");
		int expected = -1;
		assertEquals(expected, s.indexOf("4"));  
	}
	
	@Test
	public void testAppendMethodForList(){
		ArrayList<String> s1 = new ArrayList<>();
		ArrayList<String> s2 = new ArrayList<>();
		s1.add("1");
		s1.add("2");
		s2.add("3");
		s2.add("4");
		s1.append(s2);
		String[] expected = new String[] {"1","2","3","4"};
		assertArrayEquals(expected, s1.getArray()); 
	}
	
	@Test
	public void testAppendMethodForArray(){
		ArrayList<String> s1 = new ArrayList<>();
		s1.add("1");
		s1.add("2");
		String[] s2 = new String[] {"3","4"};
		s1.append(s2);
		String[] expected = new String[] {"1","2","3","4"};
		assertArrayEquals(expected, s1.getArray()); 
	}
}
