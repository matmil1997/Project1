import static org.junit.Assert.*;

import org.junit.Test;

public class TestableMomentumTest {

	@Test
	public void testTestableMomentum() {
		TestableMomentum test = new TestableMomentum();
		int result = test.Momentum(5,7);
		assertEquals(35, result);
	}
	
	@Test
	public void testTestableMomentumZero() {
		TestableMomentum test = new TestableMomentum();
		int result = test.Momentum(0,7);
		assertEquals(0, result);
	}
	
	@Test
	public void testTestableMomentumZero1() {
		TestableMomentum test = new TestableMomentum();
		int result = test.Momentum(5,0);
		assertEquals(0, result);
	}
	
	@Test
	public void testTestableMomentumRandom() {
		TestableMomentum test = new TestableMomentum();
		int result = test.Momentum(87,34);
		assertEquals(2958, result);
	}

}
