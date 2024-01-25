package excellentNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("This program finds the excellent numbers.");
		
		Scanner myNumber = new Scanner(System.in);
		System.out.println("Enter an integer");
		double userNumber = myNumber.nextDouble();
		
		if (userNumber != (int) userNumber) {
			System.err.println("Invalid number! The number must be an integer.");
		}
		else {
			int userHalfNumber = (int)Math.floor(userNumber)/2;
			int sum = 0;
			
			for (int i = 1; i <= userHalfNumber; i++) {
				if (userNumber % i == 0) {
					sum += i; 
				}				
			}
			if (sum == userNumber) {
				System.out.println("Congratulations! " + (int)userNumber + " is an excellent number.");
			}
			else {
				System.out.println((int)userNumber + " is not an excellent number.");
			}
		}
		
	}

}
