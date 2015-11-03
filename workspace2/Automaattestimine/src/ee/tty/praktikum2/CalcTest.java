package ee.tty.praktikum2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {
	private Calc c;

	@Before
	public void setUp() throws Exception {
		c = new Calc();
	}

	@Test
	public void testPayJunior() {
		assertEquals(c.finalSalary(1, 5), 50);
		assertEquals(c.finalSalary(1, 10), 120);
		assertEquals(c.finalSalary(1, 24), 410);
	}
	
	@Test
	public void testPaySenior() {
		assertEquals(c.finalSalary(2, 5), 75);
		assertEquals(c.finalSalary(2, 10), 180);
		assertEquals(c.finalSalary(2, 24), 620);
	}
	
	@Test
	public void testPaySpecialist() {
		assertEquals(c.finalSalary(3, 5), 110);
		assertEquals(c.finalSalary(3, 10), 264);
		assertEquals(c.finalSalary(3, 24), 1218);
	}

}