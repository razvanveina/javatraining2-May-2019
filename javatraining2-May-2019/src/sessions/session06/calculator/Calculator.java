package sessions.session06.calculator;

public class Calculator {
	private double currentValue = 0;

	public void doOperation(char operator, double operand) {
		switch (operator) {
		case '+':
			currentValue += operand;
			break;
		case '-':
			currentValue -= operand;
			break;
		}
	}

	public double getValue() {
		return currentValue;
	}
}
