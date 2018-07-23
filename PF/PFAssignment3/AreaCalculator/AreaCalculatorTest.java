package GET2018.PF.PFAssignment3.AreaCalculator;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AreaCalculatorTest {

	AreaCalculator areaCalculator;

	@Before
	public void init() {
		areaCalculator = new AreaCalculator();
	}

	@Test
	public void testAreaTriangle() {
		assertEquals(60.00, areaCalculator.areaOfTriangle(10, 12), 0);
	}

	@Test
	public void testArearectangle() {
		assertEquals(84.00, areaCalculator.areaOfRectangle(7, 12), 0);
	}

	@Test
	public void testAreaSquare() {
		assertEquals(163.84, areaCalculator.areaOfSquare(12.8), 0);
	}

	@Test
	public void testAreaCircle() {
		assertEquals(56.21, areaCalculator.areaOfCircle(4.23), 0);
	}

}