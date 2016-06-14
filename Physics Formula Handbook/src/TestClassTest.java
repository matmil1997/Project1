import static org.junit.Assert.*;
import org.junit.Test;

public class TestClassTest {

	@Test
	public void testTestClass() {
		TestClass test = new TestClass();
		int result = test.Force(3,4);
		assertEquals(12, result);
	}
	
	@Test
	public void testTestClassWithZero() {
		TestClass test = new TestClass();
		int result = test.Force(0,4);
		assertEquals(0, result);
	}
	
	@Test
	public void testTestClassWithZero1() {
		TestClass test = new TestClass();
		int result = test.Force(3,0);
		assertEquals(0, result);
	}
	
	@Test
	public void testTestClassNegative() {
		TestClass test = new TestClass();
		int result = test.Force(3,-4);
		assertEquals(-12, result);
	}

}
