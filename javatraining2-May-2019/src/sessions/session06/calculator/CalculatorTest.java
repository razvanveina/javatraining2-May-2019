package sessions.session06.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Calculator c = new Calculator();
		c.doOperation('+', 100);
		c.doOperation('-', 50);
		assertEquals(50, c.getValue());
	}

	@Test
	void test2() {
		Calculator c = new Calculator();
		c.doOperation('+', 100);
		c.doOperation('/', 10);
		assertEquals(10, c.getValue());
	}

}
