package functions;

public class Main {

	public static void main(String[] args) {
		showMessage("1");

		int total1 = sum1(1, 2);
		System.out.println(total1);
		System.out.println(sum1(1, 2));
		
		int total2 = sum2(4,9,7,3,10);
		System.out.println(total2);

	}

	public static void showMessage(String message) {
		System.out.println("Test " + message);
	}

	public static int sum1(int number1, int number2) {
		return number1 + number2;
	}
	
	public static int sum2(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

}
