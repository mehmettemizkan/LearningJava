package employeesSalary;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("This program calculated an employee's gross yearly salary.");

		System.out.println("How many hours do you work per week?");
		Scanner inputHoursWorkPerWeek = new Scanner(System.in);
		double userInputHoursWorkPerWeek = inputHoursWorkPerWeek.nextDouble();

		System.out.println("How much money do you make per hour?");
		Scanner inputMoneyMakePerHour = new Scanner(System.in);
		double userInputMoneyMakePerHour = inputMoneyMakePerHour.nextDouble();

		System.out.println("How many days do you go on vacation per year?");
		Scanner inputVacationDaysPerYear = new Scanner(System.in);
		double userInputVacationDaysPerYear = inputVacationDaysPerYear.nextDouble();

		double grossYearlySalary = (userInputMoneyMakePerHour * userInputHoursWorkPerWeek * 52)
				- (8 * userInputVacationDaysPerYear * userInputMoneyMakePerHour);
		System.out.println("Your gross yearly salary is " + grossYearlySalary);

	}

}
