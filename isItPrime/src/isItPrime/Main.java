package isItPrime;

import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("This program finds the prime numbers.");

		Scanner myNumber = new Scanner(System.in);
		System.out.println("Enter an integer number greater than 1");
		
		if (myNumber.hasNextInt()) {
			
			int userNumber = myNumber.nextInt();
			myNumber.close();
	
			double userNumberSquare = Math.sqrt(userNumber);
			int userNumberSquareInteger = (int) Math.ceil(userNumberSquare);
	
			int count = 0;
	
			if (userNumber < 2) {
				System.err.println("Invalid number! The number must be greater than 1");
			} else {
				for (int i = 2; i <= userNumberSquareInteger; i++) {
					if (userNumber % i == 0) {
						System.out.println(userNumber + " is not a prime number.");
						count++;
						break;
					}
				}
				if (count == 0) {
					System.out.println((int) userNumber + " is a prime number.");
				}
			}
		}else {
			System.err.println("Invalid input! Please enter an integer greater than 1.");
		}
	}
}
