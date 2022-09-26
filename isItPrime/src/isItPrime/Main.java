package isItPrime;

import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("This program finds the prime numbers.");

		Scanner myNumber = new Scanner(System.in);
		System.out.println("Enter a number greater than 1");

		double userNumber = myNumber.nextDouble();
		double userNumberSquare = Math.sqrt(userNumber);
		int userNumberSquareInteger = (int) Math.ceil(userNumberSquare);

		int numberOfDivisors = 0;

		if (userNumber < 2) {
			System.err.println("Invalid number! The number must be greater than 1");
		} else {
			if (userNumber == (int) userNumber) { // if userNumber is an integer
				for (int i = 2; i <= userNumberSquareInteger; i++) {
					int remainder = (int) userNumber % i;
					if (remainder == 0) {
						numberOfDivisors += 1;
					}
				}
				if (numberOfDivisors == 0) {
					System.out.println((int) userNumber + " is a prime number.");
				} else {
					System.out.println((int) userNumber + " is not a prime number.");
				}
			} else {
				System.err.println("Invalid number! The number must be an integer.");
			}
		}
	}
}
