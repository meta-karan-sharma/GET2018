package com.metacube.ds.queue;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestCounselling {
	
	private Counselling c;
	private List<College> qClg;
	private Queue<Candidate> qCan;
	@Before
	public void init() {
		Candidate c1 = new Candidate("abc",80);
		Candidate c2 = new Candidate("abc2",60);
		Candidate c3 = new Candidate("abc3",20);
		Candidate c4 = new Candidate("abc4",90);
		Candidate c5 = new Candidate("abc5",70);
		Candidate c6 = new Candidate("abc6",65);
		Candidate c7 = new Candidate("abc7",34);
		Candidate c8 = new Candidate("abc8",67);
		
		qCan = new Queue<>();
		qCan.enQueue(c1);
		qCan.enQueue(c2);
		qCan.enQueue(c3);
		qCan.enQueue(c4);
		qCan.enQueue(c5);
		qCan.enQueue(c6);
		qCan.enQueue(c7);
		qCan.enQueue(c8);
		
		College clg1 = new College(1, "College1", 2);
		College clg2 = new College(2, "College2", 1);
		College clg3 = new College(3, "College3", 0);
		College clg4 = new College(4, "College4", 1);
		
		qClg = new ArrayList<College>();
		qClg.add(clg1);
		qClg.add(clg2);
		qClg.add(clg3);
		qClg.add(clg4);
		c = new Counselling();
	}
	@Test
	public void test() {
		int[] input = {1,1,2,4};
		List<String> actual = c.startCounselling(qCan, qClg, input);
		List<String> expected = new ArrayList<>();
		expected.add("Name: abc4 College Allotted: College1");
		expected.add("Name: abc College Allotted: College1");
		expected.add("Name: abc5 College Allotted: College2");
		expected.add("Name: abc8 College Allotted: College4");
		expected.add("Name: abc6 College Allotted: null");
		expected.add("Name: abc2 College Allotted: null");
		expected.add("Name: abc7 College Allotted: null");
		expected.add("Name: abc3 College Allotted: null");
		assertEquals(expected, actual);
 	}


	@Test(expected = IllegalArgumentException.class)
	public void test1() {
		int[] input = {1,1,1,4};
		List<String> actual = c.startCounselling(qCan, qClg, input);
		List<String> expected = new ArrayList<>();
		expected.add("Name: abc4 College Allotted: College1");
		expected.add("Name: abc College Allotted: College1");
		expected.add("Name: abc5 College Allotted: College2");
		expected.add("Name: abc8 College Allotted: College4");
		expected.add("Name: abc6 College Allotted: null");
		expected.add("Name: abc2 College Allotted: null");
		expected.add("Name: abc7 College Allotted: null");
		expected.add("Name: abc3 College Allotted: null");
		assertEquals(expected, actual);
 	}
}
