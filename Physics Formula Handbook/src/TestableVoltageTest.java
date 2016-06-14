import static org.junit.Assert.*;

import org.junit.Test;

public class TestableVoltageTest {

	@Test
	public void testTestableVoltage() {
		TestableVoltage test = new TestableVoltage();
		int result = test.Volt(25,4);
		assertEquals(100,result);
	}
	
	@Test
	public void testTestableVoltageZero() {
		TestableVoltage test = new TestableVoltage();
		int result = test.Volt(0,4);
		assertEquals(0,result);
	}
	
	@Test
	public void testTestableVoltageZero1() {
		TestableVoltage test = new TestableVoltage();
		int result = test.Volt(25,0);
		assertEquals(0,result);
	}
	
//	@Test
//	public void testTestableVoltageRandom() {
//		TestableVoltage test = new TestableVoltage();
//		int result = test.Volt(523,53);
//		assertEquals(27719,result);
//	}

}
