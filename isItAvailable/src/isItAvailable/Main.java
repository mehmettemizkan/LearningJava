package isItAvailable;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("This program finds is your number available on my list or not.");

		int myList[] = new int[] { 1, 56, 32, 19, 8, 37, 48,95,79,80 };

		Scanner guess = new Scanner(System.in);
		System.out.println("Guess a number (0-100) Your chance is 10%");
		double userGuess = guess.nextDouble();
		
		boolean available = false;
		
		if (userGuess<0) {
			System.err.println("Wrong number. The number must be 0-100");
		} else {
			if (userGuess != (int)userGuess) {
				System.err.println("Wrong number type. Enter an integer.");
			}
			else {
				for (int i : myList) {
					if (i == userGuess) {
						available = true;
						break;
					}
				}
				if (available == true) {
					System.out.println("Your number is on the list.");
				} else {
					System.out.println("Your number is not on the list.");
				}
			}
		}

		
	}

}
