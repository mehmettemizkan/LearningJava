package mealPriceCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Enter te Meal Price.");
		Scanner mealPrice = new Scanner(System.in);
		double userListedMealPrice = mealPrice.nextDouble();

		System.out.println("Enter te Tip Rate.");
		Scanner tipRate = new Scanner(System.in);
		double userTipRate = tipRate.nextDouble();

		System.out.println("Enter te Tax Rate.");
		Scanner taxRate = new Scanner(System.in);
		double userTaxRate = taxRate.nextDouble();

		double calculatedPrice = Calculate.calculateMealPrice(userListedMealPrice, userTipRate, userTaxRate);
		System.out.println(calculatedPrice);
	}

}
