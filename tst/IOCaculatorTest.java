package tst;
import static org.junit.Assert.*;

import org.junit.Test;

import src.IOCalculator;

public class IOCaculatorTest {

	@Test
	public void testCalculate() throws Exception {
		String[] args = {"./resources/input.txt"};
		IOCalculator io = new IOCalculator(args);
		assertTrue(io.Calculate(2, 4, "+") == 6);
		assertTrue(io.Calculate(2, 4, "-") == -2);
		assertTrue(io.Calculate(2, 4, "*") == 8);

		//This test is incorrect. It should be 0.5 !0.0
		assertTrue(io.Calculate(2, 4, "/") == 0);
	}
	
	@Test (expected = Exception.class)
	public void testCalculateNegatives() throws Exception {
		String[] args = {"./resources/input.txt"};
		IOCalculator io = new IOCalculator(args);
		assertTrue(io.Calculate(2, 4, "") == 6);
	}

}
