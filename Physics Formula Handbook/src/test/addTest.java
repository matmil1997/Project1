package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTest {

	@Test
	public void test() {
		Junit test = new Junit();
		int result = test.add(9, 10);
		assertEquals(19,result);
	}
	
	@Test
	public void testWithZero() {
		Junit test = new Junit();
		int result = test.add(0, 10);
		assertEquals(10,result);
	}
	
	@Test
	public void testWithLargeNumber() {
		Junit test = new Junit();
		int result = test.add(9, 12308523);
		assertEquals(12308532,result);
	}

}
