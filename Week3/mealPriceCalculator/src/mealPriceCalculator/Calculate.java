package mealPriceCalculator;

public class Calculate {
	public static double calculateMealPrice(double listedMealPrice, double tipRate, double taxRate) {
		double tip = tipRate * listedMealPrice;
		double tax = taxRate * listedMealPrice;
		double totalMealPrice = listedMealPrice + tip + tax;
		return totalMealPrice;
	}
}
