import static org.junit.Assert.*;

import org.junit.Test;

public class TestableEinsteinTest {

	@Test
	public void testTestableEinstein() {
		TestableEinstein test = new TestableEinstein();
		double result = test.Einst(1);
		assertEquals(9E16, result,0.01);
	}
	
	@Test
	public void testTestableEinsteinZero() {
		TestableEinstein test = new TestableEinstein();
		double result = test.Einst(0);
		assertEquals(0, result,0.01);
	}

}
