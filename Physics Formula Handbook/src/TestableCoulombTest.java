import static org.junit.Assert.*;

import org.junit.Test;

public class TestableCoulombTest {

	@Test
	public void TestableCoulombTest() {
		TestableCoulomb test = new TestableCoulomb();
		double result = test.ForceQ(1,1,1);
		assertEquals(9E9,result,0.01);
	}
	
	@Test
	public void TestableCoulombTestZeroQ() {
		TestableCoulomb test = new TestableCoulomb();
		double result = test.ForceQ(0,1,1);
		assertEquals(0,result,0.01);
	}
	
	@Test
	public void TestableCoulombTestZeroq() {
		TestableCoulomb test = new TestableCoulomb();
		double result = test.ForceQ(1,0,1);
		assertEquals(0,result,0.01);
	}
	
	@Test
	public void TestableCoulombTestNegR() {
		TestableCoulomb test = new TestableCoulomb();
		double result = test.ForceQ(1,1,-1);
		assertEquals(9E9,result,0.01);
	}

}
