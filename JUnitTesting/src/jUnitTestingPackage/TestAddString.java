package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddString {

	@Test
	public void test() {
		JUnitFunction obj = new JUnitFunction();
		String result = obj.addString("Hello", " Java Developer");
		assertEquals("Hello Java Developer",result);
	}

}
