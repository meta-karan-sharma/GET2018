package test.java.com.metacube.ds;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import main.java.com.metacube.ds.beans.*;
import main.java.com.metacube.ds.service.Printer;

import org.junit.Before;
import org.junit.Test;

public class JobTest {

	DepartmentChair dcentity;
	Professors pEntity;
	Graduates gEntity;
	UnderGraduates ugEntity;
	List<String> actualList;
	List<String> expectedList;
	@Before
	public void setUp(){
		dcentity = new DepartmentChair("This is from department chair");
		pEntity = new Professors("This is from professors");
		gEntity = new Graduates("This is from grad students");
		ugEntity = new UnderGraduates("This is from uder grad students");
		ugEntity.sendToPrinter();
		dcentity.sendToPrinter();
		dcentity.sendToPrinter();
		
		gEntity.sendToPrinter();
		
		pEntity.sendToPrinter();
		actualList = new ArrayList<>();
		expectedList = new ArrayList<>();
		
	}
	@Test
	public void test() {
		actualList = Printer.getInstance().print();
		expectedList.add("This is from department chair");
		expectedList.add("This is from department chair");
		expectedList.add("This is from professors");
		expectedList.add("This is from grad students");
		expectedList.add("This is from uder grad students");
		assertEquals(expectedList, actualList);
	}

}
