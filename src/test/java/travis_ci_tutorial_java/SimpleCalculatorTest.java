package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 2);
	}
	
	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(5, 3), 15);
	}
	
	@Test
	public void testDeivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(6, 3), 2);
	}
}
