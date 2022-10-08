package overriding;

public class EntrepreneurCreditManager extends BaseCreditManager{
	public double calculateTotalValue(double value) {
		return value * 1.20;		
	}
}
