import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testRactangle {

	@Test
	void testCalculateArea() {
		Rectangle rect = new Rectangle();
		assertEquals(50, rect.calculateArea(10,5));
	}

}
