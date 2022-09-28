package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		double result1 = calculator.addition(3.2, 5.4, 7.7, 9);
		System.out.println(result1);

		double result2 = calculator.subtraction(10, 3.7);
		System.out.println(result2);

		double result3 = calculator.multiply(1.59, 2, 8);
		System.out.println(result3);

		double result4 = calculator.division(180, 0);
		System.out.println(result4);

	}

}
