package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumbers {

	@Test
	public void test() {
		JUnitFunction obj = new JUnitFunction();
		int result = obj.addNumbers(200, 700);
		assertEquals(900,result);
	}

}
