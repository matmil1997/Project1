import static org.junit.Assert.*;

import org.junit.Test;

public class TestableGravitationTest {

	@Test
	public void testTestableGravitation() {
		TestableGravitation test = new TestableGravitation();
		double result = test.ForceGrav(1, 1, 1);
		assertEquals(6.67E-11, result,0.01);
	}

	@Test
	public void testTestableGravitationM0() {
		TestableGravitation test = new TestableGravitation();
		double result = test.ForceGrav(0, 1, 1);
		assertEquals(0, result,0.01);
	}
	
	@Test
	public void testTestableGravitationm0() {
		TestableGravitation test = new TestableGravitation();
		double result = test.ForceGrav(1, 0, 1);
		assertEquals(0, result,0.01);
	}
	
	@Test
	public void testTestableGravitationAllMasses0() {
		TestableGravitation test = new TestableGravitation();
		double result = test.ForceGrav(0, 0, 1);
		assertEquals(0, result,0.01);
	}
}
