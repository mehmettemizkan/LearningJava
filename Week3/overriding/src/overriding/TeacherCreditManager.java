package overriding;

public class TeacherCreditManager extends BaseCreditManager{
	
	public double calculateTotalValue(double value) {
		return value * 1.50;		
	}
	
	
}
