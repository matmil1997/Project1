import static org.junit.Assert.*;

import org.junit.Test;

public class TestablePhotonTest {

	@Test
	public void TestablePhotontest() {
		TestablePhoton test = new TestablePhoton();
		double result = test.Photonify(1) ;
		assertEquals(6.626E-34,result,0.01);
	}
	
	@Test
	public void TestablePhotontestZero() {
		TestablePhoton test = new TestablePhoton();
		double result = test.Photonify(0) ;
		assertEquals(0,result,0.01);
	}

}
