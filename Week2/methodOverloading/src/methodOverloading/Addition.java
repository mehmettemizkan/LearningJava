package methodOverloading;

public class Addition {

	public int add(int number1, int number2) {
		return number1 + number2;
	}
	
	public int add(int number1, int number2 , int number3) {
		return number1 + number2 + number3;
	}
	
	public double add(double number1, double number2 , double number3) {
		return number1 + number2 + number3;
	}

}
