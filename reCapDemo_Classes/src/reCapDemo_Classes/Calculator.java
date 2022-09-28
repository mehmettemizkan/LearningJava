package reCapDemo_Classes;

public class Calculator {

	public double addition(double... numbers) {
		double total = 0;
		for (double number : numbers) {
			total += number;
		}
		return total;
	}

	public double subtraction(double number1, double number2) {
		return number1 - number2;
	}

	public double multiply(double... numbers) {
		double total = 1;
		for (double number : numbers) {
			total *= number;
		}
		return total;
	}

	public double division(double number1, double number2) {
		return number1 / number2;
	}

}
