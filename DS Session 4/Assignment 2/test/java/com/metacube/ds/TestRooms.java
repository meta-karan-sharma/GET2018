package test.java.com.metacube.ds;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import main.java.com.metacube.ds.beans.Hotel;
import main.java.com.metacube.ds.beans.Person;

import org.junit.Before;
import org.junit.Test;

public class TestRooms {

	Person p1;
	Person p2;
	Person p3;
	Person p4;
	Hotel hotel;
	Map<Integer, String> actual;
	Map<Integer, String> expected;
	@Before
	public void setUp() throws Exception {
		p1 = new Person(82, "abc1");
		p2 = new Person(78, "abc2");
		p3 = new Person(62, "abc3");
		p4 = new Person(92, "abc4");
		hotel = new Hotel(7);
		actual = new HashMap<>();
		expected = new HashMap<>();
		hotel.allotRooms(p1);
		hotel.allotRooms(p2);
		hotel.allotRooms(p3);
		hotel.allotRooms(p4);
	}

	@Test
	public void test() {
		actual = hotel.display();
		expected.put(1, "abc2");
		expected.put(2, "abc4");
		expected.put(5, "abc1");
		expected.put(6, "abc3");
		assertEquals(expected,actual);
	}

}
