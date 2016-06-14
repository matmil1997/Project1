import static org.junit.Assert.*;

import org.junit.Test;

public class TestableKETest {

	@Test
	public void testTestableKE() {
		TestableKE test = new TestableKE();
		double result = test.KE(9,2);
		assertEquals(18, result, 0.01);
	}

}
