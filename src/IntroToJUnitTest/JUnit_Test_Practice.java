package IntroToJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnit_Test_Practice {
calc calc = new calc();
	@Test
	public void addtest() {
	assertTrue(calc.add(5, 5) == 10);
	}
	@Test
public void multTest() {
		assertTrue(calc.mult(5, 5) == 25);
	}
	@Test
	public void subTest() {
			assertTrue(calc.sub(5, 5) == 0);
		}
	@Test
	public void divTest() {
			assertTrue(calc.div(5, 5) == 1);
		}
}
