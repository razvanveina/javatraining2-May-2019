package sessions.session06.calculator;

public class CalculatorClient2 {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.doOperation('+', 100);
		c.doOperation('-', 50);
		System.out.println(c.getValue());
	}
}
