package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void testMultiply() {
		Junit test = new Junit();
		int result = test.multiply(3,4);
		assertEquals(12, result);
	}
	
	@Test
	public void testMultiplyWith0() {
		Junit test = new Junit();
		int result = test.multiply(0,4);
		assertEquals(0, result);
	}
	
	@Test
	public void testMultiplySameInts() {
		Junit test = new Junit();
		int result = test.multiply(4,4);
		assertEquals(16, result);
	}

}
