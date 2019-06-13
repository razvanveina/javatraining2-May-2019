package sessions.session06.calculator;

import java.util.Scanner;

public class CalculatorClient {
	public static void main(String[] args) {
		CalculatorClient c = new CalculatorClient();
		c.run();
	}

	private void run() {
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(c.getValue());
			System.out.print("> ");
			String line = sc.nextLine();
			char operator = line.charAt(0);
			String operand = line.substring(1);
			double value = Double.parseDouble(operand);
			c.doOperation(operator, value);
		}
	}
}
