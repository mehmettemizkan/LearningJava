package overriding;

public class StudentCreditManager extends BaseCreditManager{
	public double calculateTotalValue(double value) {
		return value * 1.30;		
	}
}
