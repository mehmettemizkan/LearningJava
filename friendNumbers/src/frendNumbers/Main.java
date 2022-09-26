package frendNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("This program finds the friend numbers.");
		
		Scanner myNumber1 = new Scanner(System.in);
		System.out.println("Enter an integer");
		double userNumber1 = myNumber1.nextDouble();

		Scanner myNumber2 = new Scanner(System.in);
		System.out.println("Enter an integer");
		double userNumber2 = myNumber2.nextDouble();
		
		if (userNumber1 < 1 || userNumber2 < 1) {
			System.err.println("Invalid number! The numbers must be bigger than 0.");
		}

		else if (userNumber1 != (int) userNumber1 || userNumber2 != (int) userNumber2) {
			System.err.println("Invalid number! The numbers must be an integer.");
		}
		
		else {
			int sum1 = 1;
			int sum2 = 1;
			int halfOfUserNumber1 = (int)Math.floor(userNumber1)/2;
			int halfOfUserNumber2 = (int)Math.floor(userNumber2)/2;
			
			for (int i = 2; i <= halfOfUserNumber1; i++) {
				if (userNumber1 % i == 0) {
					sum1 += i;
				}
			}
			for (int i = 2; i <= halfOfUserNumber2; i++) {
				if (userNumber2 % i == 0) {
					sum2 += i;
				}
			}
			if (userNumber1 == sum2 && userNumber2 == sum1) {
				System.out.println((int) userNumber1 + " and " +(int) userNumber2 + " are friend numbers.");
			} else {
				System.out.println("They are not friend numbers.");
			}
		}

	}


}
