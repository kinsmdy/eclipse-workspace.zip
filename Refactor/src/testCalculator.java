import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCalculator {


	@Test
	void testPrintSum() {
		Calculator c1 = new Calculator();
		assertEquals("The sum is: 8", c1.printSum(5,3));
	}

	@Test
	void testPrintMultiplication() {
		Calculator c2 = new Calculator();
		assertEquals("The product is: 15", c2.printMultiplication(5,3));
	}
}
