import static org.junit.Assert.*;

import org.junit.Test;

public class TestableAreaTest {

	@Test
	public void testTestableArea() {
		TestableArea test = new TestableArea();
		double result = test.Area(1);
		assertEquals(3.14, result,0.01);
	}
	
	@Test
	public void testTestableAreaNegR() {
		TestableArea test = new TestableArea();
		double result = test.Area(-1);
		assertEquals(3.14, result,0.01);
	}
	
	@Test
	public void testTestableAreaZero() {
		TestableArea test = new TestableArea();
		double result = test.Area(0);
		assertEquals(0, result,0.01);
	}

}
